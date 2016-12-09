package com.quote.poc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quote.poc.models.User;
import com.quote.poc.models.UserDao;

@RestController
@RequestMapping("/rest")
public class MainRestController {

	 @Autowired
	  private UserDao userDao;
	
	 @RequestMapping("/create")
	    @ResponseBody	
     public String create(String email, String name) {
	        User user = null;
	        try {
	          user = new User(email, name);
			userDao.save(user);
	        }
	        catch (Exception ex) {
	          return "Error creating the user: " + ex.toString();
	        }
	        return "User succesfully created! (id = " + user.getId() + ")";
	      }
	 
	
	
}
