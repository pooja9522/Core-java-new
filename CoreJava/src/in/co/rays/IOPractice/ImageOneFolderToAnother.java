package in.co.rays.IOPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ImageOneFolderToAnother {
	
	public static void main(String[] args) throws Exception {
		
	FileInputStream in=new FileInputStream("C:\\Users\\HP\\Desktop\\Io1\\Rp.jpg.jpg");
	FileOutputStream out=new FileOutputStream("C:\\Users\\HP\\Desktop\\lucky\\RPJ.jpg");
	
	int ch=in.read();
	while(ch!=-1) {
		out.write(ch);
		ch=in.read();
	}
	in.close();
	out.close();
	System.out.println("image aa gyi folder me");

		
	}

}
