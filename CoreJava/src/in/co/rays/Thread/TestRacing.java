package in.co.rays.Thread;

public class TestRacing {
	
	public static void main(String[] args) {
		
		Racing r1=new Racing("pooja");
		Racing r2=new Racing("pritee");
		
		r1.start();
		r2.start();
		
	}

}
