package com.quote.poc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quote.poc.models.QuoteInfo;
import com.quote.poc.models.QuoteInfoDao;

@RestController
@RequestMapping("/quote")
public class QuoteController {
	
	@Autowired(required = true)
	private QuoteInfoDao quoteInfoDao ;
	
	 @RequestMapping("/getQuotesAll")
	  @ResponseBody	
	  public Iterable<QuoteInfo> getQutoeAll(String quoteid) {
		 return quoteInfoDao.findAll();
		 }
	
  @RequestMapping("/getQuoteById")
  @ResponseBody	
  public QuoteInfo getQutoeInfo(long quoteid) {
		 	 return quoteInfoDao.findQuoteInfoByquoteid(quoteid);
	 }
  

}
