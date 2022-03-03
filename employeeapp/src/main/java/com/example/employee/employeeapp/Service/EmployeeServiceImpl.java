package com.example.employee.employeeapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.employeeapp.Repo.EmployeeRepo;
import com.example.employee.employeeapp.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepo repo;
	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
