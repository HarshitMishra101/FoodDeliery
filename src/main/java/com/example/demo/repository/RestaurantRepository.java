package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.RestaurantList;

public interface RestaurantRepository extends JpaRepository<RestaurantList, Integer>{

}
