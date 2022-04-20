package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	List<Order> orders = new ArrayList<>();
	
	@PostMapping("/order")
	@ResponseStatus(code = HttpStatus.CREATED)
	void CreateOrder(@RequestBody Order order) {
		orders.add(order);
		orderService.saveOrder(order);
	}
	@GetMapping
	List<Order> getUsers() {
		return orders;
	}
}
