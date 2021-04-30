package com.b2cshop.api.model;

import java.util.List;

/*
{
	client: {
		firstName: "",
		lastName: "",
		email: ""
	},
	Item: ["", ""]
}
*/

public class CheckoutInfo {

	private Client client;
	private List<String> items;
	
	//Get & Set
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	
}
