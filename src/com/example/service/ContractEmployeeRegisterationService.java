package com.example.service;

import java.io.IOException;

import com.example.model.ContractEmployee;

public class ContractEmployeeRegisterationService extends EmployeeRegisterationService {
	
	@Override
	public ContractEmployee employeeInfo() throws IOException{
		System.out.print("Enter Contract Duration : ");
		int duration = Integer.parseInt(br.readLine());
		System.out.print("Enter Contract Amount : ");
		Double amount = Double.parseDouble(br.readLine());
		
		ContractEmployee contractEmp = new ContractEmployee(this.getEmployee().getName(), this.getEmployee().getBasicSalary(), duration, amount);
		return contractEmp;
	} 
	
}
