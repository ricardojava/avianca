package com.avianca.asl.domain;

import java.util.Date;

public class Origin {
	
	
	private String voo;
    private Date data;
    private String hora;
    private String aeroporto;
    private String cidade;
	/**
	 * @return the voo
	 */
	public String getVoo() {
		return voo;
	}
	/**
	 * @param voo the voo to set
	 */
	public void setVoo(String voo) {
		this.voo = voo;
	}
	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}
	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	/**
	 * @return the aeroporto
	 */
	public String getAeroporto() {
		return aeroporto;
	}
	/**
	 * @param aeroporto the aeroporto to set
	 */
	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
    
    
    

}
