package in.co.rays.CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumaration {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add("pooja");
		System.out.println(v);
		
		Enumeration e=v.elements();
		
		v.add(2.00);
		v.add("pooja");
		v.add('p');
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
			
		}
		
	}

}
