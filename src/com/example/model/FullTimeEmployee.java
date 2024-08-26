package com.example.model;

public class FullTimeEmployee extends Employee{
	private double allowence;
	private double bonus;
	private static int count = 0;
	
	public FullTimeEmployee(String name, double basicSalary, double allowence, double bonus) {
		super(name, basicSalary);
		this.allowence = allowence;
		this.bonus = bonus;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public double calculateSalary(){
		return this.allowence + this.bonus + this.getBasicSalary();
	}
	
	@Override
	public void display() {
		System.out.println("******FullTime Employee*****");
		super.display();
	}
	
	
}
