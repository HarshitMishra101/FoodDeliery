package com.foodDelivery.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodDelivery.website.model.Customer;
import com.foodDelivery.website.services.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	CustomerService cusService;
	
	@GetMapping("/getallcustomer")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return cusService.getAllCustomers();
	}
}
