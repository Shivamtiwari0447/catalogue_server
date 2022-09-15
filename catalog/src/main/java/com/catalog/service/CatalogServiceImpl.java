package com.catalog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalog.bean.Product;
import com.catalog.persistence.CatalogDao;

@Service
public class CatalogServiceImpl implements CatalogService {
	
	@Autowired
	private CatalogDao catalogDao;
	
	@Override
	public List<Product> getAllProducts(){
		return catalogDao.findAll();
		
	}
	
	@Override
	public Product getProductByCode(String code){
		return catalogDao.getProductByCode(code);
		
	}
	

}
