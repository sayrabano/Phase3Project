package com.ecommerce.web.controller;





import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.web.helper.MessageHelper;
import com.ecommerce.web.service.LoginService;

@Controller

public class MainController {
	@Autowired 
	LoginService service;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home - SportyShoes.com");
		return "home";
	}
	
	@RequestMapping("/home")
	public String homePage(Model model) {
		model.addAttribute("title", "Home - SportyShoes.com");
		return "home";
	}
	
	
	
	@RequestMapping("/admin-login")
	public String administrationLogin(Model model ) {
		model.addAttribute("title", "AdminLogin - SportyShoes.com");
		return "adminstration-login";
	}
	

	
	@PostMapping("/adminDashboard")
	public String dashboard(ModelMap model,@RequestParam String email,@RequestParam String password,HttpSession s) {
	 
	 
		
	
		model.put("title", "AdminDashboard - SportyShoes.com");
		
		boolean isvalidAdmin = service.validateAdmin(email, password);
	
		
		if(!isvalidAdmin) {
		
			s.setAttribute("message", new MessageHelper("Oops Invalid Credential !","error"));
		return "adminstration-login";
		}
		else {
			model.put("email",email);
		
			model.put("password",password);
			
			
			System.out.println("Admin password : "+ password);
			System.out.println("Admin Email Address : " +email);
			
			model.put("email","admin@sportyshoes.com");
			return "adminDashboard";
		}
		
		
	}
	
	//change password handler
	
			@RequestMapping(value="/changePassword")
			public String changePassword(Model model) {
				model.addAttribute("title", "Change Password - SportyShoes.com");
				return "changePassword";
			}
			
			@PostMapping("/change")
			public String passwordChange(@RequestParam("npass") String npass,HttpSession session) {
				
				
				if(npass.equals("")) {
					session.setAttribute("message", new MessageHelper("Password can not be empty !","success"));
					
					
				
					return "changePassword";
					}
					LoginService.password=npass;
					
					return "redirect:home";
				
				
				
				
			}
			
			
			@PostMapping(value="/logout")
			public String logout() {
				return"home";
			}
			
			

}
