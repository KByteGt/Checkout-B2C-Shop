package com.b2cshop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b2cshop.api.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
