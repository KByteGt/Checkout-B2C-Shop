package com.b2cshop.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.b2cshop.api.model.Invoice;
import com.b2cshop.api.repository.InvoiceRepository;

public class InvoiceService implements InvoiceServiceInterface {

	@Autowired
	private InvoiceRepository repository;
	
	@Override
	public void createNewInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		this.repository.save(invoice);
	}

	@Override
	public List<Invoice> listInvoice() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

	
}
