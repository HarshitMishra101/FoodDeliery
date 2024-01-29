package com.foodDelivery.website.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.foodDelivery.website.model.AppUser;

import com.foodDelivery.website.services.CustomerService;

public class AppUserController {
	private CustomerService appUserService;
	
	
	@PostMapping("/login")
	public String login(@RequestBody AppUser appUser) {
		if(appUserService.login(appUser.getUsername(), appUser.getPassword()) ) {
			return "login Successful !!";
		}else {
			return "login unsuccessfull";
		}
		
	}
	

}
