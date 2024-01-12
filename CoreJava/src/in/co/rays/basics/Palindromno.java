package in.co.rays.basics;

public class Palindromno {
	public static void main(String[] args) {
		int a=151;
		int b=a;
		int c=0;
		int d;
		while(b>0) {
		 d=b%10;
		c=c*10+d;
		b=b/10;
		}
		if(c==a){
			System.out.println("yes this is p num");
		
		}
		else {
			
			System.out.println("no this is not p num" );
		}

	}

	}
