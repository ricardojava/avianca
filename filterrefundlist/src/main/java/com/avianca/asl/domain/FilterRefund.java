package com.avianca.asl.domain;

import java.time.LocalDate;

public class FilterRefund {

	private String token;
	private String typeTicket;
	private String numTicket;
	private String numRa;
	private String namePax;
	private String lastNamePax;
	private LocalDate periodIni;
	private LocalDate periodEnd;
	private int codStatus;

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the typeTicket
	 */
	public String getTypeTicket() {
		return typeTicket;
	}

	/**
	 * @param typeTicket
	 *            the typeTicket to set
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
	 * @param numTicket
	 *            the numTicket to set
	 */
	public void setNumTicket(String numTicket) {
		this.numTicket = numTicket;
	}

	/**
	 * @return the numRa
	 */
	public String getNumRa() {
		return numRa;
	}

	/**
	 * @param numRa
	 *            the numRa to set
	 */
	public void setNumRa(String numRa) {
		this.numRa = numRa;
	}

	/**
	 * @return the namePax
	 */
	public String getNamePax() {
		return namePax;
	}

	/**
	 * @param namePax
	 *            the namePax to set
	 */
	public void setNamePax(String namePax) {
		this.namePax = namePax;
	}

	/**
	 * @return the lastNamePax
	 */
	public String getLastNamePax() {
		return lastNamePax;
	}

	/**
	 * @param lastNamePax
	 *            the lastNamePax to set
	 */
	public void setLastNamePax(String lastNamePax) {
		this.lastNamePax = lastNamePax;
	}

	/**
	 * @return the periodoIni
	 */
	public LocalDate getPeriodIni() {
		return periodIni;
	}

	/**
	 * @param periodoIni
	 *            the periodoIni to set
	 */
	public void setPeriodIni(LocalDate periodIni) {
		this.periodIni = periodIni;
	}

	/**
	 * @return the periodoEnd
	 */
	public LocalDate getPeriodEnd() {
		return periodEnd;
	}

	/**
	 * @param periodoEnd
	 *            the periodoEnd to set
	 */
	public void setPeriodEnd(LocalDate periodEnd) {
		this.periodEnd = periodEnd;
	}

	/**
	 * @return the codStatus
	 */
	public int getCodStatus() {
		return codStatus;
	}

	/**
	 * @param codStatus
	 *            the codStatus to set
	 */
	public void setCodStatus(int codStatus) {
		this.codStatus = codStatus;
	}

}
