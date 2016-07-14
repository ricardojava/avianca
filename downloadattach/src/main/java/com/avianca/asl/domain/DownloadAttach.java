package com.avianca.asl.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ricardoalmeida
 *
 */

@Component
public class DownloadAttach {
	
	  private String token;
	  private String numSolici;
	  private String typeTicket;
	  private String numTicket;
	  private String idAttach;
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
	 * @return the numSolici
	 */
	public String getNumSolici() {
		return numSolici;
	}
	/**
	 * @param numSolici the numSolici to set
	 */
	public void setNumSolici(String numSolici) {
		this.numSolici = numSolici;
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
	/**
	 * @return the idAttach
	 */
	public String getIdAttach() {
		return idAttach;
	}
	/**
	 * @param idAttach the idAttach to set
	 */
	public void setIdAttach(String idAttach) {
		this.idAttach = idAttach;
	}
	  
	  
	  
	  

}
