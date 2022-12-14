package com.catalog.service;

import java.util.List;
import java.util.Optional;

import com.catalog.bean.Product;

public interface CatalogService {
	
	public List<Product> getAllProducts();
	public Product getProductByCode(String code);


}
