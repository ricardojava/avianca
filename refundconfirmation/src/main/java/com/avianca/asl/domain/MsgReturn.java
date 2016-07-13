package com.avianca.asl.domain;

import java.io.Serializable;

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
	
	
	

}
