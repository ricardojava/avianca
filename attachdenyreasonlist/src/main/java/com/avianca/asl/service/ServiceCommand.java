package com.avianca.asl.service;

import com.avianca.asl.domain.MsgReturn;
import com.avianca.asl.roles.business.CreateJsonResponse;
import com.avianca.asl.roles.business.Rules;

/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

public class ServiceCommand implements Command {

	@Override
	public String execute(String token, String param2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String execute(String token, String param2, String param3) {
		// TODO Auto-generated method stub

		MsgReturn msg = new MsgReturn();

		CreateJsonResponse json = null;

		Rules rules = new Rules();
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
	public String execute(String token, String param2, String param3, String param4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String execute(String token, String param2, String param3, String param4, String param5) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public String execute(String token) {
		
		MsgReturn msg = new MsgReturn();

		CreateJsonResponse json = null;

		Rules rules = new Rules();
		rules.fildIsEmpity(token);

		if (rules.validToken(token)) {

			json = new CreateJsonResponse(msg);

			return json.jsonReturn();

		} else {
			json = new CreateJsonResponse(msg);

			return json.jsonReturnErrro();
		}
	}

}
