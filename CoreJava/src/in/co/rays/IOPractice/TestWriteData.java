package in.co.rays.IOPractice;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriteData {
	
	public static void main(String[] args) throws Exception {
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\pass\\vishnu.txt");
		
		file.write("i am brave");
		file.write("he is a nice person");
		file.write("i am very imprasive about the goel");
		file.write(1200);
		
		file.close();
		System.out.println("cheak the folder");
		
		
		
		
	}

}
