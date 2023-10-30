package com.MyApp.CRUD.Service;

import java.util.List;

import com.MyApp.CRUD.Entity.Product;

public interface ProductServicee {	
	
	public List<Product> viewAllProducts();
	public Product getById(int id);
	public List<Product> getByName(String name);
	public List<Product> getByType(String type);
	public List<Product> getByCostMax(int maxCost);
	public List<Product> getByCostMin(int minCost);
	public List<Product> getByCostRange(int minCost,int maxCost);
	
	
	
	public Product addProduct(Product product);
	public List<Product> addMultipleProducts(List<Product> products);
	
	
}
