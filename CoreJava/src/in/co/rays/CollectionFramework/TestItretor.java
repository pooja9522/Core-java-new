package in.co.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

   public class TestItretor {
	   
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add(20);
		list.add('l');
		list.add("pooja");
		list.add("p");
		
		System.out.println(list);
		
		System.out.println("size of="+list.size());
		
		for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));	
		}
		for(Object object : list) {
			System.out.println(object);
		}
		Iterator it =list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
			
			}
		System.out.println(list);
		
	}

}
