package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.RestaurantList;

public interface RestaurantDao extends JpaRepository<RestaurantList, Integer>{

}
