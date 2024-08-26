package com.example.model;

public class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double hourlyRate;
	private static int count = 0;
	
	public PartTimeEmployee(String name, double basicSalary, int hourWorked, double hourlyRate) {
		super(name, basicSalary);
		this.hoursWorked = hourWorked;
		this.hourlyRate = hourlyRate;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public double calculateSalary() {
		return this.hourlyRate * this.hoursWorked;
	}
	
	@Override
	public void display() {
		System.out.println("******PartTime Employee*****");
		super.display();
	}
}


