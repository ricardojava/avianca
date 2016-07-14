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
	private String encodingImg;
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
	 * @return the encodingImg
	 */
	public String getEncodingImg() {
		return encodingImg;
	}
	/**
	 * @param encodingImg the encodingImg to set
	 */
	public void setEncodingImg(String encodingImg) {
		this.encodingImg = encodingImg;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
