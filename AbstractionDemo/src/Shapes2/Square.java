package Shapes2;

public class Square extends Shape{
	private int Length;
	
	@Override
	public void ComputeArea() {
		// TODO Auto-generated method stub
		this.area = Length*Length;
	}

}
