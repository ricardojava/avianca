package com.avianca.asl.service;

import java.util.List;
/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

public interface Command {
	
	List execute(String param1,String param2);
	List execute(String param1,String param2,String param3);
	List execute(String param1,String param2,String param3,String param4);
	List execute(String param1,String param2,String param3,String param4,String param5);
	

}
