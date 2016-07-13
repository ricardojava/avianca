package com.avianca.asl.service;

import org.springframework.stereotype.Component;

import com.avianca.asl.domain.FilterRefund;
import com.avianca.asl.domain.MsgReturn;
import com.avianca.asl.roles.business.CreateJsonResponse;

/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

@Component(value="serviceCommand")
public class ServiceCommand implements Command {

	

	

	@Override
	public String execute(String token) {
		
		MsgReturn msg = new MsgReturn();

		CreateJsonResponse json = null;

		com.avianca.asl.roles.business.Rules rules = new com.avianca.asl.roles.business.Rules();
		rules.fildIsEmpity(token);

		if (rules.validToken(token)) {

			json = new CreateJsonResponse(msg);

			return json.jsonReturn();

		} else {
			json = new CreateJsonResponse(msg);

			return json.jsonReturnErrro();
		}

	}

	@Override
	public String execute(FilterRefund filterRefund) {
		MsgReturn msg = new MsgReturn();

		CreateJsonResponse json = null;

		com.avianca.asl.roles.business.Rules rules = new com.avianca.asl.roles.business.Rules();
		rules.fildIsEmpity(filterRefund.getToken());

		if (rules.validToken(filterRefund.getToken())) {

			json = new CreateJsonResponse(msg);

			return json.jsonReturn();

		} else {
			json = new CreateJsonResponse(msg);

			return json.jsonReturnErrro();
		}
	}



	

}
