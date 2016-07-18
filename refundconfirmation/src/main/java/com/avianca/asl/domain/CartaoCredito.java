package com.avianca.asl.domain;

import java.time.LocalDate;

public class CartaoCredito {
	
	public enum Bandeira{
	VISA,MASTER_CARD,ALELO,AMERICAN_EXPRESS;
	}
	
	
	private int numCartao;
	private LocalDate vencimento;
	Bandeira bandeira;
	
	public CartaoCredito(Bandeira bandeira){
		this.bandeira=bandeira;
	}

	/**
	 * @return the numCartao
	 */
	public int getNumCartao() {
		return numCartao;
	}

	/**
	 * @param numCartao the numCartao to set
	 */
	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}

	/**
	 * @return the vencimento
	 */
	public LocalDate getVencimento() {
		return vencimento;
	}

	/**
	 * @param vencimento the vencimento to set
	 */
	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	/**
	 * @return the bandeira
	 */
	public Bandeira getBandeira() {
		return bandeira;
	}
	
	
	

}
