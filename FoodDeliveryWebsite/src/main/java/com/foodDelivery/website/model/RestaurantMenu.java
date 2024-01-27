package com.foodDelivery.website.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant_menu")
public class RestaurantMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int menuId;
	 @ManyToOne
	 @JoinColumn(name = "restaurant_id")
	    private Restaurant restaurant;

	 @ManyToOne
	 @JoinColumn(name = "foodItem_id")
	    private FoodItems foodItem;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public FoodItems getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItems foodItem) {
		this.foodItem = foodItem;
	}
	 
}
