package com.avianca.asl.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ricardoalmeida
 *list history refund equals ticket
 */
@Component
public class HistoryRefundTicket {
	
	private String numsolicitacao;//:"Número da Solicitação",
	private String dtaopen;//":"Data da Abertura",
	private String statussolicitacao;//":"Status da Solicitação",
	private String dtalaststatus;//":"Data do Último Status"
	/**
	 * @return the numsolicitacao
	 */
	public String getNumsolicitacao() {
		return numsolicitacao;
	}
	/**
	 * @param numsolicitacao the numsolicitacao to set
	 */
	public void setNumsolicitacao(String numsolicitacao) {
		this.numsolicitacao = numsolicitacao;
	}
	/**
	 * @return the dtaopen
	 */
	public String getDtaopen() {
		return dtaopen;
	}
	/**
	 * @param dtaopen the dtaopen to set
	 */
	public void setDtaopen(String dtaopen) {
		this.dtaopen = dtaopen;
	}
	/**
	 * @return the statussolicitacao
	 */
	public String getStatussolicitacao() {
		return statussolicitacao;
	}
	/**
	 * @param statussolicitacao the statussolicitacao to set
	 */
	public void setStatussolicitacao(String statussolicitacao) {
		this.statussolicitacao = statussolicitacao;
	}
	/**
	 * @return the dtalaststatus
	 */
	public String getDtalaststatus() {
		return dtalaststatus;
	}
	/**
	 * @param dtalaststatus the dtalaststatus to set
	 */
	public void setDtalaststatus(String dtalaststatus) {
		this.dtalaststatus = dtalaststatus;
	}

	
	
}
