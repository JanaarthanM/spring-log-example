package com.example.demo.propsfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Employee {

	@Value("${emp.name}")
	private String empName;

	public Employee() {

	}

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
