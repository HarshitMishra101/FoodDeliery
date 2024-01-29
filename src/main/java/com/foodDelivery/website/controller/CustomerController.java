package com.foodDelivery.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@PostMapping("/login")
	public ResponseEntity<String> loginCustomer(@RequestParam String email, @RequestParam String password) {
		if(cusService.validateCustomer(email, password)) {
			return new ResponseEntity<>("Login successfull", HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Login Failed", HttpStatus.NOT_FOUND);
		}
	}
}
