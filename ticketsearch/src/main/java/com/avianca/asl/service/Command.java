package com.avianca.asl.service;

import com.avianca.asl.domain.TicketSearch;
/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

public interface Command {
	
	String execute(TicketSearch ticketSearch);
	

}
