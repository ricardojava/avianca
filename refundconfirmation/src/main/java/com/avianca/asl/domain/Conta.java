package com.avianca.asl.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ricardoalmeida
 *
 */
@Component
public class Conta {
	//enum CTA_CORRENTE,CTA_POUPANCA;
	private int codBanco;
	private String nameBanco;
	private String agencia;
	private String numConta;
	private String digito;
	
	TypeConta typeConta;
	

}
