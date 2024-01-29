package com.foodDelivery.website.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
@Entity
public class FoodItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	private String itemName;
	private int itemPrice;
	@JsonBackReference
	@ManyToMany(mappedBy = "fooditems")
	private List<Cart> cart = new ArrayList<>();
	@JsonBackReference
	@ManyToMany(mappedBy = "foodItemsInRestaurant")
	private List<Restaurant> restaurantsMenu = new ArrayList<>();
	@OneToMany(mappedBy = "foodItem")
    private List<RestaurantMenu> restaurantMenuList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public List<Cart> getCart() {
		return cart;
	}
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}
	public List<Restaurant> getRestaurantsMenu() {
		return restaurantsMenu;
	}
	public void setRestaurantsMenu(List<Restaurant> restaurantsMenu) {
		this.restaurantsMenu = restaurantsMenu;
	}
	
	
}