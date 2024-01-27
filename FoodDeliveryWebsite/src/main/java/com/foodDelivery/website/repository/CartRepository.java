package com.foodDelivery.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodDelivery.website.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
