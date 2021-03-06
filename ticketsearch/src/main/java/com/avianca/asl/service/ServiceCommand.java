package com.avianca.asl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.avianca.asl.domain.MsgReturn;
import com.avianca.asl.domain.TicketSearch;
import com.avianca.asl.roles.business.CreateJsonResponse;
import com.avianca.asl.roles.business.Rules;

/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */


@Component(value="serviceCommand")
public class ServiceCommand implements Command {

@Autowired	
private Rules rules;

@Autowired
private MsgReturn msg;
	
	@Override
	public String execute(TicketSearch ticketSearch) {
		// TODO Auto-generated method stub

		//MsgReturn msg = new MsgReturn();

		CreateJsonResponse json = null;

		//Rules rules = new Rules();
		rules.fildIsEmpity(ticketSearch.getToken());
		
		

		if (rules.validToken(ticketSearch.getToken())) {

			json = new CreateJsonResponse(msg);

			return json.jsonReturn();

		} else {
			json = new CreateJsonResponse(msg);

			return json.jsonReturnErrro();
		}

	}

	

}
