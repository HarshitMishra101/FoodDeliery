package com.foodDelivery.website.services;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodDelivery.website.dto.RestaurantMenuDTO;
import com.foodDelivery.website.model.FoodItems;
import com.foodDelivery.website.model.Restaurant;
import com.foodDelivery.website.model.RestaurantMenu;
import com.foodDelivery.website.repository.RestaurantMenuRepository;

@Service
public class RestaurantMenuService {
	@Autowired
	RestaurantMenuRepository menuRepo;
	
	public ResponseEntity<List<RestaurantMenuDTO>> findRestaurantsByItemId(Integer itemId){
		return new ResponseEntity<>(menuRepo.findRestaurantIdByFoodItemId(itemId).stream().map(this:: convertToDTO).collect(Collectors.toList()), HttpStatus.OK);
	}
	public ResponseEntity<List<RestaurantMenuDTO>> findItemsByRestaurantId(int restaurantId){
		return new ResponseEntity<>(menuRepo.findFoodItemIdByRestaurantRestaurantId(restaurantId).stream().map(this::convertToDTO).collect(Collectors.toList()), HttpStatus.OK);
	}
	public RestaurantMenuDTO convertToDTO(RestaurantMenu rMenu) {
		RestaurantMenuDTO rMenuDTO = new RestaurantMenuDTO();
		
		rMenuDTO.setRestaurant(rMenu.getRestaurant());
		return rMenuDTO;
	}
	
}
