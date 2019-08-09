package com.demo.hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class EmployeeDAO {
	private Connection connection;
	private PreparedStatement statement;

	public EmployeeDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC not found. " + e.getMessage());
		}
	}

	public Employee findEmployeeByNo(int EmpNo) {
		Employee employee = new Employee();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "hr",
					"password");
			System.out.println("Succesful connection");

			final String Statement = "select emp_no, first_name, last_name, gender, birth_date, hire_date from employees where emp_no = ?";

			PreparedStatement selectEmployees = connection.prepareStatement(Statement);
			// 1 is position of ? limit is the value set to it
			selectEmployees.setInt(1, EmpNo);

			ResultSet rs = selectEmployees.executeQuery();

			while (rs.next()) {
				Integer empNo = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String gender = rs.getString(4);
				Date birthDate = rs.getDate(5);
				Date hireDate = rs.getDate(6);

				employee.setEmpNo(empNo);
				employee.setFirstName(firstName);
				employee.setLastName(lastName);
				employee.setGender(gender);
				employee.setBirthDate(birthDate);
				employee.setHireDate(hireDate);				
			}
			System.out.println("Done");
			selectEmployees.close();
			connection.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Failed to connect. " + e.getMessage());
		}
		return employee;
	}
	
	public List<Employee> findAll(int limit) {
		List<Employee> employeeList = new ArrayList<Employee>();

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "hr",
					"password");
			System.out.println("Succesful connection");

			final String Statement = "select emp_no, first_name, last_name, gender, birth_date, hire_date from employees limit ?";

			PreparedStatement selectEmployees = connection.prepareStatement(Statement);
			// 1 is position of ? limit is the value set to it
			selectEmployees.setInt(1, limit);

			ResultSet rs = selectEmployees.executeQuery();

			while (rs.next()) {
				Integer empNo = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String gender = rs.getString(4);
				Date birthDate = rs.getDate(5);
				Date hireDate = rs.getDate(6);

				// Using Setter
				Employee employee = new Employee();
				employee.setEmpNo(empNo);
				employee.setFirstName(firstName);
				employee.setLastName(lastName);
				employee.setGender(gender);
				employee.setBirthDate(birthDate);
				employee.setHireDate(hireDate);

				// Using constructors
				Employee employee2 = new Employee(empNo, firstName, lastName, gender, birthDate, hireDate);

				employeeList.add(employee);
				System.out
						.println(String.format("Employee No: %s, Name: %s %s, Gender: %s, Birthdate: %s, Hire date: %s",
								empNo, firstName, lastName, gender, birthDate, hireDate));
			}
			System.out.println("Done");
			selectEmployees.close();
			connection.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Failed to connect. " + e.getMessage());
		}

		return employeeList;
	}

	public List<Employee> findAll() {
		List<Employee> employeeList = new ArrayList<Employee>();

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "hr",
					"password");
			System.out.println("Succesful connection");

			final String Statement = "select emp_no, first_name, last_name, gender, birth_date, hire_date from employees limit 10";

			PreparedStatement selectEmployees = connection.prepareStatement(Statement);

			ResultSet rs = selectEmployees.executeQuery();

			while (rs.next()) {
				Integer empNo = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String gender = rs.getString(4);
				Date birthDate = rs.getDate(5);
				Date hireDate = rs.getDate(6);

				// Using Setter
				Employee employee = new Employee();
				employee.setEmpNo(empNo);
				employee.setFirstName(firstName);
				employee.setLastName(lastName);
				employee.setGender(gender);
				employee.setBirthDate(birthDate);
				employee.setHireDate(hireDate);

				// Using constructors
				Employee employee2 = new Employee(empNo, firstName, lastName, gender, birthDate, hireDate);

				employeeList.add(employee);
				System.out
						.println(String.format("Employee No: %s, Name: %s %s, Gender: %s, Birthdate: %s, Hire date: %s",
								empNo, firstName, lastName, gender, birthDate, hireDate));
			}
			System.out.println("Done");
			selectEmployees.close();
			connection.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Failed to connect. " + e.getMessage());
		}

		return employeeList;
	}
	
	public void Save(Employee employee) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "hr", "password");
			connection.setAutoCommit(false);
			System.out.println("Succesful connection");

			final String Statement = "insert into (emp_no, first_name, last_name, gender, birth_date, hire_date) values (?,?,?,?,?,?)";

			PreparedStatement selectEmployees = connection.prepareStatement(Statement);
			// 1 is position of ? limit is the value set to it
			selectEmployees.setInt(1, employee.getEmpNo());
			selectEmployees.setString(2, employee.getFirstName());
			selectEmployees.setString(3, employee.getLastName());
			selectEmployees.setString(4, employee.getGender());
			selectEmployees.setDate(5, new Date(employee.getBirthDate().getTime()));
			selectEmployees.setDate(6, new Date(employee.getHireDate().getTime()));

			int rs = selectEmployees.executeUpdate();
			connection.commit();				
			System.out.println("Done");
			selectEmployees.close();
			connection.close();			
		} catch (SQLException e) {
			System.out.println("Failed to connect. " + e.getMessage());
		}
	}
}
