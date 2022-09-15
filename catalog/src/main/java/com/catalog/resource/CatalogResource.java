package com.catalog.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.bean.Product;
import com.catalog.service.CatalogServiceImpl;

@RestController
public class CatalogResource {
	
	@Autowired
	private CatalogServiceImpl catalogService;
	
	@GetMapping (path = "/products")
	public List<Product> listAllProducts(){
		return catalogService.getAllProducts();	
	}
	
	@GetMapping (path = "/products/code/{code}")
	public Product getProductByCode(@PathVariable("code") String code){
		return catalogService.getProductByCode(code);		
	}

}
