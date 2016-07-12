package com.avianca.asl.domain;

import java.io.Serializable;
/**
 * 
 * @author ricardoalmeida
 *
 */

public class Bank implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private int codBank;
	private String nameBank;
	
	public int getCodBank() {
		return codBank;
	}
	public void setCodBank(int codBank) {
		this.codBank = codBank;
	}
	public String getNameBank() {
		return nameBank;
	}
	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}
	
	
	
}
