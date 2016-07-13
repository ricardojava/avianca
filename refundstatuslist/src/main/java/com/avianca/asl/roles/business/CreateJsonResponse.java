package com.avianca.asl.roles.business;

import java.util.ArrayList;
import java.util.List;

import com.avianca.asl.domain.MsgReturn;
import com.avianca.asl.domain.History;
import com.google.gson.Gson;




/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */



public class CreateJsonResponse {
	private Gson gson;
	private MsgReturn msgReturn;
	private String token;

	public CreateJsonResponse(MsgReturn msgReturn) {
		super();
		this.msgReturn = msgReturn;
		gson = new Gson();
	}
	
	
	
	public CreateJsonResponse(String token) {
		super();
		this.token = token;
		gson = new Gson();
	}
	
	public String jsonReturn(){
		
		/* vai na regra de negocios
		   valia carrega a lista de status
		*/
		List listaStatus = new ArrayList();
		
		msgReturn.setCodMsg(0);
		msgReturn.setMsg("Bilhete informado não pertence ao Nº de Solicitação.");
		msgReturn.setStatusList(new ArrayList<>());
		
		
		
		for (Object object : listaStatus) {
			History s1 = new History();
			
			msgReturn.getStatusList().add(s1);
			
		}	
		
		return gson.toJson(msgReturn);
		
	}
	
	public String jsonReturnErrro(){
		
		msgReturn.setCodMsg(1);
		msgReturn.setMsg("Erro.");		
		
		return gson.toJson(msgReturn);
		
	}

}
