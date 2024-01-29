package com.foodDelivery.website.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodDelivery.website.model.FoodItems;
import com.foodDelivery.website.model.Restaurant;
import com.foodDelivery.website.model.RestaurantMenu;
@Repository
public interface RestaurantMenuRepository extends JpaRepository<RestaurantMenu, Integer> {
	List<RestaurantMenu> findRestaurantIdByFoodItemId(int foodItemId);
	List<RestaurantMenu> findFoodItemIdByRestaurantRestaurantId(int restaurantId);
}
