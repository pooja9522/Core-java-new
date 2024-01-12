package in.co.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenrics {
	public static void main(String[] args) {
		ArrayList <String> s=new ArrayList<String>();
		s.add("laxman");
		s.add("pooja");
		s.add("vikash");
		s.add("pritee");
		String str=s.get(0);
		System.out.println(str);
		Iterator<String>it=s.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
		}
		
	}


