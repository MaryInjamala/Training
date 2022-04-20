package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	List<Order> orders = new ArrayList<>();
	@Autowired
	orderRepository repository;
	
	void saveOrder(Order order) {
		repository.save(order);
		System.out.println("save method called");
	}
	
	public List<Order> getAllOrders(){
		return repository.findAll();
	}
		
	

}
