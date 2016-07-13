package com.avianca.asl.domain;

import java.io.Serializable;

/**
 * 
 * @author ricardoalmeida
 *
 */

public class RefundCalculation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MsgReturn msg;
	private ValueRefund value;
	/**
	 * @return the msg
	 */
	public MsgReturn getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(MsgReturn msg) {
		this.msg = msg;
	}
	/**
	 * @return the value
	 */
	public ValueRefund getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(ValueRefund value) {
		this.value = value;
	}
	
	
	

}
