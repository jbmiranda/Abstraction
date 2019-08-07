import java.util.Scanner;

public class Estimator {
	float fltFileSize = 0;
	float fltDownloadSpeed = 0;
	
	int intHour = 0;
	int intMins = 0;
	int intSecs = 0;
		
	public static void main(String[] args) {
		Estimator NewEstimator = new Estimator();
		
		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter file size (MB):");
		String strFileSize = inScanner.nextLine();		
		System.out.println("Enter download speed (MB/sec (MB):");
		String strSpeed = inScanner.nextLine();
		
		NewEstimator.Compute(strFileSize, strSpeed);
		NewEstimator.Display(NewEstimator.intHour, NewEstimator.intMins, NewEstimator.intSecs);
		
		System.out.println("Continue? (y/n):");
		//String strContinue = inScanner.nextLine();
		inScanner.close();
	}
	
	public void Compute(String FileSize, String Speed) {
		this.fltFileSize = Float.parseFloat(FileSize);
		this.fltDownloadSpeed = Float.parseFloat(Speed);
		
		float fltTotalTime = (this.fltFileSize) * (1 / this.fltDownloadSpeed);
		
		int intTotalHours = (int) fltTotalTime / 3600;
		int intTotalMins = (int) (fltTotalTime % 3600) / 60;
		int intTotalSecs = (int) fltTotalTime - (intTotalHours * 3600) - (intTotalMins * 60);
        
		this.intHour = intTotalHours;
		this.intMins = intTotalMins;
		this.intSecs = intTotalSecs;        
	}
	
	public void Display(int Hours, int Mins, int Secs) {
		System.out.println(String.format("This download will take approximately %s hours %s minutes %s seconds", Hours, Mins, Secs));
	}
}
