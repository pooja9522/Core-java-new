package in.co.rays.basics;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Parsemethod {

	public static void main(String[] args) {
	Date d= new Date();
	System.out.println(d);
	SimpleDateFormat abc=new SimpleDateFormat("dd/MM/yyyy");
	String g=abc.format(d);
	
System.out.println(g);
	}

}
