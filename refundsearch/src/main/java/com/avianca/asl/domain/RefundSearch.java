package com.avianca.asl.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ricardoalmeida
 *
 */
@Component
public class RefundSearch {

	private String token;
	private String numSoli;
	private String typeTicket;
	private String numTicket;
	/**
	 * @return the toke
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param toke the toke to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	/**
	 * @return the numSoli
	 */
	public String getNumSoli() {
		return numSoli;
	}
	/**
	 * @param numSoli the numSoli to set
	 */
	public void setNumSoli(String numSoli) {
		this.numSoli = numSoli;
	}
	/**
	 * @return the typeTicket
	 */
	public String getTypeTicket() {
		return typeTicket;
	}
	/**
	 * @param typeTicket the typeTicket to set
	 */
	public void setTypeTicket(String typeTicket) {
		this.typeTicket = typeTicket;
	}
	/**
	 * @return the numTicket
	 */
	public String getNumTicket() {
		return numTicket;
	}
	/**
	 * @param numTicket the numTicket to set
	 */
	public void setNumTicket(String numTicket) {
		this.numTicket = numTicket;
	}
	
	

}
