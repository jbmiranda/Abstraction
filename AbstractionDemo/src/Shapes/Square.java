package Shapes;

public class Square implements IShape{

	@Override
	public void ComputeArea1(float v) {
		// TODO Auto-generated method stub
		float Res = v * v;
		System.out.println("Square: " + Res);
	}

	@Override
	public void ComputeArea2(float x, float y) {
		// TODO Auto-generated method stub
		
	}

}
