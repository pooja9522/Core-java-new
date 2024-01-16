package in.co.rays.IOPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFileReader {
	
	public static void main(String[] args) throws Exception {
		
		
		try {
			
		
		
		FileReader file=new FileReader("C:\\Users\\HP\\Desktop\\pass\\vishnu.txt");
		
		int ch=file.read();
		
		while(ch!=-1) {
			
			System.out.println((char)ch);
			ch=file.read();
			
		}
		file.close();
		
		
	} catch (FileNotFoundException e) {
		System.out.println();
		e.printStackTrace();
	}
	
		
	}
		
		
		}


