package com.foodDelivery.website.dto;



public class RestaurantDTO {

	private int restaurantId;
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	private String restaurantName;
	private String location;
	private Long contactNo;
	
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
	@Override
	public String toString() {
		return "RestaurantDTO [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", location="
				+ location + ", contactNo=" + contactNo + "]";
	}
	
	
	
}
