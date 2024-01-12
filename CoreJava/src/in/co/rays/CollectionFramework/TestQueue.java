package in.co.rays.CollectionFramework;

import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {
	public static void main(String[] args) {
		ArrayBlockingQueue a=new ArrayBlockingQueue(10);
		
		a.add(12);
		a.add(15);
		a.add("pooja");
		a.add("jawariya");
		a.add(2.0);
		a.add(10);
		a.add(30);
		a.add(40);
		a.add("kalll");
		a.add(2.00000);
	
		System.out.println(a);
		
		
	}

}
