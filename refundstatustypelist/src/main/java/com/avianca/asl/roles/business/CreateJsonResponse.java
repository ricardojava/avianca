package com.avianca.asl.roles.business;

import java.util.ArrayList;
import java.util.List;

import com.avianca.asl.domain.MsgReturn;
import com.avianca.asl.domain.Status;
import com.google.gson.Gson;

public class CreateJsonResponse {
	
	private MsgReturn refundStatusTypeList;
	private String token;

	public CreateJsonResponse(MsgReturn refundStatusTypeList) {
		super();
		this.refundStatusTypeList = refundStatusTypeList;
	}
	
	
	
	public CreateJsonResponse(String token) {
		super();
		this.token = token;
	}
	
	public String jsonReturn(){
		
		/* vai na regra de negocios
		   valia carrega a lista de status
		*/
		List listaStatus = new ArrayList();
		
		refundStatusTypeList.setCodMsg(0);
		refundStatusTypeList.setMsg("Bilhete informado não pertence ao Nº de Solicitação.");
		refundStatusTypeList.setStatusList(new ArrayList<>());
		
		
		
		for (Object object : listaStatus) {
			Status s1 = new Status();
			s1.setCodStatus(101);
			s1.setDesc("Descrição do Status 1Descrição do Status 1");
			refundStatusTypeList.getStatusList().add(s1);
			
		}		
		
		
        Gson gson = new Gson();
		
		
		return gson.toJson(refundStatusTypeList);
		
	}

}
