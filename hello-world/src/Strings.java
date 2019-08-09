import java.io.IOException;

//Other Way of Declaring Constant, by default static, public, and final

interface Constants{
	int CONS_MAX_AGE = 65;
}
class stringValidator{
	public void isNullorEmpty(String TestString){
		if("".equals(TestString)) {
			throw new IllegalArgumentException("String value cannot be empty or null.");			
		}	
	}
	
	public void isNullCheckedException(String TestString) throws IllegalArgumentException, Exception{
		if("".equals(TestString)) {
			throw new Exception("String value cannot be empty or null.");			
		}
	}
}

public class Strings {
	public static final int MAX_AGE = 65; //Declaration of Constant, Variable Names are Capital	
		
	public static void main(String[] args) {
		String str1 = "Hello";	//Allocates Memory Address ABC123
		String str2 = "Hello";	//Checks String Pool if Existing, then returns value of ABC123 Address
		System.out.println(str1 == str2); //Compares Memory address
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		//Calls Constants Declared in Interface
		int Age = Constants.CONS_MAX_AGE;
		
		String Number = "a";
		String errMessage = "";
		try {	
			stringValidator strVal = new stringValidator();
			strVal.isNullorEmpty(errMessage);
			Float fltNumber = Float.parseFloat(Number);			
			errMessage = "Walang mali.";
		}catch(NumberFormatException ex) {
			errMessage = "NumberFormat. " + ex.getMessage(); 
			ex.printStackTrace();
		}catch (NullPointerException ex) {
			errMessage = "NullPointer. " + ex.getMessage();
			ex.printStackTrace();
		}catch(Exception ex) {
			errMessage = "Ay Error. " + ex.getMessage();
			ex.printStackTrace();
		}finally {
			System.out.println(errMessage);			
		}
		
		try {
			//This is a valid syntax but not a good practice
			stringValidator strVal = new stringValidator();
			strVal.isNullCheckedException(errMessage);
		} catch (Exception ex){			
		}finally {
			
		}
			
	}	
}
