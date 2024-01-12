package in.co.rays.basics;

public class Amonstagno {

	public static void main(String[] args) {
		int a=153;
		int b=0;
		int c;
		int d=a;
		while(d>0) {
		c=d%10;
		b=b+(c*c*c);
		 d=d/10;
	 }
		if(b==a) {
			System.out.println("yes this num are amonstang");
			
			
			 
				
			}
		else {
			System.out.println("no this num are not aonstang");
		}
		

	}

}
