
public class Employee {
	private String ID;
	private String FName;
	private String LName;
	private Float Salary;
	
	public Employee() {
		
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public Float getSalary() {
		return Salary;
	}

	public void setSalary(Float salary) {
		Salary = salary;
	}

	public Employee(String iD, String fName, String lName, Float salary) {
		super();
		ID = iD;
		FName = fName;
		LName = lName;
		Salary = salary;
	}
}
