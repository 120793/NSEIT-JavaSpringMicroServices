package com.example.employee.employeeapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.employeeapp.Service.EmployeeService;
import com.example.employee.employeeapp.model.Employee;

@RestController
public class EmployeeController {
@Autowired 
EmployeeService service;

@GetMapping("/all")
public List<Employee> showAllEmps() {
	return service.getAllEmps();
	
}
}
