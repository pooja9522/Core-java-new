package in.co.rays.Oops;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPersonFiveC {
	public static void main(String[] args) {
		PersonFiveC r=new PersonFiveC();
	r.setname("pooja");
	r.setaddress("shajapur");
	Date d= new Date();
	System.out.println(d);
	SimpleDateFormat abc=new SimpleDateFormat("dd/MM/yyyy");
    String g=abc.format(d);
	r.setAvg(25);
	System.out.println(r.getName()+" "+r.getAddress()+" "+r.getDob()+" "+r.getAvg());
		
		
		
	}


}
