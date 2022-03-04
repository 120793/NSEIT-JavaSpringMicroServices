package com.example.customer.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.customerservice.model.Customer;
import com.example.customer.customerservice.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepo repo;

    @Override
	public String insertCustomer(Customer cname) {
		// TODO Auto-generated method stub
    	repo.save(cname);
		return "name Added";
	}


	@Override
	public List<Customer> displayAllcustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "Customer Deleted";
	}
   
	@Override
	public List<Customer> searchCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		return repo.searchCustomerByName(customerName);
	}


	@Override
	public List<Customer> searchCustomerBycustomerId(int cid) {
		// TODO Auto-generated method stub
		return repo.searchCustomerByCustomerId( cid);
	}


	
	}

	

	
	

