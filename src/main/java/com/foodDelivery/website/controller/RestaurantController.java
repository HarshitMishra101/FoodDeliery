package com.foodDelivery.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodDelivery.website.dto.RestaurantDTO;
import com.foodDelivery.website.dto.RestaurantMenuDTO;
import com.foodDelivery.website.model.FoodItems;
import com.foodDelivery.website.model.Restaurant;
import com.foodDelivery.website.services.RestaurantMenuService;
import com.foodDelivery.website.services.RestaurantServices;


@RestController
@RequestMapping("restaurant")
public class RestaurantController {
	@Autowired
	RestaurantServices resService;
	@Autowired
	RestaurantMenuService menuService;
	
	@GetMapping("/allrestaurants")
	public ResponseEntity<List<RestaurantDTO>> getAllRestaurant(){
		return resService.getAllRestaurant();
	}
	@GetMapping("/findrestaurant/{id}")
	public ResponseEntity<List<FoodItems>> getItemByRestaurant(@PathVariable int id){
		return resService.getRestaurants(id);
	}
	
	
}
