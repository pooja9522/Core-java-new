package in.co.rays.UnCheakedException;

public class TestLoginException {
	public static void main(String[] args) {
		
	
	String name = "laxman";
	if(name.equals("laxma")) {
		System.out.println("yes this is true");
	}else {
		LoginException l=new LoginException();
		System.out.println(l);
		
		
		
	}

}
}