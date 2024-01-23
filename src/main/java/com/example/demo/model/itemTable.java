package com.example.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;


@EntityScan
public class itemTable{
		
	@Id     
	private long orderItemId;
	private long orderId;
	private long menuId;
	private long quantity;
	private long subTotal;
	
	public itemTable(long orderItemId, long orderId, long menuId, long quantity, long subTotal) {
		super();
		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.menuId = menuId;
		this.quantity = quantity;
		this.subTotal = subTotal;
		
		
	}

	public itemTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(long subTotal) {
		this.subTotal = subTotal;
	}
	
	
	
	
	
	

}
