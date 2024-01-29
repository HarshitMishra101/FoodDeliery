package com.foodDelivery.website.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;
    @ManyToOne // Assuming many carts can belong to one customer
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne // Assuming many carts can belong to one customer
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "cart_fooditem",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "fooditem_id")
    )
    private List<FoodItems> fooditems;
    private int cartPrice;
    
	public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public List<FoodItems> getFooditems() {
		return fooditems;
	}
	public void setFooditems(List<FoodItems> fooditems) {
		this.fooditems = fooditems;
	}
	public void calculateCartPrice() {
		if(fooditems !=null && !fooditems.isEmpty()) {
			int totalPrice = fooditems.stream().mapToInt(FoodItems::getItemPrice).sum();
			this.cartPrice = totalPrice;
		}
		else {
			this.cartPrice = 0;
		}
	}
	public int getCartPrice() {
		return cartPrice;
	}
	public void setCartPrice(int cartPrice) {
		this.cartPrice = cartPrice;
	}
	
	
	

	

    

    
	
}
