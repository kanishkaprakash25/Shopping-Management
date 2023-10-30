package com.MyApp.CRUD.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String type;
	private int cost;
	private String description;
	private boolean available;
	
}
