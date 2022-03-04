package com.example.customer.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.customerservice.model.Customer;
import com.example.customer.customerservice.service.CustomerService;


@RestController
public class CustomerConroller {
     @Autowired
     CustomerService service;
     
     @GetMapping("/all")
 	public List<Customer> showAll(){
 		return service.displayAllcustomer();
 	}
 	
 	@PostMapping("/add")
 	public String addCustomer(@RequestBody Customer custmor) {
 		return service.insertCustomer(custmor);
 	}
 	
 	@DeleteMapping("/delete/{cid}")
 	public String deletecustomer(@PathVariable("cid") int cid) {
 		return service.deleteCustomer(cid);
 	}
 	
 	@GetMapping("/cusomername/{name}")
 	public List<Customer> searchByName(@PathVariable("name") String name) {
 			return service.searchCustomerByName(name);
 	}
 	
 	@GetMapping("/cid/{cid}")
 	public List<Customer> searchBycid(@PathVariable("cid") int cid) {
 			return service.searchCustomerBycustomerId(cid);
 	}


}
