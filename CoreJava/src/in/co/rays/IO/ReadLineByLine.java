package in.co.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadLineByLine {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file=new FileReader("C:\\Users\\HP\\Desktop\\pass\\lucky.txt");
		
		BufferedReader out=new BufferedReader(file);
	String line	=out.readLine();
	
	while(line!=null) {
		System.out.println(line);
		
		line=out.readLine();
	}
		
	out.close();
	System.out.println("folder me aa gya data");
		
	}

}
