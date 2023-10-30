package com.MyApp.CRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyApp.CRUD.Entity.Product;
import com.MyApp.CRUD.Service.ProductService;

@RestController
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired 
	ProductService service;
	
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return service.addProduct(product);
	}
	
	///admin/addMultipleProduct
	@PostMapping("/addMultipleProduct")
	public List<Product> addMultipleProduct(@RequestBody List<Product> product )
	{
		return service.addMultipleProducts(product);
	}
}
