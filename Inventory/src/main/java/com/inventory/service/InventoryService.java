package com.inventory.service;

import java.util.Optional;

import com.inventory.bean.Inventory;

public interface InventoryService {
	Inventory getInventoryItemByProductCode (String productCode);

	Optional<Inventory> updateInventoryByProductCode(String productCode, int availableQuantity);


}
