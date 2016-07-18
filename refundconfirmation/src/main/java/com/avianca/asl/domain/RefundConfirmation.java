package com.avianca.asl.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ricardoalmeida
 *
 */
@Component
public class RefundConfirmation {
	private String token;
	private String typeDoc;
	private String numDoc;
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
	 * @return the typeDoc
	 */
	public String getTypeDoc() {
		return typeDoc;
	}
	/**
	 * @param typeDoc the typeDoc to set
	 */
	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}
	/**
	 * @return the numDoc
	 */
	public String getNumDoc() {
		return numDoc;
	}
	/**
	 * @param numDoc the numDoc to set
	 */
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	
	
	
	

}
