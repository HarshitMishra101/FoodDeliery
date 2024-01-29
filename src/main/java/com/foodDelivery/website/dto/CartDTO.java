package com.foodDelivery.website.dto;

import java.util.List;

import com.foodDelivery.website.model.FoodItems;

public class CartDTO {
	private Long cartId;
	private RestaurantDTO restaurantDTO;
	private CustomerDTO customerDTO;
	private List<FoodItems> foodItems;
	private int cartPrice;
	
	public int getCartPrice() {
		return cartPrice;
	}
	public Long getCartId() {
		return cartId;
	}
	
	public RestaurantDTO getRestaurantDTO() {
		return restaurantDTO;
	}
	public void setRestaurantDTO(RestaurantDTO restaurantDTO) {
		this.restaurantDTO = restaurantDTO;
	}
	public CustomerDTO getCustomerDTO() {
		return customerDTO;
	}
	public void setCustomerDTO(CustomerDTO customerDTO) {
		this.customerDTO = customerDTO;
	}
	public List<FoodItems> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<FoodItems> foodItems) {
		this.foodItems = foodItems;
	}
	public void setCartId(Long cartId) {
		// TODO Auto-generated method stub
		this.cartId = cartId;
	}
	public void calculateCartPrice() {
		if(foodItems !=null && !foodItems.isEmpty()) {
			int totalPrice = foodItems.stream().mapToInt(FoodItems::getItemPrice).sum();
			this.cartPrice = totalPrice;
		}
		else {
			this.cartPrice = 0;
		}
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", restaurant=" + restaurantDTO + ", customer=" + customerDTO
				+ ", foodItems=" + foodItems + ", cartPrice=" + cartPrice + "]";
	}

	

	
	
	
}
