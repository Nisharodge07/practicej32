package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService
{
	@Autowired
	CustomerRepository customerRepo;

	
		
		@Override
		public Customer addCustomer(Customer c) {
			
			return customerRepo.save(c);
		}

		@Override
		public Customer getCustomer(int id) {
			
			return customerRepo.findById(id).orElse(null);
		}

		

		
	}



