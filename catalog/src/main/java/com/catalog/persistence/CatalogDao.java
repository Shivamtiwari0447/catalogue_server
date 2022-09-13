package com.catalog.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Catalog;

public interface CatalogDao extends JpaRepository<Catalog, Integer> {

}
