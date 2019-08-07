package Shapes;

public class Test {
	public static void main(String[] args) {
		IShape shape = new Circle();
		shape.ComputeArea1(25);
		
		shape = new Rectangle();
		shape.ComputeArea2(4,2);
		
		shape = new Square();
		shape.ComputeArea1(3);
	}	
}
