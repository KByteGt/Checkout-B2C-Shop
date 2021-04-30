package com.b2cshop.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="INVOICE_DETAIL")
public class InvoiceDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long invoice_detail;
	private Long invoice;
	private String product_id;
	private double individual_cost;
	@Temporal(TemporalType.TIMESTAMP)
	private Date add_date;
	
	public InvoiceDetail() {}
	
	public InvoiceDetail(String product_id, double individual_cost) {
		this.product_id = product_id;
		this.individual_cost = individual_cost;
		this.add_date = new Date();
	}

	public Long getInvoice_detail() {
		return invoice_detail;
	}

	public void setInvoice_detail(Long invoice_detail) {
		this.invoice_detail = invoice_detail;
	}

	@JsonIgnore
	public Long getInvoice() {
		return invoice;
	}

	public void setInvoice(Long invoice) {
		this.invoice = invoice;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public double getIndividual_cost() {
		return individual_cost;
	}

	public void setIndividual_cost(double individual_cost) {
		this.individual_cost = individual_cost;
	}

	public Date getAdd_date() {
		return add_date;
	}

	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}

	@Override
	public String toString() {
		return "InvoiceDetail [invoice_detail=" + invoice_detail + ", invoice=" + invoice + ", product_id=" + product_id
				+ ", individual_cost=" + individual_cost + ", add_date=" + add_date + "]";
	}
}
