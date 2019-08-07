package Shapes;

public class Rectangle implements IShape{

	@Override
	public void ComputeArea2(float x, float y) {
		// TODO Auto-generated method stub
		float Res = x * y;
		System.out.println("Rectangle: " + Res);
	}

	@Override
	public void ComputeArea1(float v) {
		// TODO Auto-generated method stub
		
	}

}
