package in.co.rays.CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort {
	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		list.add(1100);
		list.add(300);
		list.add(300);
		list.add(400);
		list.add(800);
		
    Collections.sort(list);
    Iterator<Integer>it= list.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    
		
		
	}

	private static Iterator<Integer> itrator() {
		// TODO Auto-generated method stub
		return null;
	}

}
