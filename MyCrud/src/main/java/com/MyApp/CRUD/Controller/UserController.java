package com.MyApp.CRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MyApp.CRUD.Entity.Product;
import com.MyApp.CRUD.Service.ProductService;

@RestController()
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	ProductService service;
	
	@GetMapping(value= "/viewAllProducts")
	public List<Product> viewAllProducts()
	{
		return service.viewAllProducts();
	}
	
	///user/getById?id=1
	@GetMapping(value="/getById")
	public Product getById(@RequestParam("id") int id)
	{
		return service.getById(id);
	}
	
	///user/getByName?name=kitkat
	@GetMapping(value="/getByName")
	public List<Product> getByName(@RequestParam("name") String name)
	{
		return service.getByName(name);
	}
	
	///user/getByType?type=food
	@GetMapping(value="/getByType")
	public List<Product> getByType(@RequestParam("type") String type)
	{
		return service.getByType(type);
	}
	
	///user/getByCostMax?max=1000
	@GetMapping(value="/getByCostMax")
	public List<Product> getByCostMax(@RequestParam("max") int max)
	{
		return service.getByCostMax(max);
	}
	
	///user/getByCostMin?min=100
	@GetMapping(value="/getByCostMin")
	public List<Product> getByCostMin(@RequestParam("min") int min)
	{
		return service.getByCostMin(min);
	}
	
	///user/getByCostRange?min=100&max=1000
	@GetMapping(value="/getByCostRange")
	public List<Product> getByCostRange(@RequestParam("min") int min,@RequestParam("max") int max)
	{
		return service.getByCostRange(min, max);
	}
}
