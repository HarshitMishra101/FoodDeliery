package com.foodDelivery.website.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodDelivery.website.model.CartFoodItems;
import com.foodDelivery.website.repository.CartFoodItemsRepository;

@Service
public class CartFoodItemsService {
	@Autowired
	CartFoodItemsRepository cfiRepo;
	
	public ResponseEntity<List<CartFoodItems>> getFoodItemsByCustomerId(int id){
		return new ResponseEntity<>(cfiRepo.findByCartCartId(id), HttpStatus.OK);
	}
}
