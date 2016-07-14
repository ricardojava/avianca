package com.avianca.asl.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

import com.avianca.asl.domain.TicketSearch;
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
	TicketSearch ts;

	@Autowired
	@Qualifier("serviceCommand")
	Command command;

	@GET
	@Path("/ticketsearch/{token}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public String ticketsearch(@PathParam("token") String token, @PathParam("numticket") String numTicket,
			@PathParam("namePax") String namePax, @PathParam("lastName") String lastName,
			@PathParam("numPnr") String numPnr, @PathParam("numVoo") String numVoo, @PathParam("from") String from,
			@PathParam("to") String to, @PathParam("dtavoo") String dtaVoo, @PathParam("hrvoo") String hrVoo) {
		logger.debug(token);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate dta = LocalDate.parse(dtaVoo, format);

		ts.setTo(token);
		ts.setNumTicket(numTicket);
		ts.setNamePax(namePax);
		ts.setLastName(lastName);
		ts.setNumPnr(numPnr);
		ts.setNumVoo(numVoo);
		ts.setFrom(from);
		ts.setTo(to);
		ts.setDtaVoo(dta);
		ts.setHrVoo(hrVoo);

		String msgRetunr = command.execute(ts);

		return msgRetunr;

	}

}
