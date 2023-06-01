package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.pojo.EmployeePojo;
import com.masai.service.EmployeeService;


@RestController
public class Controller {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/createemployee")
	public String createEmployee(@RequestBody EmployeePojo employeePojo) {
		return this.employeeService.createEmployee(employeePojo);
	}
	
	@GetMapping("/getemployee")
	public List<EmployeePojo> getAllEmployee(){
		return this.employeeService.getAllEmployee();
	}
	
}
