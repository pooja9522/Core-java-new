package ExceptionHandling;

public class LoginException extends Exception {
	
	public LoginException() {
		super("user invalid");
	}

}
