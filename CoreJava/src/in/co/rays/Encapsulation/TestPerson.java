package in.co.rays.Encapsulation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName(" new year");
		p.setAddress("new busstand awantipur barodiya");
		Date d= new Date();
		System.out.println(d);
		SimpleDateFormat abc=new SimpleDateFormat("dd/MM/yyyy");
	    String g=abc.format(d);
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getDob());
		
		
	
	
	
	
	}
	

}
