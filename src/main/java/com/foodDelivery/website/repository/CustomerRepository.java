package com.foodDelivery.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodDelivery.website.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer , Integer> {

}
