package ExceptionHandling;

public class IndexOutOfBound {
	public static void main(String[] args) {
		String name= "abc";
		try {
			
		
		
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	

}
}