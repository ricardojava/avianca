package com.avianca.asl.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * @author ricardoalmeida
 *
 */


@Component
public class Fligth {
	
	private Going going;
	private Coming coming;
	/**
	 * @return the going
	 */
	public Going getGoing() {
		return going;
	}
	/**
	 * @param going the going to set
	 */
	public void setGoing(Going going) {
		this.going = going;
	}
	/**
	 * @return the coming
	 */
	public Coming getComing() {
		return coming;
	}
	/**
	 * @param coming the coming to set
	 */
	public void setComing(Coming coming) {
		this.coming = coming;
	}
	
	

}
