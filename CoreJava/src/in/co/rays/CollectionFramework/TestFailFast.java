package in.co.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFailFast {
	
	public static void main(String[] args) {
		
		ArrayList c= new ArrayList();
		
		c.add("pooja");
		c.add("pritee");
		c.add("sapna");
		c.add("apna");
		c.add("shital");
		System.out.println(c);
	
		
		Iterator it=c.iterator();
		
		//c.add("khushbu");
		
		while (it.hasNext()) {
			System.out.println(it.next());
			//System.out.println(c);
			c.add(10)	;
	
	System.out.println(c);
	
			
		}
		
	}

}
