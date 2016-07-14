package com.avianca.asl.domain;
import org.springframework.stereotype.Component;
/**
 * 
 * @author ricardoalmeida
 *
 */
@Component
public class DetailFligth {
	
	private String ciaOperadora;
	private String ciaMarketing;
	private String numVoo;
	private String aeronave;
	private String tarifaFamilia;
	private String timeVoo;
	private String typeVoo;
	private String seat;
	
	/**
	 * @return the ciaOperadora
	 */
	public String getCiaOperadora() {
		return ciaOperadora;
	}
	/**
	 * @param ciaOperadora the ciaOperadora to set
	 */
	public void setCiaOperadora(String ciaOperadora) {
		this.ciaOperadora = ciaOperadora;
	}
	/**
	 * @return the ciaMarketing
	 */
	public String getCiaMarketing() {
		return ciaMarketing;
	}
	/**
	 * @param ciaMarketing the ciaMarketing to set
	 */
	public void setCiaMarketing(String ciaMarketing) {
		this.ciaMarketing = ciaMarketing;
	}
	/**
	 * @return the numVoo
	 */
	public String getNumVoo() {
		return numVoo;
	}
	/**
	 * @param numVoo the numVoo to set
	 */
	public void setNumVoo(String numVoo) {
		this.numVoo = numVoo;
	}
	/**
	 * @return the aeronave
	 */
	public String getAeronave() {
		return aeronave;
	}
	/**
	 * @param aeronave the aeronave to set
	 */
	public void setAeronave(String aeronave) {
		this.aeronave = aeronave;
	}
	/**
	 * @return the tarifaFamilia
	 */
	public String getTarifaFamilia() {
		return tarifaFamilia;
	}
	/**
	 * @param tarifaFamilia the tarifaFamilia to set
	 */
	public void setTarifaFamilia(String tarifaFamilia) {
		this.tarifaFamilia = tarifaFamilia;
	}
	/**
	 * @return the timeVoo
	 */
	public String getTimeVoo() {
		return timeVoo;
	}
	/**
	 * @param timeVoo the timeVoo to set
	 */
	public void setTimeVoo(String timeVoo) {
		this.timeVoo = timeVoo;
	}
	/**
	 * @return the typeVoo
	 */
	public String getTypeVoo() {
		return typeVoo;
	}
	/**
	 * @param typeVoo the typeVoo to set
	 */
	public void setTypeVoo(String typeVoo) {
		this.typeVoo = typeVoo;
	}
	/**
	 * @return the seat
	 */
	public String getSeat() {
		return seat;
	}
	/**
	 * @param seat the seat to set
	 */
	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	
	
	

}
