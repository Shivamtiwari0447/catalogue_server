package com.inventory.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.bean.Inventory;
import com.inventory.service.InventoryService;

@RestController
public class InventoryResource {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping (path = "/code/{productCode}")
	public Inventory getInventoryItemByProductCode (@PathVariable("productCode") String productCode) {
		return inventoryService.getInventoryItemByProductCode(productCode);
	}

	@PutMapping (path = "/code/{productCode}/{availableQuantity}")
	public Optional<Inventory> updateInventoryByProductCode(@PathVariable("productCode") String productCode,@PathVariable("availableQuantity") int availableQuantity) {
		return inventoryService.updateInventoryByProductCode(productCode, availableQuantity);
		
	}

}
