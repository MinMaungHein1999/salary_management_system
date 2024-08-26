package com.example.model;

public class ContractEmployee extends Employee{
	private int contractDuration;
	private double contractAmount;
	private static int count;
	
	public ContractEmployee(String name,double basicSalary, int contractDuration, double contractAmount) {
		super(name, basicSalary);
		
		this.contractAmount = contractAmount;
		this.contractDuration = contractDuration;
		count++;
	}
	
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public double calculateSalary() {
		return this.contractAmount/this.contractDuration;
	}
	
	@Override
	public void display() {
		System.out.println("******Contract Employee*****");
		super.display();
	}
	
}
