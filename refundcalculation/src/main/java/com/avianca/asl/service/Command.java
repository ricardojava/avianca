package com.avianca.asl.service;

import java.io.Serializable;
import java.util.List;

import com.avianca.asl.domain.RefundCalculation;

public interface Command {
	
	
	List<RefundCalculation> execute(String token,String typeDoc,String numDoc,String numEmd,String codMotivoRefund);
	

}
