package com.avianca.asl.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ricardoalmeida
 *
 */

@Component
public class Attach {
	
	private String idArq;//":"Identificação do Arquivo",
	private String descArq;//":" Descrição do Arquivo Anexo",
	private String statusAprove;//":" Status de Aprovação",
	private String motivoRepro;//":"Motivo da Reprovação",
	private String dtaAnaliseAnexo;//":"Data da Análise do Anexo",
	private String userAvaliacaoAnexo;//":"Usuário que avaliou o Anexo – somente para Canal de Atendimento Call Center."
	/**
	 * @return the idArq
	 */
	public String getIdArq() {
		return idArq;
	}
	/**
	 * @param idArq the idArq to set
	 */
	public void setIdArq(String idArq) {
		this.idArq = idArq;
	}
	/**
	 * @return the descArq
	 */
	public String getDescArq() {
		return descArq;
	}
	/**
	 * @param descArq the descArq to set
	 */
	public void setDescArq(String descArq) {
		this.descArq = descArq;
	}
	/**
	 * @return the statusAprove
	 */
	public String getStatusAprove() {
		return statusAprove;
	}
	/**
	 * @param statusAprove the statusAprove to set
	 */
	public void setStatusAprove(String statusAprove) {
		this.statusAprove = statusAprove;
	}
	/**
	 * @return the motivoRepro
	 */
	public String getMotivoRepro() {
		return motivoRepro;
	}
	/**
	 * @param motivoRepro the motivoRepro to set
	 */
	public void setMotivoRepro(String motivoRepro) {
		this.motivoRepro = motivoRepro;
	}
	/**
	 * @return the dtaAnaliseAnexo
	 */
	public String getDtaAnaliseAnexo() {
		return dtaAnaliseAnexo;
	}
	/**
	 * @param dtaAnaliseAnexo the dtaAnaliseAnexo to set
	 */
	public void setDtaAnaliseAnexo(String dtaAnaliseAnexo) {
		this.dtaAnaliseAnexo = dtaAnaliseAnexo;
	}
	/**
	 * @return the userAvaliacaoAnexo
	 */
	public String getUserAvaliacaoAnexo() {
		return userAvaliacaoAnexo;
	}
	/**
	 * @param userAvaliacaoAnexo the userAvaliacaoAnexo to set
	 */
	public void setUserAvaliacaoAnexo(String userAvaliacaoAnexo) {
		this.userAvaliacaoAnexo = userAvaliacaoAnexo;
	}

	
	
}
