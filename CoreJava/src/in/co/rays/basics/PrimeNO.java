package in.co.rays.basics;

public class PrimeNO {

	public static void main(String[] args) {
		
		 int num=20;
		 int count=0;
		 
		for (int i=2 ; i < num; i++) {
			
			if (num%i==0) {
				count++;
				
				
			}
			
			
		}	 
			
		if(count==0) {
			System.out.println("this num is prime ");
		
		}
		else {
			System.out.println("this num is not prime");
		}
		

	}

}
