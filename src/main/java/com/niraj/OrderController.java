package com.niraj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/")
	public String welcomeRoute() {
		return "Welcome to <h1>Havells Project</h1>";
	}
	
	@GetMapping("/orders")
	public String orderList() {
		return "Order List by Order MIcro Service";
	}
}
