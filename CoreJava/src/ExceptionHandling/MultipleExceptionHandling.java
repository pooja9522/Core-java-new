package ExceptionHandling;

public class MultipleExceptionHandling {
	public static void main(String[] args) {
		try {
			
		 
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("divition"+   +c);
			
			String name=null;
			System.out.println(name.length());
			
			
			String s = "pooja";
			System.out.println(s.charAt(7));
			
			
			
		}catch (ArithmeticException e) {
			System.out.println(e);
			
		}catch (IndexOutOfBoundsException e) {
		System.out.println(e);
	
	}catch (NullPointerException e) {
		System.out.println(e);
	
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
