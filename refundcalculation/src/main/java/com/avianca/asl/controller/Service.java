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

import com.avianca.asl.domain.RefundCalculation;
import com.avianca.asl.service.Command;
import com.avianca.asl.service.ServiceCommand;
import com.google.gson.Gson;

/**
 * 
 * @author ricardoalmeida
 *
 */

@Component
@Path("/service")
public class Service {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GET
	@Path("/refundcalculation/{token}/{typedoc}/{numdoc}/{numemd}/{codmotivorefund}")
	@Produces(value = MediaType.APPLICATION_JSON)
	public String refundCalculation(@PathParam("token") String token,
			                        @PathParam("typedoc") String typeDoc,
			                        @PathParam("numdoc") String numDoc,
			                        @PathParam("numemd") String numEmd,
			                        @PathParam("codmotivorefund") String codMotivoRefund){
		logger.debug(token);
		
		Command command = new ServiceCommand();
		
		
		
		List<RefundCalculation> refundCalculation = command.execute(token,typeDoc,numDoc,numEmd,codMotivoRefund);
		
		Gson gson = new Gson();
		
		
		return gson.toJson(refundCalculation);
		
		
		
	}

}
