package in.co.rays.IOPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file=new FileReader("C:\\Users\\HP\\Desktop\\pass\\vishnu.txt");
		
		Scanner sc=new Scanner(file);
		
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		
		file.close();
		System.out.println("cheak the Vishnu folder");
		
		
		
		
	
		
	}

}
