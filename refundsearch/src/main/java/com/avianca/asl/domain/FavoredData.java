package com.avianca.asl.domain;

import org.springframework.stereotype.Component;
/**
 * 
 * @author ricardoalmeida
 *
 */
//dados do favorecido
@Component
public class FavoredData {
	
	 private String typetitular;//":"Tipo do Titular da Conta Corrente ou Poupança (próprio pax ou 3º)",
	 private String numdoctitular;//":"CPF/CNPJ Titular",
	 private String nametitular;//":"Nome do Titular",
	 private String namefantasia;//":"Nome Fantasia (PJ)",
	 private String inscriestadual;//":"Inscrição Estadual (PJ)",
	 private String inscrimuniciapl;//":"Inscrição Municipal (PJ)",
	 private String cep;//":"CEP",
	 private String logradouro;//" :"Logradouro do Endereço",
	 private String num;//":"Número Endereço",
	 private String complemento;//":"Complemento Endereço",
	 private String bairro;//":"Bairro",
	 private String cidade;//":"Cidade",
	 private String uf;//":"UF",
	 private String pais;//":"País",
	 private String typeconta;//":"Tipo de Conta do Pagamento do Reembolso (corrente/poupança, cartão crédito, ordem de pagamento, conta no estrangeiro)",
	 private String codbank;//":"Código do Banco",
	 private String agencia;//":"Número da Agência Bancária",
	 private String numconta;//":"Número da Conta",
	 private String cartãocrédito;//":"sim ou não",
	 private String bandeira;//":"visa",
	 private String numcartao;//":"Número do cartão crédito (parcial)",
	 private String validade;//":"Vencimento",
	 private String ordempay;//":"Ordem de Pagamento",
	 private String rgfavorecido;//":"11111111111",
	 private String cpffavorecido;//":"2222222222",
	 private String dtanascfavorecido;//":"12/12/2012",
	 private String codbankSantander;//":"Código do Banco (Só Santander)",
	/**
	 * @return the typetitular
	 */
	public String getTypetitular() {
		return typetitular;
	}
	/**
	 * @param typetitular the typetitular to set
	 */
	public void setTypetitular(String typetitular) {
		this.typetitular = typetitular;
	}
	/**
	 * @return the numdoctitular
	 */
	public String getNumdoctitular() {
		return numdoctitular;
	}
	/**
	 * @param numdoctitular the numdoctitular to set
	 */
	public void setNumdoctitular(String numdoctitular) {
		this.numdoctitular = numdoctitular;
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
	 * @return the namefantasia
	 */
	public String getNamefantasia() {
		return namefantasia;
	}
	/**
	 * @param namefantasia the namefantasia to set
	 */
	public void setNamefantasia(String namefantasia) {
		this.namefantasia = namefantasia;
	}
	/**
	 * @return the inscriestadual
	 */
	public String getInscriestadual() {
		return inscriestadual;
	}
	/**
	 * @param inscriestadual the inscriestadual to set
	 */
	public void setInscriestadual(String inscriestadual) {
		this.inscriestadual = inscriestadual;
	}
	/**
	 * @return the inscrimuniciapl
	 */
	public String getInscrimuniciapl() {
		return inscrimuniciapl;
	}
	/**
	 * @param inscrimuniciapl the inscrimuniciapl to set
	 */
	public void setInscrimuniciapl(String inscrimuniciapl) {
		this.inscrimuniciapl = inscrimuniciapl;
	}
	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}
	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}
	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}
	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}
	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}
	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
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
	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}
	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
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
	 * @return the codbank
	 */
	public String getCodbank() {
		return codbank;
	}
	/**
	 * @param codbank the codbank to set
	 */
	public void setCodbank(String codbank) {
		this.codbank = codbank;
	}
	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}
	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
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
	 * @return the cartãocrédito
	 */
	public String getCartãocrédito() {
		return cartãocrédito;
	}
	/**
	 * @param cartãocrédito the cartãocrédito to set
	 */
	public void setCartãocrédito(String cartãocrédito) {
		this.cartãocrédito = cartãocrédito;
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
	 * @return the numcartao
	 */
	public String getNumcartao() {
		return numcartao;
	}
	/**
	 * @param numcartao the numcartao to set
	 */
	public void setNumcartao(String numcartao) {
		this.numcartao = numcartao;
	}
	/**
	 * @return the validade
	 */
	public String getValidade() {
		return validade;
	}
	/**
	 * @param validade the validade to set
	 */
	public void setValidade(String validade) {
		this.validade = validade;
	}
	/**
	 * @return the ordempay
	 */
	public String getOrdempay() {
		return ordempay;
	}
	/**
	 * @param ordempay the ordempay to set
	 */
	public void setOrdempay(String ordempay) {
		this.ordempay = ordempay;
	}
	/**
	 * @return the rgfavorecido
	 */
	public String getRgfavorecido() {
		return rgfavorecido;
	}
	/**
	 * @param rgfavorecido the rgfavorecido to set
	 */
	public void setRgfavorecido(String rgfavorecido) {
		this.rgfavorecido = rgfavorecido;
	}
	/**
	 * @return the cpffavorecido
	 */
	public String getCpffavorecido() {
		return cpffavorecido;
	}
	/**
	 * @param cpffavorecido the cpffavorecido to set
	 */
	public void setCpffavorecido(String cpffavorecido) {
		this.cpffavorecido = cpffavorecido;
	}
	/**
	 * @return the dtanascfavorecido
	 */
	public String getDtanascfavorecido() {
		return dtanascfavorecido;
	}
	/**
	 * @param dtanascfavorecido the dtanascfavorecido to set
	 */
	public void setDtanascfavorecido(String dtanascfavorecido) {
		this.dtanascfavorecido = dtanascfavorecido;
	}
	/**
	 * @return the codbankSantander
	 */
	public String getCodbankSantander() {
		return codbankSantander;
	}
	/**
	 * @param codbankSantander the codbankSantander to set
	 */
	public void setCodbankSantander(String codbankSantander) {
		this.codbankSantander = codbankSantander;
	}
	 
	 
	 
	 

}
