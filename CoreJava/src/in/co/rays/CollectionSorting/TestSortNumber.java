package in.co.rays.CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSortNumber {
	
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(200);
		list.add(80);
		list.add(60);
		list.add(99);
		Collections.sort(list);
		Iterator <Integer>it=list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
			
		}
		
		
		
	}

}
