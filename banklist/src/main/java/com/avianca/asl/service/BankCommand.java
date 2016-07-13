package com.avianca.asl.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.avianca.asl.domain.Bank;

/**
 * 
 * @author ricardoalmeida
 *
 */

public class BankCommand implements Command{

	@Override
	public String execute(Serializable pojo) {
		// TODO Auto-generated method stub
	
		
		return null;
	}

	@Override
	public List<Bank> execute(String token) {
		// TODO Auto-generated method stub
		
		List<Bank> prioritybanklist = new ArrayList<Bank>();
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		Bank b3 = new Bank();
		
		b1.setCodBank(101);
		b2.setCodBank(202);
		b3.setCodBank(303);
		
		b1.setNameBank("Itaú");
		b2.setNameBank("Bradesco");
		b3.setNameBank("Caixa Economica Federal");
		
		prioritybanklist.add(b1);
		prioritybanklist.add(b2);
		prioritybanklist.add(b3);		
		
		            
				
		return Collections.unmodifiableList(prioritybanklist);
	}

}
