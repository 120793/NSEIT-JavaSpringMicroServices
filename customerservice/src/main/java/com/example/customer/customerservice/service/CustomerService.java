package com.example.customer.customerservice.service;

import java.util.List;

import com.example.customer.customerservice.model.Customer;


public interface CustomerService  {
	public String insertCustomer(Customer cname);
    public List<Customer> displayAllcustomer();
    public String deleteCustomer(int cid);
    public List<Customer> searchCustomerByName(String customerName);
	public List<Customer> searchCustomerBycustomerId(int cid);
}
