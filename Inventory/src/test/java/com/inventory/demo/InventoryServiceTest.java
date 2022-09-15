package com.inventory.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.inventory.bean.Inventory;
import com.inventory.persistence.InventoryDao;
import com.inventory.service.InventoryImpl;

@SpringBootTest
class InventoryServiceTest {
	
	@InjectMocks
	private InventoryImpl service;
	
	@Mock
	private InventoryDao inventoryDao;
	
	Inventory inventory;
	List<Inventory> inventoryItems;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		service=null;
	}

	@Test
	void testInventory() {
		inventory=new Inventory(1L,"abc",120);
		Mockito.when(inventoryDao.getInventoryByProductCode(inventory.getProductCode())).thenReturn(inventory);
		assertEquals(inventory, service.getInventoryItemByProductCode(inventory.getProductCode()));
	}
	@Test
	void testInventory1() {
		inventory=new Inventory();
		Mockito.when(inventoryDao.getInventoryByProductCode(inventory.getProductCode())).thenReturn(null);
		assertEquals(null, service.getInventoryItemByProductCode(inventory.getProductCode()));
	}

}
