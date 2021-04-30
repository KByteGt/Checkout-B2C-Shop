package com.b2cshop.api.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="INVOICE")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long invoice;
	private String invoice_id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date add_date;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="INVOICE", referencedColumnName="invoice")
	private List<InvoiceDetail> invoiceDetails;
	
	public Invoice() {}
	
	public Invoice(List<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
		this.invoice_id = UUID.randomUUID().toString();
		this.add_date = new Date();
	}

	//Get & Set
	
	public Long getInvoice() {
		return invoice;
	}

	public void setInvoice(Long invoice) {
		this.invoice = invoice;
	}

	public String getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}

	public Date getAdd_date() {
		return add_date;
	}

	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}

	public List<InvoiceDetail> getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}
		
}
