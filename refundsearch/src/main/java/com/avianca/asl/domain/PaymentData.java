package com.avianca.asl.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author ricardoalmeida
 *
 */
@Component
public class PaymentData {
	
	private String typeFop;//":"Tipo da FOP (corrente, poupança, cartão crédito, boleto, cash, 3DS)",
	private String titular;//":"Tipo do Titular (PF/PJ/GOV)",
	private String numDocTitular;//":"CPF/CNPJ Titular",
	private String nameTitular;//":"Nome do Titular",
	private String bandeira;//":"Bandeira",
	private String numCartao;//":"Número do cartão crédito (parcial)",
	private String validadeCartao;//":"Vencimento Cartão de Crédito",
	private String formaPay;//":"Forma de Pagamento do Reembolso",
	/**
	 * @return the typeFop
	 */
	public String getTypeFop() {
		return typeFop;
	}
	/**
	 * @param typeFop the typeFop to set
	 */
	public void setTypeFop(String typeFop) {
		this.typeFop = typeFop;
	}
	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}
	/**
	 * @return the numDocTitular
	 */
	public String getNumDocTitular() {
		return numDocTitular;
	}
	/**
	 * @param numDocTitular the numDocTitular to set
	 */
	public void setNumDocTitular(String numDocTitular) {
		this.numDocTitular = numDocTitular;
	}
	/**
	 * @return the nameTitular
	 */
	public String getNameTitular() {
		return nameTitular;
	}
	/**
	 * @param nameTitular the nameTitular to set
	 */
	public void setNameTitular(String nameTitular) {
		this.nameTitular = nameTitular;
	}
	/**
	 * @return the bandeira
	 */
	public String getBandeira() {
		return bandeira;
	}
	/**
	 * @param bandeira the bandeira to set
	 */
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	/**
	 * @return the numCartao
	 */
	public String getNumCartao() {
		return numCartao;
	}
	/**
	 * @param numCartao the numCartao to set
	 */
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	/**
	 * @return the validadeCartao
	 */
	public String getValidadeCartao() {
		return validadeCartao;
	}
	/**
	 * @param validadeCartao the validadeCartao to set
	 */
	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}
	/**
	 * @return the formaPay
	 */
	public String getFormaPay() {
		return formaPay;
	}
	/**
	 * @param formaPay the formaPay to set
	 */
	public void setFormaPay(String formaPay) {
		this.formaPay = formaPay;
	}

	
	
	
}
