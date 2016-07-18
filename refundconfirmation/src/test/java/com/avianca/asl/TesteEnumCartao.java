package com.avianca.asl;

import com.avianca.asl.domain.CartaoCredito;
import com.avianca.asl.domain.CartaoCredito.Bandeira;

public class TesteEnumCartao {
	
	public static void main(String[] args) {
		CartaoCredito cc = new CartaoCredito(Bandeira.VISA);
		
		System.out.println(cc.getBandeira());
		
	}

}
