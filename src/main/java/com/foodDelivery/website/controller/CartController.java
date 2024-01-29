package com.foodDelivery.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodDelivery.website.dto.CartDTO;
import com.foodDelivery.website.exception.GlobalException;
import com.foodDelivery.website.model.AddToCartRequest;
import com.foodDelivery.website.model.FoodItems;

import com.foodDelivery.website.services.CartServices;

@RestController
@RequestMapping("cart")
public class CartController {
	@Autowired
	CartServices cartService;

	@PostMapping("/add")
	public ResponseEntity<String> addToCart(@RequestBody AddToCartRequest request){
		cartService.addToCart(request);
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}
	@GetMapping("/searchcart/{id}")
	public ResponseEntity<List<FoodItems>> searchCartByCartId(@PathVariable int id) throws GlobalException{
		return cartService.searchCartById(id);
	}
	@GetMapping("/searchcustomer/{id}")
	public ResponseEntity<List<CartDTO>> searchCartByCustomerId(@PathVariable int id) throws GlobalException{
		return cartService.getCartByCustomerId(id);
	}
	
}
