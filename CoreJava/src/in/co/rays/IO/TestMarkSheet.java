package in.co.rays.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import in.co.rays.Comparator.Marksheet;

public class TestMarkSheet {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file=new FileOutputStream("C:\\Users\\HP\\Desktop\\pass\\serial.txt");
		
		ObjectOutputStream object=new ObjectOutputStream(file);
		
		MarkSheet m=new MarkSheet();
		
		m.name="pooja";
		m.physics=100;
		m.chemistry=98;
		m.maths=78;
		
		object.writeObject(m);
		
		System.out.println("change object to byeString");
		
		file.close();
		object.close();
		

		
		
	}

}
