package in.co.rays.IOPractice;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyBoard {
	public static void main(String[] args) throws Exception {
		
		InputStreamReader inReader=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(inReader);
		PrintWriter pw=new PrintWriter(new FileWriter("C:\\Users\\HP\\Desktop\\pass\\vishnu.txt"));
		String line=br.readLine();
		while(!line.equals("pooja")) {
		pw.println(line);
		
		line=br.readLine();
		
		
	}
	br.close();
	pw.close();
	System.out.println("band kro or filo me read kro");
	
	
	}	
}