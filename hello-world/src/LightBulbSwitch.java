
public class LightBulbSwitch {
	boolean on;
	
	public LightBulbSwitch(boolean on){
		this.on=on;
	}
	
	public void displayState() {
		System.out.println("Light Bulb is " + ((on) ? "On" : "Off"));
	}
	
	public static void main (String[] args) {
		LightBulbSwitch LightBulbSwitch = new LightBulbSwitch(true); 
		LightBulbSwitch.displayState();
	}
}
