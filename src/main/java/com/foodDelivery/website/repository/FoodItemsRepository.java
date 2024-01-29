package com.foodDelivery.website.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.foodDelivery.website.model.FoodItems;


public interface FoodItemsRepository extends JpaRepository<FoodItems, Integer> {
	
}
