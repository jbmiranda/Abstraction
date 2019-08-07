package Shapes;

public class Circle implements IShape{
	@Override
	public void ComputeArea1(float v) {
		// TODO Auto-generated method stub
		float Res = (float) (2 * 3.1415 * v);
		System.out.println("Circle: " + Res);
	}

	@Override
	public void ComputeArea2(float x, float y) {
		// TODO Auto-generated method stub
		
	}

}
