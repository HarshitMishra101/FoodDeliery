package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Menu;
import com.example.demo.repository.MenuRepository;
@Component
public class MenuDBOperationRunner implements CommandLineRunner {
	@Autowired
	MenuRepository menuRepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Menu m1 = new Menu(1, "Paneer masala", 200);
		Menu m2 = new Menu(2, "Paneer roll", 220);
		Menu m3 = new Menu(3, "Chicken pasta", 350);
		Menu m4 = new Menu(4, "Mushroom Masala", 150);
		Menu m5 = new Menu(5, "Paneer masala", 200);
		Menu m6 = new Menu(6, "Palak Paneer", 200);
		Menu m7 = new Menu(7, "Chicken noodles", 200);
		Menu m8 = new Menu(8, "Chicken roll", 250);
		Menu m9 = new Menu(9, "Dosa", 50);
		Menu m10 = new Menu(10, "Paneer", 200);
		List<Menu> l1 = new ArrayList<>();
		l1.add(m1);
		l1.add(m2);
		l1.add(m3);
		l1.add(m4);
		l1.add(m5);
		l1.add(m6);
		l1.add(m7);
		l1.add(m8);
		l1.add(m9);
		l1.add(m10);
		menuRepo.saveAll(l1);
		
	}
	
}
