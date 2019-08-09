package com.demo.hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {		
		try {
			//1. Load JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("JDBC found");
			
			//2. Connect to DB server
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employees", "hr","password");
			System.out.println("Succesful connection");
		
			final String Statement = "select emp_no, first_name, last_name, gender, birth_date, hire_date from employees limit 10";
			
			//3. Initialize prepared statement
			PreparedStatement selectEmployees = connection.prepareStatement(Statement);
			
			//4. Execute query
			ResultSet rs = selectEmployees.executeQuery();
			
			//5. Extract data from request set
			
			List<Employee> employeeList = new ArrayList<Employee>();
			while (rs.next()) {
				Integer empNo = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String gender = rs.getString(4);
				Date birthDate = rs.getDate(5);
				Date hireDate = rs.getDate(6);				
				
				Employee employee = new Employee();
				employee.setEmpNo(empNo);
				employee.setFirstName(firstName);
				employee.setLastName(lastName);
				employee.setGender(gender);
				employee.setBirthDate(birthDate);
				employee.setHireDate(hireDate);
				
				employeeList.add(employee);
				System.out.println(String.format(
						"Employee No: %s, Name: %s %s, Gender: %s, Birthdate: %s, Hire date: %s", 
						empNo, firstName, lastName, gender, birthDate, hireDate));							
			}
			System.out.println("Done");
			selectEmployees.close();
			connection.close();
			rs.close();	
			
			for (Employee employee: employeeList) {
				System.out.println(String.format(
						"Employee No: %s, Name: %s %s, Gender: %s, Birthdate: %s, Hire date: %s", 
						employee.getEmpNo(), employee.getFirstName(), 
						employee.getLastName(), employee.getGender(), 
						employee.getBirthDate(), employee.getHireDate()));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC driver not found. " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Unable to connect to Database. " + e.getMessage());
		}
		
	}
}
