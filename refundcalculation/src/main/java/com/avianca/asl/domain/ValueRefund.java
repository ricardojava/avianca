package com.avianca.asl.domain;

import java.io.Serializable;

import java.math.BigDecimal;

/**
 * 
 * @author ricardoalmeida
 *
 */

public class ValueRefund implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal totalFirePaid;
	private BigDecimal totalFireUsad;
	private BigDecimal firereFunded;
	private BigDecimal taxesRefunded;
	private BigDecimal cancellationPenalty;
	private BigDecimal totalRefund;

	 
	
	/**
	 * @return the totalFirePaid
	 */
	public BigDecimal getTotalFirePaid() {
		return totalFirePaid;
	}
	/**
	 * @param totalFirePaid the totalFirePaid to set
	 */
	public void setTotalFirePaid(BigDecimal totalFirePaid) {
		this.totalFirePaid = totalFirePaid;
	}
	/**
	 * @return the totalFireUsad
	 */
	public BigDecimal getTotalFireUsad() {
		return totalFireUsad;
	}
	/**
	 * @param totalFireUsad the totalFireUsad to set
	 */
	public void setTotalFireUsad(BigDecimal totalFireUsad) {
		this.totalFireUsad = totalFireUsad;
	}
	/**
	 * @return the firereFunded
	 */
	public BigDecimal getFirereFunded() {
		return firereFunded;
	}
	/**
	 * @param firereFunded the firereFunded to set
	 */
	public void setFirereFunded(BigDecimal firereFunded) {
		this.firereFunded = firereFunded;
	}
	/**
	 * @return the taxesRefunded
	 */
	public BigDecimal getTaxesRefunded() {
		return taxesRefunded;
	}
	/**
	 * @param taxesRefunded the taxesRefunded to set
	 */
	public void setTaxesRefunded(BigDecimal taxesRefunded) {
		this.taxesRefunded = taxesRefunded;
	}
	/**
	 * @return the cancellationPenalty
	 */
	public BigDecimal getCancellationPenalty() {
		return cancellationPenalty;
	}
	/**
	 * @param cancellationPenalty the cancellationPenalty to set
	 */
	public void setCancellationPenalty(BigDecimal cancellationPenalty) {
		this.cancellationPenalty = cancellationPenalty;
	}
	/**
	 * @return the totalRefund
	 */
	public BigDecimal getTotalRefund() {
		return totalRefund;
	}
	/**
	 * @param totalRefund the totalRefund to set
	 */
	public void setTotalRefund(BigDecimal totalRefund) {
		this.totalRefund = totalRefund;
	}
	
}
