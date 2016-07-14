package com.avianca.asl;

import com.avianca.asl.domain.Coming;
import com.avianca.asl.domain.DetailPaxFlight;
import com.avianca.asl.domain.Fligth;
import com.avianca.asl.domain.Going;
import com.avianca.asl.domain.MsgReturn;
import com.google.gson.Gson;

public class TesteJSON {
	
	
	public static void main(String[] args) {
		
		
		MsgReturn ticketsearch = new MsgReturn();
		ticketsearch.setCodMsg(0);
		ticketsearch.setMsg("OK");
		
		
		DetailPaxFlight  dpf = new DetailPaxFlight();
		dpf.setNamePax("teste");
		dpf.setLastName("dadafddafd");
		
		Fligth voo = new Fligth();
		
		Going ida = new Going();
		ida.setCity("Brasil");
		
		Coming chegada = new Coming();
		chegada.setCity("New York");
		
		voo.setGoing(ida);
		voo.setComing(chegada);
		
		dpf.setFligth(voo);
		
		ticketsearch.setDetailsPaxFlight(dpf);
		
		Gson gson = new Gson();
		//gson.j
		
		System.out.println(gson.toJson(ticketsearch));
		
		
		
	}

}
