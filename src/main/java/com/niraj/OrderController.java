package com.niraj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	
	@GetMapping("/orders")
	public String orderList() {
		return "Order List by Order MIcro Service";
	}
}
