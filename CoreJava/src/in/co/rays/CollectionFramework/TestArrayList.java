package in.co.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		
	
		
		List list =new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		//create Itrator
		Iterator it=list.iterator();
		
	//	list.add(60);(concurrent modification exception)
	
		while (it.hasNext()) {
			System.out.println(it.next());
		
			//System.out.println(list);
			
		}
		
	}

}
