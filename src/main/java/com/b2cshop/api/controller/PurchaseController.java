package com.b2cshop.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.b2cshop.api.model.CheckoutInfo;
import com.b2cshop.api.model.Client;
import com.b2cshop.api.model.Invoice;
import com.b2cshop.api.model.InvoiceDetail;
import com.b2cshop.api.model.ItemResponse;
import com.b2cshop.api.service.InvoiceService;


@RestController
public class PurchaseController {
	@Autowired
	private InvoiceService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//API URL
	private final String API = "http://localhost:2500/api/item/price/";
	
	public double getCostItem(String itemId) {
		double cost = 0;
		
		ItemResponse response = restTemplate.getForObject(API+itemId, ItemResponse.class);
		cost = response.getCost();
		
		return cost;
	}
	
	@PostMapping("/purchase")
	public Invoice addPurchase(@RequestBody CheckoutInfo checkout) {
		System.out.println(" New request" + checkout);
		List<InvoiceDetail> invoiceDetails = new ArrayList<InvoiceDetail>();
		
		for(String id : checkout.getItems()) {
			invoiceDetails.add( new InvoiceDetail(id, getCostItem(id)));
		}
		
		Client client = checkout.getClient();
		
		Invoice invoice = new Invoice(invoiceDetails, client.getFirstName(), client.getLastName(), client.getEmail());
		service.createNewInvoice(invoice);
		
		return invoice;
	}
	
	@GetMapping("/purchase")
	public List<Invoice> getPurchases(){
		return service.listInvoice();
	}
			
}
