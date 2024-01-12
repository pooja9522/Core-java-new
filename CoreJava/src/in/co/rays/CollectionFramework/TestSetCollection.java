package in.co.rays.CollectionFramework;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Set;

public class TestSetCollection {
	public static void main(String[] args) {
		
    Set set =	new HashSet();
    set.add("laxman");
    set.add(12);
    set.add('p');
    set.add("true");
    set.add(12);
    System.out.println(set);
    Set set1=new HashSet();
    
    set1.add(12);
    set1.add(2);
    set1.add(3);
    set1.add(4);
    System.out.println(set1);
    set.addAll(set1);
    System.out.println(set);
    
		
	}

}
