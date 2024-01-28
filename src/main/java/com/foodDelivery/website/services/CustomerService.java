package com.foodDelivery.website.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodDelivery.website.model.Customer;
import com.foodDelivery.website.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository cusRepo;
	
	
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return new ResponseEntity<>(cusRepo.findAll(), HttpStatus.OK);
	}
}
