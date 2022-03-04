package com.example.customer.customerservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.customer.customerservice.model.Customer;

@Repository
@Transactional
public interface CustomerRepo extends JpaRepository<Customer,Integer> {

	List<Customer> searchCustomerByName(String customerName);

	List<Customer> searchCustomerByOrderId(int oid);

	List<Customer> searchCustomerByCustomerId(int cid);
     
}
