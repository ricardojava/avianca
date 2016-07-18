package com.avianca.asl.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.avianca.asl.domain.RefundConfirmation;
import com.avianca.asl.service.Command;

/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

@Controller
@Path("/service")
public class Service {
	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("serviceCommand")
	Command command ;
	
	@Autowired
	RefundConfirmation confirmation;
	
	@GET
	@Path("/refundsearch/{token}/{numsolici}/{typeticket}/{numticket}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public String refundsearch(@PathParam("token") String token,			                   
			                   @PathParam("typedoc") String typeDoc,
			                   @PathParam("numdoc") String numDoc){
		
		
		logger.debug(token);
		
		confirmation.setToken(token);
		confirmation.setTypeDoc(typeDoc);
		confirmation.setNumDoc(numDoc);
		
		
		String  msgRetunr = command.execute(confirmation);
		
		
		
		return msgRetunr;
		
		
		
	}

}
