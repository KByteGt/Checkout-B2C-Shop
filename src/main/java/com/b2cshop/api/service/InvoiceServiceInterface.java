package com.b2cshop.api.service;

import java.util.List;

import com.b2cshop.api.model.Invoice;

public interface InvoiceServiceInterface {

	public void createNewInvoice(Invoice invoice);
	
	public List<Invoice> listInvoice();
}
