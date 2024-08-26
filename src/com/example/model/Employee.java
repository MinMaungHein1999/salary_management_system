package com.example.model;

public class Employee {
	
	private String name;
	private int employeeId;
	private double basicSalary;
	private static int count = 0;
	
	public Employee() {}
	
	public Employee(String name, double basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
		++count;
		this.employeeId = count;
	}
	
	public double calculateSalary() {
		return this.basicSalary;
	}
	
	public double getBasicSalary() {
		return this.basicSalary;
	}
	
	public static int getCount() {
		return count;
	}
	
	
	
	public void display() {
		System.out.println("Employee name : " + this.name);
		System.out.println("Employee Id : " + this.employeeId);
		System.out.println("Basic Salary  : " + this.basicSalary);
		System.out.println("Actual Salary : " + this.calculateSalary());
		System.out.println();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", basicSalary=" + basicSalary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
}
