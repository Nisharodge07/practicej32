package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService
{
	
	
	//for angular connection
	Customer addCustomer(Customer c);
	Customer getCustomer(int id);
}
