package com.example.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;


@EntityScan
public class itemTable{
		
	@Id     
	private long itemId;
	private long orderId;
	private long menuId;
	private long quantity;
	
	
	
	public itemTable(long itemId, long orderId, long menuId, long quantity) {
		super();
		this.itemId = itemId;
		this.orderId = orderId;
		this.menuId = menuId;
		this.quantity = quantity;
	}
	
	
	public itemTable() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
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
	
	

}
