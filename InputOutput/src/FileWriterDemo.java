import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterDemo {
	public static void main(String[] args) {
		File targetFile1 = new File("/home/Java/application1.dat");
		File targetFile2 = new File("/home/Java/application2.dat");
		File targetFile3 = new File("/home/Java/application3.dat");
		
		try {
			PrintWriter printWriter = new PrintWriter(targetFile1);							
			printWriter.println("Hi!");
			printWriter.println("Hello!");
			printWriter.flush();
			
			FileWriter fileWriter = new FileWriter(targetFile3, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Hello world\n");
			bufferedWriter.write("Hello world\n");
			bufferedWriter.flush();
			
				
			
			fileWriter = new FileWriter(targetFile2, true);
			fileWriter.append("HelloWorld!");
			fileWriter.flush();
			System.out.println("Writing Complete");
			
			fileWriter.close();
			printWriter.close();
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
