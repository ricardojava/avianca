package com.avianca.asl.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.avianca.asl.roles.business.CreateJsonResponse;
import com.avianca.asl.service.Command;
import com.avianca.asl.service.ServiceCommand;
import com.google.gson.Gson;

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
	
	@GET
	@Path("//{token}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public String (@PathParam("token") String token,@PathParam("numsolici") String numSolici,@PathParam("typeticket") String typeTicket){
		logger.debug(token);
		
		
		
		
		String  msgRetunr = command.execute(token);
		
		
		
		return msgRetunr;
		
		
		
	}

}
