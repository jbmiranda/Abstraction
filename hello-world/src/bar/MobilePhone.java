package bar;

public class MobilePhone {
	private String MobileNumber;
	public void setMobileNumber(String mobileNumber) {
		this.MobileNumber = mobileNumber;
	}
	
	private String getMobilePhone() {
		// TODO Auto-generated method stub
		return MobileNumber;
	}
	
	public void display() {
		System.out.println("Mobile Number: " + getMobilePhone());
	}
}
