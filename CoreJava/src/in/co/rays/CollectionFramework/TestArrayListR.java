package in.co.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListR {
	public static void main(String[] args) {
		
		ArrayList A=new ArrayList();
		
		//add different element in the collection
		
		A.add(12);
		A.add("laxman");
		A.add("billu");
		A.add("pritee");
		A.add("Mp04");
		A.add("ca vikash");
		A.add(20.24);
		A.add(true);
		System.out.println(A);
		
		//fetch the element by index number
		
		//int i=(int) A.get(0);
	//	String S=(String) A.get(1);
		//double d=(double) A.get(6);
		
	//System.out.println(i);
//	System.out.println(S);
//	System.out.println(d);
		A.get(0);
		System.out.println(A.get(0));
		A.get(5);
		System.out.println(A.get(5));
		System.out.println(A.get(1));
		System.out.println(A.get(2));
		System.out.println(A.get(3));
		System.out.println(A.get(4));
		System.out.println(A.get(6));
		System.out.println("index of laxman="+      A.indexOf("laxman"));
		
		A.set(2, "jawariya");
		System.out.println(A);
		
		//A.remove(6);
		//System.out.println(A);
		//get  all element
		
		Iterator it=A.iterator();
		
		
	          while (it.hasNext()) {
			System.out.println(it.next());
			
			
		}
	          ArrayList A1= new ArrayList();
	          A1.add(21);
	          A1.add("laxman");
	          A1.add(2.0);
	          System.out.println(A1);
	          
	         A.addAll(A1);
	         System.out.println(A);
	}
	

}
