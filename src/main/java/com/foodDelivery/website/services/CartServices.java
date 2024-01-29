package com.foodDelivery.website.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodDelivery.website.dto.CartDTO;
import com.foodDelivery.website.exception.GlobalException;
import com.foodDelivery.website.exception.GlobalExceptionHandler;
import com.foodDelivery.website.model.AddToCartRequest;
import com.foodDelivery.website.model.Cart;
import com.foodDelivery.website.model.Customer;
import com.foodDelivery.website.model.FoodItems;
import com.foodDelivery.website.model.Restaurant;
import com.foodDelivery.website.repository.CartRepository;
import com.foodDelivery.website.repository.CustomerRepository;
import com.foodDelivery.website.repository.FoodItemsRepository;
import com.foodDelivery.website.repository.RestaurantRepository;

import jakarta.transaction.Transactional;


@Service
public class CartServices {
	@Autowired
	CartRepository cartRepo;
	@Autowired
	CustomerRepository cusRepo;
	@Autowired
	RestaurantRepository resRepo;
	@Autowired
	FoodItemsRepository foodrepo;
	@Autowired
	RestaurantServices resService;
	@Autowired
	CustomerService customerService;

	@Transactional
	public void addToCart(AddToCartRequest request) {
		Cart cart = new Cart();
        
        // Assuming the existence of findById methods in repositories
        Restaurant restaurant = resRepo.findById(request.getRestaurantId()).orElseThrow();
        Customer customer = cusRepo.findById(request.getCustomerId()).orElseThrow();
        List<FoodItems> foodItems = foodrepo.findAllById(request.getFoodItems());

        cart.setRestaurant(restaurant);
        cart.setCustomer(customer);
        cart.setFooditems(foodItems);

        cartRepo.save(cart);
	}
	public ResponseEntity<List<FoodItems>> searchCartById(int id) throws GlobalException{
		Optional<Cart> cartOptional = cartRepo.findById(id);
		if(cartOptional.isPresent()) {
			Cart cart = cartOptional.get();
			List<FoodItems> foodItems = cart.getFooditems();
			return new ResponseEntity<>(foodItems, HttpStatus.OK);
		}
		else {
			throw new GlobalException("The cart does not exist");
		}
	}		
	public ResponseEntity<?> getCartByCustomerId(int id) throws GlobalException{
		
		if(cartRepo.findCartByCustomerUserId(id) != null) {
			List<CartDTO> cartDTOList = cartRepo.findCartByCustomerUserId(id).stream().map(this::convertToDTO).collect(Collectors.toList());
			return new ResponseEntity<>(cartDTOList.toString(), HttpStatus.OK);
		}
		else {
			throw new GlobalException("The cart does not exist");
		}
		
		
	}
	public CartDTO convertToDTO(Cart cart) {
		CartDTO cartDTO = new CartDTO();
		cartDTO.setRestaurantDTO(resService.convertToDTO(cart.getRestaurant()));
		cartDTO.setCustomerDTO(customerService.convertToDTO(cart.getCustomer()));
		cartDTO.setFoodItems(cart.getFooditems());
		cartDTO.setCartId(cart.getCartId());
		cartDTO.calculateCartPrice();;
		return cartDTO;
	}
}

