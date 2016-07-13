package com.avianca.asl.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.avianca.asl.domain.RefundCalculation;

/**
 * 
 * @author ricardoalmeida
 *
 */

public class ServiceCommand implements Command{


	@Override
	public List<RefundCalculation> execute(String token,String typeDoc,String numDoc,String numEmd,String codMotivoRefund) {
		// TODO Auto-generated method stub
		
		List<RefundCalculation> refundCalculation = new ArrayList<RefundCalculation>();
				
		
		            
				
		return Collections.unmodifiableList(refundCalculation);
	}

}
