package com.foodDelivery.website.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;


@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantId;
	private String restaurantName;
	private String location;
	private Long contactNo;
	private String emailId;
	@JsonManagedReference
	@ManyToMany
	@JoinTable(
			name = "Restaurant_Menu",
			joinColumns = @JoinColumn(name = "restaurant_id"),
			inverseJoinColumns = @JoinColumn(name = "foodItem_id"))
	private List<FoodItems> foodItemsInRestaurant;
	@OneToMany(mappedBy = "restaurant")
    private List<RestaurantMenu> restaurantMenuList;
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<FoodItems> getFoodItemsInRestaurant() {
		return foodItemsInRestaurant;
	}
	public void setFoodItemsInRestaurant(List<FoodItems> foodItemsInRestaurant) {
		this.foodItemsInRestaurant = foodItemsInRestaurant;
	}
	
	
}
