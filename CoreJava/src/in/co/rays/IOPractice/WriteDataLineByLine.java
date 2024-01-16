package in.co.rays.IOPractice;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteDataLineByLine {
	public static void main(String[] args) throws Exception {
		
		FileWriter file=new FileWriter("C:\\Users\\HP\\Desktop\\pass\\Mumma.txt");
		
		PrintWriter pw=new PrintWriter(file);
		
		for (int i = 0; i<=5; i++) {
			
			pw.println(i+"my mom is my Best Friend");
			
			
		}
		file.close();
		pw.close();
		System.out.println("all are right plz cheak the folder");
		
	}

}
