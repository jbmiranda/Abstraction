
public class Bumper {
	int counter1 =0;
	static int counter2 =0;
	
	public void bump() {
		counter1 ++;
		counter2 ++;
	}
	
	public static void main(String[] args) {
		Bumper Bumper1 = new Bumper();
		Bumper Bumper2 = new Bumper();
		Bumper1.bump();
		Bumper1.bump();
		Bumper1.bump();
		Bumper1.display();
		Bumper2.bump();
		Bumper2.bump();		
		Bumper2.display();
	}
	
	public void display() {
		System.out.println("Counter1:" + counter1);
		System.out.println("Counter2:" + counter2);
	}
}
