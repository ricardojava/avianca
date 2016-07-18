/**
 * 
 */
package com.avianca.asl.roles.business;

import java.util.Iterator;

/**
 * @author ricardoalmeida
 *
 */
public class Rules {
	
	
	public boolean fildIsEmpity(String ...strings){
	  for (String string : strings) {
		
		  if(string.isEmpty()||string==null)
			  return false;
		  break;
	     }
		
		return true;
	}
	
	public boolean validToken(String token){
		if(!token.isEmpty()){
			return true;
		}
		
		return false;
	}
	

}
