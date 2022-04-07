package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	List<Order> orders = new ArrayList<>();
	
	@PostMapping
	void addOrder(@RequestBody Order order) {
		System.out.println(order.getProduct());
		System.out.println(order.getPrice());
		orders.add(order);
		
	}
	
	@GetMapping
	List<Order> getOrders(){
		return orders;
	}

}
