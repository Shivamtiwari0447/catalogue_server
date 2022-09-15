package com.inventory.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.bean.Inventory;

public interface InventoryDao extends JpaRepository<Inventory, String> {
	Inventory getInventoryByProductCode(String productCode);

}
