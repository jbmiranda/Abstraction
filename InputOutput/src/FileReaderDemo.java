import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderDemo {
	public static void main(String[] args) {
		String FileName = "/home/Java/employees.csv";
		File emplCSV = new File(FileName);
			
		FileReader csvReader = null;
		BufferedReader csvBReader = null;
		try {
			csvReader = new FileReader(emplCSV);
			csvBReader = new BufferedReader(csvReader);
			
			String line = "";
			List<Employee> empList = new ArrayList<Employee>();
			
			while ((line=csvBReader.readLine()) != null) {
				String[] fields = line.split(",");
				String EmployeeID = fields[0].toString();
				String EmployeeFName = fields[1].toString();
				String EmployeeLName = fields[2].toString();
				String EmployeeSalary = fields[3].toString();
				//System.out.println(line);
				
				Employee employee = new Employee(EmployeeID, EmployeeFName, EmployeeLName, Float.parseFloat(EmployeeSalary));
				empList.add(employee);
				//System.out.println(String.format("Employee ID: %s, Employee Name: %s %s, Employee Salary: %s", EmployeeID, EmployeeFName, EmployeeLName, EmployeeSalary));
			}
			
			for (Employee employee: empList) {
				System.out.println(String.format("Employee ID: %s, Employee Name: %s %s, Employee Salary: %s", 
						employee.getID(), employee.getFName(), employee.getLName(), employee.getSalary()));
			}
			
			
			
		} catch (FileNotFoundException e) {		
			System.out.println("not found! " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO Exception! " + e.getMessage());
		} finally {
			try {
				if(csvBReader != null) {
					csvBReader.close();
				}
				
				if(csvReader != null) {
					csvBReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
