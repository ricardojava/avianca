package com.avianca.asl.domain;

import org.springframework.stereotype.Component;
/**
 * 
 * @author ricardoalmeida
 *
 */
@Component
public class ValidOperation {
	
	private int id;
	private String validOfficeid;
	private boolean validityTicket;
	private DetailPaxFlight detailPaxFligth;
	
	/**
	 * @return the detailFligth
	 */
	public DetailPaxFlight getDetailFligth() {
		return detailPaxFligth;
	}
	/**
	 * @param detailFligth the detailFligth to set
	 */
	public void setDetailFligth(DetailPaxFlight detailPaxFligth) {
		this.detailPaxFligth = detailPaxFligth;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the validOfficeid
	 */
	public String getValidOfficeid() {
		return validOfficeid;
	}
	/**
	 * @param validOfficeid the validOfficeid to set
	 */
	public void setValidOfficeid(String validOfficeid) {
		this.validOfficeid = validOfficeid;
	}
	/**
	 * @return the validityTicket
	 */
	public boolean isValidityTicket() {
		return validityTicket;
	}
	/**
	 * @param validityTicket the validityTicket to set
	 */
	public void setValidityTicket(boolean validityTicket) {
		this.validityTicket = validityTicket;
	}
	
	

}
