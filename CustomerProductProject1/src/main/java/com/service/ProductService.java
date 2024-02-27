package com.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.model.Product;


public interface ProductService 
{
	
	
	//for angular connection
	Product addProduct(Product p);
	List<Product> getProducts();
	
}
