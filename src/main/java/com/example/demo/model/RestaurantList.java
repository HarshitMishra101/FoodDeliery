package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RestaurantList {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int restaurantId;
	private String restaurantName;
	private String restaurantDescription;
	private String restaurantLocation;
	private int ownerId;
	
	// getter Setter for attributes
	
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
	public String getRestaurantDescription() {
		return restaurantDescription;
	}
	public void setRestaurantDescription(String restaurantDescription) {
		this.restaurantDescription = restaurantDescription;
	}
	public String getRestaurantLocation() {
		return restaurantLocation;
	}
	public void setRestaurantLocation(String restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}
	
	
	//constructor
	public RestaurantList (String restaurantName, int ownerId, String restaurantLocation,String restaurantDescription ) {
		
		this.restaurantName = restaurantName;
		this.restaurantDescription = restaurantDescription;
		this.ownerId = ownerId;
		this.restaurantLocation = restaurantLocation;
	}
	
	
	
}
