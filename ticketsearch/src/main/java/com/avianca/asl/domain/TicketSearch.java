package com.avianca.asl.domain;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class TicketSearch {
	
	
	
	
	private String token;
	private String numTicket;
	private String namePax;
	private String lastName;
	private String numPnr;
	private String numVoo;
	private String from;
	private String to;
	private LocalDate dtaVoo;
	/**
	 * @return the dtaVoo
	 */
	public LocalDate getDtaVoo() {
		return dtaVoo;
	}
	/**
	 * @param dtaVoo the dtaVoo to set
	 */
	public void setDtaVoo(LocalDate dtaVoo) {
		this.dtaVoo = dtaVoo;
	}
	private String hrVoo;
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
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
	/**
	 * @return the namePax
	 */
	public String getNamePax() {
		return namePax;
	}
	/**
	 * @param namePax the namePax to set
	 */
	public void setNamePax(String namePax) {
		this.namePax = namePax;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the numPnr
	 */
	public String getNumPnr() {
		return numPnr;
	}
	/**
	 * @param numPnr the numPnr to set
	 */
	public void setNumPnr(String numPnr) {
		this.numPnr = numPnr;
	}
	/**
	 * @return the numVoo
	 */
	public String getNumVoo() {
		return numVoo;
	}
	/**
	 * @param numVoo the numVoo to set
	 */
	public void setNumVoo(String numVoo) {
		this.numVoo = numVoo;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	
	
	/**
	 * @return the hrVoo
	 */
	public String getHrVoo() {
		return hrVoo;
	}
	/**
	 * @param hrVoo the hrVoo to set
	 */
	public void setHrVoo(String hrVoo) {
		this.hrVoo = hrVoo;
	}
	
	
	
	
	

}
