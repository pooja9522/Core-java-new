package in.co.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) {
		List list=new ArrayList();
		
	list.add(new Marksheet(3,"pooja",90));
	list.add(new Marksheet(6,"laxman",92));
	list.add(new Marksheet(2,"pritee",87));
	list.add(new Marksheet(5,"vikash",99));
	list.add(new Marksheet(1,"vishnu",90));
	
    Collections.sort(list);

	System.out.println(list);
	
		
	}

}
