package com.avianca.asl.service;

import com.avianca.asl.domain.DownloadAttach;
/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

public interface Command {
	
	String execute(DownloadAttach downloadAttach);
	

}
