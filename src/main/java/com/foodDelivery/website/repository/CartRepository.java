package com.foodDelivery.website.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodDelivery.website.dto.CartDTO;
import com.foodDelivery.website.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
	List<Cart> findCartByCustomerUserId(int customerId);
}
