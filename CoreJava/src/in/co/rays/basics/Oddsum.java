package in.co.rays.basics;

public class Oddsum {

	public static void main(String[] args) {
	int n=20;
	int count=0;
	int sum=0;
	int avg;
	for (int i = 1; i <=20; i++) {
		if (i%2==1) {
		
			sum=sum+i;
			count++;
		}	
		}
		avg=sum/count;
		System.out.println(avg);
		
	}

	}


