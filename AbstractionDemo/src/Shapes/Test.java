package Shapes;

public class Test {
	public static void main(String[] args) {
		IShape shape = new Circle();
		shape.ComputeArea();
		
		shape = new Rectangle();
		shape.ComputeArea();
		
		shape = new Square();
		shape.ComputeArea();
	}	
}
