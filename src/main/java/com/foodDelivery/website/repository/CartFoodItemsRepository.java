package com.foodDelivery.website.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodDelivery.website.model.CartFoodItems;

public interface CartFoodItemsRepository extends JpaRepository<CartFoodItems, Integer> {
	List<CartFoodItems> findByCartCartId(int id);
}
