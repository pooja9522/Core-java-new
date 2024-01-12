package ExceptionHandling;

public class TestLoginException {
	public static void main(String[] args) {
		String name="admin";
		if (name.equals("ad")) {
			System.out.println("user valid");
	}
		else {
			try {
				throw new LoginException();
			}	catch(Exception e) {
		System.out.println(e.getMessage());
					}
						
					}
					
				}
			
}
		