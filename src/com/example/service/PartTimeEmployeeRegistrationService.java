package com.example.service;

import java.io.IOException;
import com.example.model.PartTimeEmployee;

public class PartTimeEmployeeRegistrationService extends EmployeeRegisterationService {
	
	@Override
	public PartTimeEmployee employeeInfo() throws IOException{
		System.out.print("Enter Hours Worked : ");
		int hoursWorked = Integer.parseInt(br.readLine());
		System.out.print("Enter Hourly Rate : ");
		Double hourlyRate = Double.parseDouble(br.readLine());
		
		PartTimeEmployee parttimeEmployee = new PartTimeEmployee(this.getEmployee().getName(), this.getEmployee().getBasicSalary(), hoursWorked, hourlyRate);
		return parttimeEmployee;
	}
}
