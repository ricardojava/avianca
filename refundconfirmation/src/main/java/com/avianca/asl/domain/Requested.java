package com.avianca.asl.domain;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ricardoalmeida
 *
 */
@Component
public class Requested {
	
	private String user;//Usuário solicitante (pax, agente Call Center)
	private int codMot;//Código do Motivo do Reembolso
	private int numPnr;//Número do PNR
	private BigDecimal valuePenalidade;//Valor das Penalidades
	private BigDecimal valueTotal;//Valor Total do Reembolso
	private int codTicketDoble;//Código Bilhete Duplicad
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the codMot
	 */
	public int getCodMot() {
		return codMot;
	}
	/**
	 * @param codMot the codMot to set
	 */
	public void setCodMot(int codMot) {
		this.codMot = codMot;
	}
	/**
	 * @return the numPnr
	 */
	public int getNumPnr() {
		return numPnr;
	}
	/**
	 * @param numPnr the numPnr to set
	 */
	public void setNumPnr(int numPnr) {
		this.numPnr = numPnr;
	}
	/**
	 * @return the valuePenalidade
	 */
	public BigDecimal getValuePenalidade() {
		return valuePenalidade;
	}
	/**
	 * @param valuePenalidade the valuePenalidade to set
	 */
	public void setValuePenalidade(BigDecimal valuePenalidade) {
		this.valuePenalidade = valuePenalidade;
	}
	/**
	 * @return the valueTotal
	 */
	public BigDecimal getValueTotal() {
		return valueTotal;
	}
	/**
	 * @param valueTotal the valueTotal to set
	 */
	public void setValueTotal(BigDecimal valueTotal) {
		this.valueTotal = valueTotal;
	}
	/**
	 * @return the codTicketDoble
	 */
	public int getCodTicketDoble() {
		return codTicketDoble;
	}
	/**
	 * @param codTicketDoble the codTicketDoble to set
	 */
	public void setCodTicketDoble(int codTicketDoble) {
		this.codTicketDoble = codTicketDoble;
	}
	
	
	
	

}
