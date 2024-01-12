package in.co.rays.basics;

public class Sum1 {

	public static void main(String[] args) {
		for (int i = 1; i<= 14;i++) {   
			for (int j =1 ; j<=51 ;j++) {
				if(i>=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}          
			}	
			System.out.println();
		}
			
	}
		
}
