package in.co.rays.IO;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class TestScanner {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file=new FileReader("C:\\Users\\HP\\Desktop\\pass\\pj.txt");
		
		Scanner sc=new Scanner(file);
		
		while (sc.hasNext()) {
			
		System.out.println(sc.nextLine());
			
		}
		
		file.close();
			
		}
		
	}


