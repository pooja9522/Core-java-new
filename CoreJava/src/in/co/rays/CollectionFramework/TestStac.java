package in.co.rays.CollectionFramework;

import java.util.Stack;

public class TestStac {
	
	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push("pooja");
		s.push(20);
		s.push("priya");
		s.push("ram");
		s.add("laxman");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}

}
