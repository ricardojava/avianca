package com.avianca.asl.domain;

import java.time.LocalDate;
import java.util.List;

/**
 * 
 * @author ricardoalmeida
 *
 */
public class Coming {
	
	private String country;
	private String city;
	private LocalDate itDates;
	private List itinerary;
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the itDates
	 */
	public LocalDate getItDates() {
		return itDates;
	}
	/**
	 * @param itDates the itDates to set
	 */
	public void setItDates(LocalDate itDates) {
		this.itDates = itDates;
	}
	/**
	 * @return the itinerary
	 */
	public List getItinerary() {
		return itinerary;
	}
	/**
	 * @param itinerary the itinerary to set
	 */
	public void setItinerary(List itinerary) {
		this.itinerary = itinerary;
	}
	
	
	
	

}
