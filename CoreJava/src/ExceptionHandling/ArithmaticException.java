package ExceptionHandling;

public class ArithmaticException {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
		
			System.out.println("divition"+   +c);
				
		} catch (Exception e) {
		
			System.out.println(e);
		}
		

	}
}
