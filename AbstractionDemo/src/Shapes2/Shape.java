package Shapes2;

public abstract class Shape {
	protected float area;
	
	public abstract void ComputeArea();
	
	public final void Display() {
		System.out.println("Area: " + area);
	}
}
