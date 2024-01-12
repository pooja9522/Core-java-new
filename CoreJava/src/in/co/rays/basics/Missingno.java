package in.co.rays.basics;

public class Missingno {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,50,60};
		int[]b= {10,20,30,40,50,};
		
			int sum=0;
			int sum1=0;
			for (int i =0 ; i < a.length; i++) {
				 sum= sum+a[i];
				
			}
			for (int j = 0; j < b.length; j++) {
				sum= sum1+b[j];
			}
			System.out.println(sum-sum1);
			
		}
		

	}


