package com.avianca.asl.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author ricardoalmeida
 *
 */

@Component
public class WhoRequested {
	
	private String typepessoa;//":"PJ ou PF",
	private String numDocTypePessoa;//":"cpf ou cnpj",
	private String dataExist;//":"data de nascimento ou criação da empresa",
	private String name;//":"Nome completo (PF) / Razão Social (PJ)",
	private String numDoc;//":"RG/RNE (PF)",
	private String tel;//":"Telefone Contato",
	private String email;//":" E-mail"
	/**
	 * @return the typepessoa
	 */
	public String getTypepessoa() {
		return typepessoa;
	}
	/**
	 * @param typepessoa the typepessoa to set
	 */
	public void setTypepessoa(String typepessoa) {
		this.typepessoa = typepessoa;
	}
	/**
	 * @return the numDocTypePessoa
	 */
	public String getNumDocTypePessoa() {
		return numDocTypePessoa;
	}
	/**
	 * @param numDocTypePessoa the numDocTypePessoa to set
	 */
	public void setNumDocTypePessoa(String numDocTypePessoa) {
		this.numDocTypePessoa = numDocTypePessoa;
	}
	/**
	 * @return the dataExist
	 */
	public String getDataExist() {
		return dataExist;
	}
	/**
	 * @param dataExist the dataExist to set
	 */
	public void setDataExist(String dataExist) {
		this.dataExist = dataExist;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the numDoc
	 */
	public String getNumDoc() {
		return numDoc;
	}
	/**
	 * @param numDoc the numDoc to set
	 */
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
