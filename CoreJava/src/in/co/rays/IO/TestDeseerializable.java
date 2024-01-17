package in.co.rays.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDeseerializable {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\pass\\serial.txt");
		
		ObjectInputStream object=new ObjectInputStream(file);
		MarkSheet m=(MarkSheet)object.readObject();
		
		
		System.out.println(m.name);
		System.out.println(m.physics);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		System.out.println(m.total);
	}

}
