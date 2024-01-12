package in.co.rays.basics;

public class Reverseno1 {
	public static void main(String[]args) {
		int a=1234567890;
		int b=0;
		int c;
		while(a!=0) {
			c=a%10;
			b=b*10+c;
			a=a/10;
	
		
		}
		System.out.println(b);
	}

}
