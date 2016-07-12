package com.avianca.asl.service;

import java.io.Serializable;
import java.util.List;

public interface Command {
	
	String execute(Serializable pojo);
	//String execute(String token);
	List execute(String token);

}
