package ExceptionHandling;

public class TestLoginExByObj {
	public static void main(String[] args) {
		String name="Admin";
		if(name.equals("Admi")) {
			System.out.println("user valid");
			}
		else {
			LoginExByObj l= new LoginExByObj();
			System.out.println(l);
		}
		
	}

}
