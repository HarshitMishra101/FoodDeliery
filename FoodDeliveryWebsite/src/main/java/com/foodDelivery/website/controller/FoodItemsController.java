package com.foodDelivery.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodDelivery.website.dto.FoodItemsDTO;
import com.foodDelivery.website.dto.RestaurantDTO;
import com.foodDelivery.website.dto.RestaurantMenuDTO;
import com.foodDelivery.website.model.FoodItems;
import com.foodDelivery.website.model.Restaurant;
import com.foodDelivery.website.model.RestaurantMenu;
import com.foodDelivery.website.repository.FoodItemsRepository;
import com.foodDelivery.website.repository.RestaurantMenuRepository;
import com.foodDelivery.website.services.FoodItemsService;
import com.foodDelivery.website.services.RestaurantMenuService;

@RestController
@RequestMapping("fooditems")
public class FoodItemsController {
	
	@Autowired
	FoodItemsService itemsService;
	@Autowired
	RestaurantMenuService menuRepo;
	
	@GetMapping("/allitems")
	public ResponseEntity<List<FoodItems>> getAllFoodItems(){
		return itemsService.getAllFoodItems();
	}
	@GetMapping("/finditem/{id}")
	public ResponseEntity<List<RestaurantMenuDTO>> findItemFromRestaurants(@PathVariable int id){
		return menuRepo.findRestaurantsByItemId(id);
	}

	
}
