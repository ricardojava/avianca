package com.avianca.asl.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

import com.avianca.asl.domain.FilterRefund;
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
	private FilterRefund fr;
	
	@Autowired
	@Qualifier("serviceCommand")
	Command command ;
	
	@GET
	@Path("/filterrefundlist/{token}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public String filterrefundlist(@PathParam("token") String token,
								   @PathParam("typeticket") String typeTicket,
								   @PathParam("numticket") String numTicket,
								   @PathParam("numra") String numRa,
								   @PathParam("namepax") String namePax,
								   @PathParam("lastnamepax") String lastNamePax,
								   @PathParam("periodIni") String periodIni,
								   @PathParam("periodend") String periodEnd){
		logger.debug(token);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate dtaIni = LocalDate.parse(periodIni, format);
		LocalDate dtaEnd = LocalDate.parse(periodEnd, format);
		
		
		fr.setToken(token);
		fr.setTypeTicket(typeTicket);
		fr.setNumTicket(numTicket);
		fr.setNumRa(numRa);
		fr.setNamePax(namePax);
		fr.setLastNamePax(lastNamePax);		
		fr.setPeriodIni(dtaIni);
		fr.setPeriodEnd(dtaEnd);
		
		
		
		String  msgRetunr = command.execute(fr);
		
		
		
		return msgRetunr;
		
		
		
	}

}
