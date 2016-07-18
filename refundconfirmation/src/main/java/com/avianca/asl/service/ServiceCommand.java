package com.avianca.asl.service;

import org.springframework.stereotype.Component;

import com.avianca.asl.domain.MsgReturn;
import com.avianca.asl.domain.RefundConfirmation;
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

	

	@Override
	public String execute(RefundConfirmation confirmation) {
		// TODO Auto-generated method stub

		MsgReturn msg = new MsgReturn();

		CreateJsonResponse json = null;

		Rules rules = new Rules();
		rules.fildIsEmpity(confirmation.getToken());

		if (rules.validToken(confirmation.getToken())) {

			json = new CreateJsonResponse(msg);

			return json.jsonReturn();

		} else {
			json = new CreateJsonResponse(msg);

			return json.jsonReturnErrro();
		}

	}

	

}
