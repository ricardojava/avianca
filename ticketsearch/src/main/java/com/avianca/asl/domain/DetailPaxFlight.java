package com.avianca.asl.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 
 * @author ricardoalmeida
 *
 */

@Component
public class DetailPaxFlight {
	
	
    private String typeTicket;
    private String numTicket;
    private String typePax;
    private String namePax;
    private String lastName;
    private String statusAmadeus;
    private String statusRefund;
    private String typePayment;
    private LocalDate dtapurchase;
    private String officeidvenda;
    private BigDecimal payvalue;
    private BigDecimal taxvalue;
    private BigDecimal totalvalue;
    private List fligthList;
    
    private Fligth fligth;

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
	 * @return the typePax
	 */
	public String getTypePax() {
		return typePax;
	}

	/**
	 * @param typePax the typePax to set
	 */
	public void setTypePax(String typePax) {
		this.typePax = typePax;
	}

	/**
	 * @return the namePax
	 */
	public String getNamePax() {
		return namePax;
	}

	/**
	 * @param namePax the namePax to set
	 */
	public void setNamePax(String namePax) {
		this.namePax = namePax;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the statusAmadeus
	 */
	public String getStatusAmadeus() {
		return statusAmadeus;
	}

	/**
	 * @param statusAmadeus the statusAmadeus to set
	 */
	public void setStatusAmadeus(String statusAmadeus) {
		this.statusAmadeus = statusAmadeus;
	}

	/**
	 * @return the statusRefund
	 */
	public String getStatusRefund() {
		return statusRefund;
	}

	/**
	 * @param statusRefund the statusRefund to set
	 */
	public void setStatusRefund(String statusRefund) {
		this.statusRefund = statusRefund;
	}

	/**
	 * @return the typePayment
	 */
	public String getTypePayment() {
		return typePayment;
	}

	/**
	 * @param typePayment the typePayment to set
	 */
	public void setTypePayment(String typePayment) {
		this.typePayment = typePayment;
	}

	/**
	 * @return the dtapurchase
	 */
	public LocalDate getDtapurchase() {
		return dtapurchase;
	}

	/**
	 * @param dtapurchase the dtapurchase to set
	 */
	public void setDtapurchase(LocalDate dtapurchase) {
		this.dtapurchase = dtapurchase;
	}

	/**
	 * @return the officeidvenda
	 */
	public String getOfficeidvenda() {
		return officeidvenda;
	}

	/**
	 * @param officeidvenda the officeidvenda to set
	 */
	public void setOfficeidvenda(String officeidvenda) {
		this.officeidvenda = officeidvenda;
	}

	/**
	 * @return the payvalue
	 */
	public BigDecimal getPayvalue() {
		return payvalue;
	}

	/**
	 * @param payvalue the payvalue to set
	 */
	public void setPayvalue(BigDecimal payvalue) {
		this.payvalue = payvalue;
	}

	/**
	 * @return the taxvalue
	 */
	public BigDecimal getTaxvalue() {
		return taxvalue;
	}

	/**
	 * @param taxvalue the taxvalue to set
	 */
	public void setTaxvalue(BigDecimal taxvalue) {
		this.taxvalue = taxvalue;
	}

	/**
	 * @return the totalvalue
	 */
	public BigDecimal getTotalvalue() {
		return totalvalue;
	}

	/**
	 * @param totalvalue the totalvalue to set
	 */
	public void setTotalvalue(BigDecimal totalvalue) {
		this.totalvalue = totalvalue;
	}

	/**
	 * @return the fligthList
	 */
	public List getFligthList() {
		return fligthList;
	}

	/**
	 * @param fligthList the fligthList to set
	 */
	public void setFligthList(List fligthList) {
		this.fligthList = fligthList;
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
    
    
    
    
    
    
    
    
    
    
	
}
