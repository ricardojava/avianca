package com.avianca.asl.domain;
import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author ricardoalmeida
 *
 */


@Component
public class ServiceToFligth {
	private String typeService;
	private String desc;
	private String emd;
	
	
	/**
	 * @return the typeService
	 */
	public String getTypeService() {
		return typeService;
	}
	/**
	 * @param typeService the typeService to set
	 */
	public void setTypeService(String typeService) {
		this.typeService = typeService;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the emd
	 */
	public String getEmd() {
		return emd;
	}
	/**
	 * @param emd the emd to set
	 */
	public void setEmd(String emd) {
		this.emd = emd;
	}
	
	
	
	
	

}
