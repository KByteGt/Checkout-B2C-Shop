package com.b2cshop.api.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {
	
	
	private final String API = "localhost:";
	
	public double getCostItem(String itemId) {
		double cost = 0;
		
		
		
		return cost;
	}
	
	@PostMapping("/purchase")
	public Invoice addPurchase(@RequestBody Checkou)
			
}
