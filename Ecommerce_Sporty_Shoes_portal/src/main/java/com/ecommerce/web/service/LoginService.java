package com.ecommerce.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	//Credentials for admin login-------->
	public static String password= "admin";
	public static String email= "admin@sportyshoes.com";
	 public boolean validateAdmin(String email,String password) {
		 
		 return email.equals("admin@sportyshoes.com")&&(password.equals(LoginService.password));
		 
	 }

}
