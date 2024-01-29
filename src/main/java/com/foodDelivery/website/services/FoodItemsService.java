package com.foodDelivery.website.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodDelivery.website.dto.FoodItemsDTO;
import com.foodDelivery.website.model.FoodItems;
import com.foodDelivery.website.repository.FoodItemsRepository;

@Service
public class FoodItemsService {
	@Autowired
	FoodItemsRepository itemRepo;
	
	
	public ResponseEntity<List<FoodItems>> getAllFoodItems(){
		List<FoodItems> itemsList = itemRepo.findAll();
		return new ResponseEntity<>(itemsList, HttpStatus.OK);
	}
	
	
	
	
	public FoodItemsDTO convertToDTO(FoodItems item) {
		FoodItemsDTO itemsDTO = new FoodItemsDTO();
		itemsDTO.setName(item.getItemName());
		itemsDTO.setPrice(item.getItemPrice());
		return itemsDTO;
		
		
	}
	
	
}
