package com.foodDelivery.website.dto;

import java.util.List;

public class CartDTO {
	private RestaurantDTO restaurantDTO;
	private CustomerDTO customerDTO;
	private int cartId;
	private List<FoodItemsDTO> foodItems;
	private int totalQuantity;
	private double totalPrice;
}
