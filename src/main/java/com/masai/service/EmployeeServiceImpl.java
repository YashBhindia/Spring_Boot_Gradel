package com.masai.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Employee;
import com.masai.pojo.EmployeePojo;
import com.masai.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeedao;
	
	@Override
	public String createEmployee(EmployeePojo employeepojo) {
		Employee employee = new Employee();
		employee.setEmployeeId(employeepojo.getEmployeeId());
		employee.setEmployeeName(employeepojo.getEmployeeName());
		employee.setDesignation(employeepojo.getDesignation());
		employeedao.save(employee);
		return "saved";
	}

	
}
