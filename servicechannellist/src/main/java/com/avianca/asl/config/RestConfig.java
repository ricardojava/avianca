package com.avianca.asl.config;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.avianca.asl.controller.Service;

/**
 * 
 * @author ricardoalmeida
 * @version 1.0.0
 * @since 07/2016
 */

@Component
public class RestConfig extends ResourceConfig{
	
	public RestConfig() {
        packages("com.avianca.asl.rest");
    }
	
	

}
