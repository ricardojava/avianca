package com.avianca.asl.config;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import com.avianca.asl.rest.ServiceBank;



@Component
public class RestConfig extends ResourceConfig{
	
	public RestConfig() {
        packages("com.avianca.asl.rest");
    }
	
	

}
