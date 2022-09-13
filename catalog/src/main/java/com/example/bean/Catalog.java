package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Catalog {
	@Id
	private Long id; 
    private String code;
    private String name;
    private String description;
    private double price;


}
