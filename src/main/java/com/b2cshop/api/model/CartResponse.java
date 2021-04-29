package com.b2cshop.api.model;

public class CartResponse {

	private Client client;
	private Item item;
	
	//Get & Set
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
}
