package com.quote.poc.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "quoteinfo")
public class QuoteInfo {
	
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long quoteid;
	  
	  @NotNull
	  private String from_dealerid;
	  
	  @NotNull
	  private String to_dealerid;
	  
	  @NotNull
	  private Date quote_create_date;
	  
	  @NotNull
	  private Date quote_due_date;
	  
	  @NotNull
	  private String quote_status;
	  
	  public QuoteInfo() { }

	

	public long getQuoteid() {
		return quoteid;
	}



	public void setQuoteid(long quoteid) {
		this.quoteid = quoteid;
	}



	public String getFrom_dealerid() {
		return from_dealerid;
	}

	public void setFrom_dealerid(String from_dealerid) {
		this.from_dealerid = from_dealerid;
	}

	public String getTo_dealerid() {
		return to_dealerid;
	}

	public void setTo_dealerid(String to_dealerid) {
		this.to_dealerid = to_dealerid;
	}

	public Date getQuote_create_date() {
		return quote_create_date;
	}

	public void setQuote_create_date(Date quote_create_date) {
		this.quote_create_date = quote_create_date;
	}

	public Date getQuote_due_date() {
		return quote_due_date;
	}

	public void setQuote_due_date(Date quote_due_date) {
		this.quote_due_date = quote_due_date;
	}

	public String getQuote_status() {
		return quote_status;
	}

	public void setQuote_status(String quote_status) {
		this.quote_status = quote_status;
	} 
	  
	  
	  
	  

}
