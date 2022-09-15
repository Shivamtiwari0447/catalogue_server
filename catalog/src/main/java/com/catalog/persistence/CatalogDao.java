package com.catalog.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalog.bean.Product;

public interface CatalogDao extends JpaRepository<Product, String> {
	
	Product getProductByCode(String code);

}
