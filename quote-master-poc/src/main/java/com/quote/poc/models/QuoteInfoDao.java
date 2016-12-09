package com.quote.poc.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface QuoteInfoDao extends CrudRepository<QuoteInfo, Long>  {
	
	
	  public QuoteInfo findQuoteInfoByquoteid(long quote_id);
	

}
