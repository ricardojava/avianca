package com.avianca.asl.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ricardoalmeida
 *ContaEstrangeiro
 */
@Component
public class ForeignAccount {
	
	private String namebanck;//":"Nome do Banco",
	private String banckintermediario;//":"Banco intermediário branc code/transit code",
	private String codbanck;//":" Código do Banco (ABA - SWIFT - ACH)",
	private String nametitular;//":"Nome do Titular da Conta",
	private String numidentificacao;//":"Número de Identificação (deve ser o mesmo registrado no Banco)",
	private String numconta;//":"Número da Conta (Chave de 22 dígitos)",
	private String pais;//":"País da Conta",
	private String moedaconta;//":"Moeda da Conta",
	private String typeconta;//":"Tipo de Conta",
	private String numpassaportetitular;//":"Número do Passaporte do Titular",
	private String numdoc;//":"Número do Documento do Titular",
	private String tel;//":"Telefone",
	private String numagencia;//":"Número da Agência Bancária",
	private String nameconta;//":"Nome da Conta: mesmo que tipo?"
	/**
	 * @return the namebanck
	 */
	public String getNamebanck() {
		return namebanck;
	}
	/**
	 * @param namebanck the namebanck to set
	 */
	public void setNamebanck(String namebanck) {
		this.namebanck = namebanck;
	}
	/**
	 * @return the banckintermediario
	 */
	public String getBanckintermediario() {
		return banckintermediario;
	}
	/**
	 * @param banckintermediario the banckintermediario to set
	 */
	public void setBanckintermediario(String banckintermediario) {
		this.banckintermediario = banckintermediario;
	}
	/**
	 * @return the codbanck
	 */
	public String getCodbanck() {
		return codbanck;
	}
	/**
	 * @param codbanck the codbanck to set
	 */
	public void setCodbanck(String codbanck) {
		this.codbanck = codbanck;
	}
	/**
	 * @return the nametitular
	 */
	public String getNametitular() {
		return nametitular;
	}
	/**
	 * @param nametitular the nametitular to set
	 */
	public void setNametitular(String nametitular) {
		this.nametitular = nametitular;
	}
	/**
	 * @return the numidentificacao
	 */
	public String getNumidentificacao() {
		return numidentificacao;
	}
	/**
	 * @param numidentificacao the numidentificacao to set
	 */
	public void setNumidentificacao(String numidentificacao) {
		this.numidentificacao = numidentificacao;
	}
	/**
	 * @return the numconta
	 */
	public String getNumconta() {
		return numconta;
	}
	/**
	 * @param numconta the numconta to set
	 */
	public void setNumconta(String numconta) {
		this.numconta = numconta;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * @return the moedaconta
	 */
	public String getMoedaconta() {
		return moedaconta;
	}
	/**
	 * @param moedaconta the moedaconta to set
	 */
	public void setMoedaconta(String moedaconta) {
		this.moedaconta = moedaconta;
	}
	/**
	 * @return the typeconta
	 */
	public String getTypeconta() {
		return typeconta;
	}
	/**
	 * @param typeconta the typeconta to set
	 */
	public void setTypeconta(String typeconta) {
		this.typeconta = typeconta;
	}
	/**
	 * @return the numpassaportetitular
	 */
	public String getNumpassaportetitular() {
		return numpassaportetitular;
	}
	/**
	 * @param numpassaportetitular the numpassaportetitular to set
	 */
	public void setNumpassaportetitular(String numpassaportetitular) {
		this.numpassaportetitular = numpassaportetitular;
	}
	/**
	 * @return the numdoc
	 */
	public String getNumdoc() {
		return numdoc;
	}
	/**
	 * @param numdoc the numdoc to set
	 */
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the numagencia
	 */
	public String getNumagencia() {
		return numagencia;
	}
	/**
	 * @param numagencia the numagencia to set
	 */
	public void setNumagencia(String numagencia) {
		this.numagencia = numagencia;
	}
	/**
	 * @return the nameconta
	 */
	public String getNameconta() {
		return nameconta;
	}
	/**
	 * @param nameconta the nameconta to set
	 */
	public void setNameconta(String nameconta) {
		this.nameconta = nameconta;
	}
	
	

}
