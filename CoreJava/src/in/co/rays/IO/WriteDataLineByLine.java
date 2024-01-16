package in.co.rays.IO;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteDataLineByLine {
	
	public static void main(String[] args)throws Exception {
		
		FileWriter file =new FileWriter("C:\\Users\\HP\\Desktop\\pass\\pooja.txt");
		
		PrintWriter pw=new PrintWriter(file);
		
		for (int i = 1; i <=10; i++) {
			
			pw.println(i+"My Grantpa Is my best Teacher Always");
			
		}
		
		file.close();
		pw.close();
		System.out.println("cheak");
		
		
		
		
	}

}
