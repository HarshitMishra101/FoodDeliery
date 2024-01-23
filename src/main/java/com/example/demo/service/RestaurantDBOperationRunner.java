package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.RestaurantList;
import com.example.demo.repository.RestaurantRepository;

@Component
public class RestaurantDBOperationRunner implements CommandLineRunner{
	
	@Autowired
	RestaurantRepository restaurantRepo;

	@Override
	public void run(String... args) throws Exception {

		RestaurantList r1 = new RestaurantList("Balaji Foods",1,"Palwal","Good");
		RestaurantList r2 = new RestaurantList("Balaji Foods",2,"Palwal","Good");
		RestaurantList r3 = new RestaurantList("Balaji Foods",3,"Palwal","Good");
		RestaurantList r4 = new RestaurantList("Balaji Foods",4,"Palwal","Good");
		RestaurantList r5 = new RestaurantList("Balaji Foods",5,"Palwal","Good");
		RestaurantList r6 = new RestaurantList("Balaji Foods",6,"Palwal","Good");
		RestaurantList r7 = new RestaurantList("Balaji Foods",7,"Palwal","Good");
		RestaurantList r8 = new RestaurantList("Balaji Foods",8,"Palwal","Good");
		RestaurantList r9 = new RestaurantList("Balaji Foods",9,"Palwal","Good");
		RestaurantList r10 = new RestaurantList("Balaji Foods",10,"Palwal","Good");
		
		List<RestaurantList> restoList = new ArrayList<>();
		

		restoList.add(r1);
		restoList.add(r2);
		restoList.add(r3);
		restoList.add(r4);
		restoList.add(r5);
		restoList.add(r6);
		restoList.add(r7);
		restoList.add(r8);
		restoList.add(r9);
		restoList.add(r10);
		
		restaurantRepo.saveAll(restoList);
		
	}
	
	
}
