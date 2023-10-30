package com.MyApp.CRUD.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyApp.CRUD.Entity.Product;
import com.MyApp.CRUD.Repository.ProductRepository;

@Service
public class ProductService implements ProductServicee{
	@Autowired
	ProductRepository repo;
		
	
	
	public List<Product> viewAllProducts()
	{
		List<Product> productList =new ArrayList<>();
		try {
			productList=repo.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	public Product getById(int id)
	{
		Product product=null;
		try {
			product=repo.findById(id).get();
			
		} catch (Exception e) {
			
		}
		return product;
	}
	public List<Product> getByName(String name)
	{
		List<Product> productList=new ArrayList<Product>()
;		try {
			productList=repo.getByName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	public List<Product> getByType(String type)
	{
		List<Product> productList=new ArrayList<Product>();
		try {
			productList=repo.getByType(type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	public List<Product> getByCostMax(int maxCost)
	{
		List<Product> productList=new ArrayList<Product>();
		try {
			productList=repo.getByCostMax(maxCost);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	public List<Product> getByCostMin(int minCost)
	{
		List<Product> productList=new ArrayList<Product>();
		try {
			productList=repo.getByCostMin(minCost);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}
	
	public List<Product> getByCostRange(int minCost,int maxCost)
	{
		List<Product> productList=new ArrayList<Product>();
		try {
			productList=repo.getByCostRange(minCost,maxCost);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
		
	}
	
	
	
	public Product addProduct(Product product)
	{
		Product SavedProduct = null;
		try {
			SavedProduct=repo.save(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SavedProduct;
	}
	
	public List<Product> addMultipleProducts(List<Product> products)
	{
		List<Product> productList =new ArrayList<Product>();
		
		try {
			productList=repo.saveAll(products);
			
		} catch (Exception e) {
			
		}
		return productList;
	}
	
	public String deleteProductById(int id)
	{
		try {
			repo.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Deleted Successfully";
	}
	
}
