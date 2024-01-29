package com.foodDelivery.website.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodDelivery.website.model.AppUser;

import com.foodDelivery.website.repository.CustomerRepository;

public class CustomerService {
@Autowired
private CustomerRepository customerRepository;

public boolean login(String username,String password) {
	AppUser user=customerRepository.findbyUserName(username);
	return user != null && user.getPassword().equals(password);
	
}
	


}
