/*
 * This is a Block Comment
 */
/**
 * 
 * @author Java This is a Documation comment
 */
// This is a Single-line comment


public class HelloWorld 
{
	public static void main(String[] agrs) 
	{
		// Print message		
		String name = "John Doe";
		int age = 45;  
		//System.out.println("Hello World!" + name);
		System.out.println(String.format("name=%s, age=%s",name,age));
		
		//Sample of Type Conversion
		//Up Casting
		byte x = 100;
		int y = x;
		
		//Down Casting/Type Casting
		int a = 127;
		byte b = (byte) a;
		System.out.println(String.format("This is a Byte:%s an Integer:%s", b, y));
		
		char letter = 'a';
		switch (letter) 
		{
			case 'a':
			case 'A':
				System.out.println("Letter A");
				break;
			
			case 'b':
				System.out.println("Letter B");
				break;
			default:
				System.out.println("Unkown");
				break;
		}
		
		int color = 1;
		String CN = (color == 1)?"Green":"Red";		
		System.out.println(CN);
		
		//Array Declarations:
		String[] Weekdays = {"Monday","Tuesday","Wednesday"};
		System.out.println(Weekdays.length);
		System.out.println(Weekdays[0]);
		
		String[] Months = new String[12];
		Months[0] = "January";
		System.out.println(Months[11]); //This will result to null					
	}
	
	public void Hello() 
	{
		System.out.println("Hello World!");
		Employee employee = new Employee();
		employee.setemployeedetails(123, "ernie", "miranda", 25, 15000F);
	}
	
	public void Hello(String Name) 
	{
		System.out.println("Hello " + Name);
	}
	
	public int add(int x, int y) 
	{
		/*int sum = x + y;
		return sum;*/
		return x + y;
	}
}