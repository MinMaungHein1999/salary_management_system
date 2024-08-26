package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.ContractEmployee;
import com.example.model.Employee;
import com.example.model.FullTimeEmployee;
import com.example.model.PartTimeEmployee;

public class EmployeeRegisterationService {
	public static Employee[] employeeDB =new Employee[1000];
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Employee employee;
	
	public EmployeeRegisterationService() {
		this.employee = new Employee();
	}
	
	public void getEmployeeInfo() throws IOException {
		
		this.commonEmployeeInfo();
		Employee employee = this.employeeInfo();
		employeeDB[Employee.getCount()-1] = employee;
	}
	
	public Employee employeeInfo() throws IOException {
		return null;
	}
	
	public void commonEmployeeInfo() throws IOException {
		System.out.print("Enter Emp Name : ");
		this.employee.setName(br.readLine());
		System.out.print("Enter Emp Basic Salary : ");
		this.employee.setBasicSalary(Double.parseDouble(br.readLine()));
	}

	public static Employee[] getEmployeeDB() {
		return employeeDB;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
