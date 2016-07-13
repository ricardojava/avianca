package com.avianca.asl.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.avianca.asl.service.Command;
import com.avianca.asl.service.ServiceCommand;
import com.google.gson.Gson;

/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

@Component
@Path("/service")
public class Service {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GET
	@Path("/refundconfirmation/{token}/{typeticket}/{numticket}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public String refundCalculation(@PathParam("token") String token,
			                        @PathParam("typeticket") String typeTicket,
			                        @PathParam("numticket") String numTicket){
		logger.debug(token);
		
		Command command = new ServiceCommand();
		
		
		
		List  refundCalculation = command.execute(token,typeTicket,numTicket);
		
		Gson gson = new Gson();
		
		
		return gson.toJson(refundCalculation);
		
		
		
	}

}
