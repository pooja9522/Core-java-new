package in.co.rays.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		List list =new ArrayList();
		
		list.add(new Marksheet(5,"pooja",60));
		list.add(new Marksheet(10,"pritee",70));
		list.add(new Marksheet(7,"laxman",80));
		list.add(new Marksheet(6,"vikash",70));
		list.add(new Marksheet(8,"deven",50));
		list.add(new Marksheet(4,"shital",55));
		
		Collections.sort(list,new orderByNameAsc());
		
		System.out.println(list);
		
        List list1 =new ArrayList(list);
      
        Collections.sort(list1, new OrderBynameDesc());
        
        System.out.println(list1);
        
		List list2  =new ArrayList(list);
		
		Collections.sort(list2, new OrderByIdAsc());
		
		System.out.println(list2);
		
		List list3 =new ArrayList(list);
		
		Collections.sort(list3, new OrderByMarksAsc());
		System.out.println(list3);
	}

}
