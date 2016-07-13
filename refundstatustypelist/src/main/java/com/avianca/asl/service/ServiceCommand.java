package com.avianca.asl.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.avianca.asl.domain.MsgReturn;
import com.avianca.asl.roles.business.CreateJsonResponse;
import com.avianca.asl.roles.business.Rules;

/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

public class ServiceCommand implements Command{


	

	@Override
	public String execute(String param1, String param2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String execute(String param1, String param2, String param3) {
		List serviceReturn = new ArrayList();
		
		
        
		
		return null;
	}

	@Override
	public String execute(String param1, String param2, String param3, String param4) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String execute(String param1, String param2, String param3, String param4,String param5) {
		// TODO Auto-generated method stub
		
		List refundCalculation = new ArrayList();
				
		
		            
				
		return null;
	}

	@Override
	public String execute(String token) {
		// TODO Auto-generated method stub
		
		MsgReturn msg = new MsgReturn();
		
		Rules rules = new Rules();
		rules.fildIsEmpity(token);
		rules.validToken(token);
		
		
		CreateJsonResponse refundStatusTypeList = new CreateJsonResponse(msg);
		
		
		return refundStatusTypeList.jsonReturn();
	}

}
