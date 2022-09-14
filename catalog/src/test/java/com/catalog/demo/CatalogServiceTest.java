package com.catalog.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.catalog.bean.Product;
import com.catalog.persistence.CatalogDao;
import com.catalog.service.CatalogServiceImpl;

@SpringBootTest
class CatalogServiceTest {
	
	@InjectMocks
	private CatalogServiceImpl service;
	
	@Mock
	private CatalogDao catalogDao;
	
	Product product;
	List<Product> products;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		service=null;
	}

	@Test
	void testgetProductByCode() {
		product=new Product(1L,"abc","something","this is something",150);
		Mockito.when(catalogDao.findProductByCode(product.getCode())).thenReturn(null);
		assertEquals(product, service.getProductByCode(product.getCode()));
	}
	@Test
	void testgetProductByCode1() {
		product=new Product();
		Mockito.when(catalogDao.findProductByCode(product.getCode())).thenReturn(null);
		assertEquals(product, service.getProductByCode(product.getCode()));
	}

}
