package com.avianca.asl.domain;

public enum TypeContaPay {
	
	//corrente/poupança, cartão crédito, ordem de pagamento, conta no estrangeiro)
	/*mapear conta no fora do brasil*/
	
	CT_CORRENTE(1),CRT_CREDITO(2),RDM_PAY(3)/*,C_OUTHER_COUNTRY(4)*/;
	
	private int codConta;
	
	TypeContaPay(int codConta){
		this.codConta=codConta;
	}
	
}
