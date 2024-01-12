package in.co.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TestListSet {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(55);
		list.add('t');
		list.add("rachna");
		list.add("true");
		list.add('t');
		System.out.println("list="+list);
		System.out.println(list.get(0));
		list.set(2, "pooja");
		System.out.println("list="+list);
		System.out.println("index of="+list.indexOf("pooja"));
		System.out.println("last index of="+list.lastIndexOf('t'));
		
	}

}
