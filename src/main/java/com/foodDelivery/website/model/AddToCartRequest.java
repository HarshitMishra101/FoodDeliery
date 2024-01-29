package com.foodDelivery.website.model;

import java.util.List;

public class AddToCartRequest {
	private int customerId;
    private int restaurantId;
    private List<Integer> foodItems;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public List<Integer> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<Integer> foodItems) {
		this.foodItems = foodItems;
	}
    
}
