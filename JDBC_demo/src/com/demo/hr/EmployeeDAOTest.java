package com.demo.hr;

import java.util.List;
import java.util.Scanner;

public class EmployeeDAOTest {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> employeeList = employeeDAO.findAll(20);
		
		if (employeeList.size() != 0){
			for (Employee employee: employeeList) {
				System.out.println(String.format(
						"Employee No: %s, Name: %s %s, Gender: %s, Birthdate: %s, Hire date: %s", 
						employee.getEmpNo(), employee.getFirstName(), 
						employee.getLastName(), employee.getGender(), 
						employee.getBirthDate(), employee.getHireDate()));
			}
		}else {
			System.out.println("No record found.");
		}
	}
}
