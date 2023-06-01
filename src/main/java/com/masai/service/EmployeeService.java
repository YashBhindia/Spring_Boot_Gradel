package com.masai.service;



import java.util.List;

import com.masai.pojo.EmployeePojo;

public interface EmployeeService {

	public String createEmployee(EmployeePojo employeepojo);
	
	public List<EmployeePojo> getAllEmployee(); 
}
