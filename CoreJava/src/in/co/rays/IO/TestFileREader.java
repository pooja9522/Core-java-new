package in.co.rays.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFileREader {
	
	public static void main(String[] args) throws Exception {
		try {
			
		
		FileReader file=new FileReader("C:\\Users\\HP\\Desktop\\pass\\pooja.txt");
		
		int ch=file.read();
		while(ch!=-1) {
			
			System.out.print((char)ch);
			ch=file.read();
			
		}
		file.close();
		
	} catch (FileNotFoundException e) {
		System.out.println();
		e.printStackTrace();
	}

}
}