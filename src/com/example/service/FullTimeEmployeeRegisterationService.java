package com.example.service;

import java.io.IOException;
import com.example.model.FullTimeEmployee;

public class FullTimeEmployeeRegisterationService extends  EmployeeRegisterationService {
	
	@Override
	public FullTimeEmployee employeeInfo() throws IOException{
		System.out.print("Enter Allowence : ");
		Double allowence = Double.parseDouble(br.readLine());
		System.out.print("Enter bonus : ");
		Double bonus = Double.parseDouble(br.readLine());
		
		FullTimeEmployee fulltimeEmp = new FullTimeEmployee(this.getEmployee().getName(), this.getEmployee().getBasicSalary(), allowence, bonus);
		return fulltimeEmp;
	}
}
