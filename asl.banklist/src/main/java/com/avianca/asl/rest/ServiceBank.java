package com.avianca.asl.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.avianca.asl.domain.Bank;
import com.avianca.asl.service.BankCommand;
import com.avianca.asl.service.Command;
import com.google.gson.Gson;

/**
 * 
 * @author ricardoalmeida
 *
 */

@Component
@Path("/servicelistbank")
public class ServiceBank {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GET
	@Path("/prioritylist/{token}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public String banklist(@PathParam("token") String token){
		logger.debug(token);
		
		Command command = new BankCommand();
		
		
		
		List<Bank> banks = command.execute(token);
		
		Gson gson = new Gson();
		
		
		return gson.toJson(banks);
		
		
		
	}

}
