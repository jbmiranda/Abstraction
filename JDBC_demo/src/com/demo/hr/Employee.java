package com.demo.hr;

import java.util.Date;

public class Employee {
	private int empNo;
	private String firstName;
	private String lastName;
	private String gender;
	private Date birthDate;
	private Date hireDate;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Employee(int empNo, String firstName, String lastName, String gender, Date birthDate, Date hireDate) {
		super();
		this.empNo = empNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
	}
}
