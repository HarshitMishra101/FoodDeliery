package com.foodDelivery.website.services;


import org.springframework.beans.factory.annotation.Autowired;

import com.foodDelivery.website.model.AppUser;

import com.foodDelivery.website.repository.CustomerRepository;


	



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodDelivery.website.dto.CustomerDTO;
import com.foodDelivery.website.model.Customer;
import com.foodDelivery.website.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository cusRepo;
	
	
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return new ResponseEntity<>(cusRepo.findAll(), HttpStatus.OK);
	}
	public CustomerDTO convertToDTO(Customer customer) {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setAddress(customer.getAddress());
		customerDTO.setCustomerId(customer.getUserId());
		customerDTO.setCustomerName(customer.getUsername());
		return customerDTO;
	}
	public boolean validateCustomer(String email, String password) {
		Customer customer = cusRepo.findByEmailId(email);
		if(customer.equals(null)) {
			return false;
		}
		else {
			return customer.getPassword().equals(password);
		}
		
	}

}
