package com.avianca.asl.domain;

import java.util.Date;

public class History {

	private int id;
	private int cod;
	private String desc;
	private Date dtaAtua;
	private String userAtua;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cod
	 */
	public int getCod() {
		return cod;
	}

	/**
	 * @param cod
	 *            the cod to set
	 */
	public void setCod(int cod) {
		this.cod = cod;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc
	 *            the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the dtaAtua
	 */
	public Date getDtaAtua() {
		return dtaAtua;
	}

	/**
	 * @param dtaAtua
	 *            the dtaAtua to set
	 */
	public void setDtaAtua(Date dtaAtua) {
		this.dtaAtua = dtaAtua;
	}

	/**
	 * @return the userAtua
	 */
	public String getUserAtua() {
		return userAtua;
	}

	/**
	 * @param userAtua
	 *            the userAtua to set
	 */
	public void setUserAtua(String userAtua) {
		this.userAtua = userAtua;
	}

}
