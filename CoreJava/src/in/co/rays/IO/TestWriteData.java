package in.co.rays.IO;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriteData {
	
	public static void main(String[] args) throws Exception  {
		
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\pass\\pj.txt");
		
		file.write("i am pooja jawariya ");
		file.write("i love my family");
		file.close();
		System.out.println("Cheak c:\\Users\\HP\\Desktop\\pass\\pj.txt");
		
	}
	
	

}
