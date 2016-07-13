/**
 * 
 */
package com.avianca.asl.roles.business;

import java.util.Iterator;

/**
 * @author ricardoalmeida
 *
 */
public class RulesConfirmation {
	
	
	boolean fildIsEmpity(String ...strings){
	  for (String string : strings) {
		
		  if(string.isEmpty()||string==null)
			  return false;
		  break;
	     }
		
		return true;
	}
	
	
	

}
