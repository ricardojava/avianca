package com.avianca.asl.service;

import java.util.List;
/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

public interface Command {
	
	String execute(String token);
	String execute(String token,String param2);
	String execute(String token,String param2,String param3);
	String execute(String token,String param2,String param3,String param4);
	String execute(String token,String param2,String param3,String param4,String param5);
	

}
