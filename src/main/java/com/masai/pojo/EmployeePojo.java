package com.masai.pojo;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class EmployeePojo {

	@Id
	private int employeeId;
	private String employeeName; 
	private String designation;
}
