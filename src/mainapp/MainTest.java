package mainapp;

import com.example.service.ContractEmployeeRegisterationService;
import com.example.service.EmployeeRegisterationService;
import com.example.service.FullTimeEmployeeRegisterationService;
import com.example.service.PartTimeEmployeeRegistrationService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Employee;

public class MainTest {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String flag = null;
		EmployeeRegisterationService service = null;
		do {
			System.out.print("Enter Employee Type : ");
			String type = br.readLine();

			if ("contract".equalsIgnoreCase(type)) {
				service = new ContractEmployeeRegisterationService();
			} else if ("fulltime".equalsIgnoreCase(type)) {
				service = new FullTimeEmployeeRegisterationService();
			} else if ("parttime".equalsIgnoreCase(type)) {
				service = new PartTimeEmployeeRegistrationService();
			}

			service.getEmployeeInfo();

			System.out.print("Do you want to add new Employee (yes/no)?");
			flag = br.readLine();
		} while (flag.equalsIgnoreCase("yes"));

		for (int i = 0; i < Employee.getCount(); i++) {
			EmployeeRegisterationService.getEmployeeDB()[i].display();
		}

	}

}
