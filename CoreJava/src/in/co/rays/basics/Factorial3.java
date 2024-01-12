package in.co.rays.basics;

public class Factorial3 {
	public static void main(String []args) {
	int a=1;
	int b=1;
	
	while(a<=3){
		b=a*b;
		a++;
	}
	System.out.println(b);	
	}

}
