package com.foodDelivery.website.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodDelivery.website.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer , Integer> {
//	Customer findbyUserName(String userName);
	Optional<Customer> findByEmailId(String email);
	
}
