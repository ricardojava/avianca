package com.avianca.asl.domain;

import java.util.Date;

public class PayData {
	
	
	
	private Date dtaUpdateAtua;
    private int codpay;
    private String descPay;
    private int codRefund;
    private String descRefund;
	/**
	 * @return the dtaUpdateAtua
	 */
	public Date getDtaUpdateAtua() {
		return dtaUpdateAtua;
	}
	/**
	 * @param dtaUpdateAtua the dtaUpdateAtua to set
	 */
	public void setDtaUpdateAtua(Date dtaUpdateAtua) {
		this.dtaUpdateAtua = dtaUpdateAtua;
	}
	/**
	 * @return the codpay
	 */
	public int getCodpay() {
		return codpay;
	}
	/**
	 * @param codpay the codpay to set
	 */
	public void setCodpay(int codpay) {
		this.codpay = codpay;
	}
	/**
	 * @return the descPay
	 */
	public String getDescPay() {
		return descPay;
	}
	/**
	 * @param descPay the descPay to set
	 */
	public void setDescPay(String descPay) {
		this.descPay = descPay;
	}
	/**
	 * @return the codRefund
	 */
	public int getCodRefund() {
		return codRefund;
	}
	/**
	 * @param codRefund the codRefund to set
	 */
	public void setCodRefund(int codRefund) {
		this.codRefund = codRefund;
	}
	/**
	 * @return the descRefund
	 */
	public String getDescRefund() {
		return descRefund;
	}
	/**
	 * @param descRefund the descRefund to set
	 */
	public void setDescRefund(String descRefund) {
		this.descRefund = descRefund;
	}
    
    
    
    

}
