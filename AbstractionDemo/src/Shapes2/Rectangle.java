package Shapes2;

public class Rectangle extends Shape{
	private int Length;
	private int Width;
	@Override
	public void ComputeArea() {
		// TODO Auto-generated method stub
		this.area = Length*Width;
	}

}
