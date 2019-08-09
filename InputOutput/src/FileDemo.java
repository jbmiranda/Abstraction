import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		String FilePath = "/home/Java/message.txt";
		
		File newFile = new File(FilePath);
		
		System.out.println(newFile.isDirectory());
		
		if (newFile.exists() == false) {
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("message.txt created.");
		} else {
			System.out.println("message.txt found.");
			newFile.delete();
			System.out.println("message.txt deleted.");
		}
	}
}
