package com.inventory.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.bean.Inventory;
import com.inventory.persistence.InventoryDao;

@Service
public class InventoryImpl implements InventoryService {
	
	@Autowired
	private InventoryDao inventoryDao;

	@Override
	public Inventory getInventoryItemByProductCode(String productCode) {
		return inventoryDao.getInventoryByProductCode(productCode);
	}

	@Override
	public Optional<Inventory> updateInventoryByProductCode(String productCode, int availableQuantity) {
		Inventory item=inventoryDao.getInventoryByProductCode(productCode);
		int quantity=item.getAvailableQuantity();
		item.setAvailableQuantity(quantity+availableQuantity);
		Inventory item1=inventoryDao.save(item);
		if(item1!=null)
			return Optional.of(item1);
		else 
			return null;

	}

}
