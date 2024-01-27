package com.foodDelivery.website.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Customer extends AppUser{
	private String customerFirstName;
	private String customerLastName;
	private String address;
	private Long mobilenumber;
	private String emailId;
	@JsonBackReference
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Cart> carts = new ArrayList<>();
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<Cart> getCarts() {
		return carts;
	}
	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
	
	
}
