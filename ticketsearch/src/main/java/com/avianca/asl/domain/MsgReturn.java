package com.avianca.asl.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

public class MsgReturn implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codMsg;
	private String msg;
	
	private ValidOperation validOperation;
	
	private DetailPaxFlight detailPaxFlight;
	
	private Fligth fligth;

	/**
	 * @return the codMsg
	 */
	public int getCodMsg() {
		return codMsg;
	}

	/**
	 * @param codMsg the codMsg to set
	 */
	public void setCodMsg(int codMsg) {
		this.codMsg = codMsg;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the validOperation
	 */
	public ValidOperation getValidOperation() {
		return validOperation;
	}

	/**
	 * @param validOperation the validOperation to set
	 */
	public void setValidOperation(ValidOperation validOperation) {
		this.validOperation = validOperation;
	}

	/**
	 * @return the detailsPaxFlight
	 */
	public DetailPaxFlight getDetailsPaxFlight() {
		return detailPaxFlight;
	}

	/**
	 * @param detailsPaxFlight the detailsPaxFlight to set
	 */
	public void setDetailsPaxFlight(DetailPaxFlight detailPaxFlight) {
		this.detailPaxFlight = detailPaxFlight;
	}

	/**
	 * @return the fligth
	 */
	public Fligth getFligth() {
		return fligth;
	}

	/**
	 * @param fligth the fligth to set
	 */
	public void setFligth(Fligth fligth) {
		this.fligth = fligth;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
