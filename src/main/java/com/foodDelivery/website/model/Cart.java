package com.foodDelivery.website.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	private int cartQuantity;
	private double Totalprice;
	@JsonManagedReference
	@ManyToMany
	@JoinTable(
	        name = "cart_fooditem",
	        joinColumns = @JoinColumn(name = "cart_id"),
	        inverseJoinColumns = @JoinColumn(name = "fooditem_id")
	    )
	private List<FoodItems> fooditems;
	@JsonManagedReference
	@ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getCartQuantity() {
		return cartQuantity;
	}
	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}
	public double getTotalprice() {
		return Totalprice;
	}
	public void setTotalprice(double totalprice) {
		Totalprice = totalprice;
	}
	public List<FoodItems> getFooditems() {
		return fooditems;
	}
	public void setFooditems(List<FoodItems> fooditems) {
		this.fooditems = fooditems;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
