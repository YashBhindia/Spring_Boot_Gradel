package com.masai.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		Employee em = employeedao.save(employee);
		if(em!=null) {
			return "employee saved succefully";
		}
		return "not saved";
	}

	@Override
	public List<EmployeePojo> getAllEmployee() {
		List<EmployeePojo> employeePojos = new ArrayList<>();
		List<Employee> employee = employeedao.findAll();
		for(Employee em:employee) {
			EmployeePojo employeePojo = new EmployeePojo();
			employeePojo.setEmployeeId(em.getEmployeeId());
			employeePojo.setEmployeeName(em.getEmployeeName());
			employeePojo.setDesignation(em.getDesignation());
			employeePojos.add(employeePojo);
		}
		return employeePojos;
	}

	@Override
	public String deleteEmployee(int employeeId) {
		Optional<Employee> em = employeedao.findById(employeeId);
		if(em.isPresent()) {
			employeedao.deleteById(employeeId);
			return "Deleted";
		}
		return "Id not found";
		
	}

	@Override
	public EmployeePojo getEmployeeById(int employeeId) {
		Employee employee = employeedao.getReferenceById(employeeId);
		EmployeePojo employeePojo = new EmployeePojo();
		employeePojo.setEmployeeId(employee.getEmployeeId());
		employeePojo.setEmployeeName(employee.getEmployeeName());
		employeePojo.setDesignation(employee.getDesignation());
		return employeePojo;
	}

	
}
