package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Employee;
import com.masai.pojo.EmployeePojo;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeePojo, Integer>{

	void save(Employee employee);

	

	

}
