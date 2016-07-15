package com.avianca.asl.service;

import java.util.List;

import com.avianca.asl.domain.RefundSearch;
/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

public interface Command {
	
	String execute(RefundSearch refundSearch);
	

}
