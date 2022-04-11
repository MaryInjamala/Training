package com.rakuten;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;



	@PostMapping
	void saveOrder(@RequestBody Order order) {
		System.out.println("created succesfully");
		System.out.println(order.getItem());
		System.out.println(order.getPrice());
	
		orderService.save(order);
	}



}
