 package in.co.rays.CheakException;

 public class TestLoginException { 
	public static void main(String[] args) {
		
	   String name="pooja";
		
		if(name.equals("pooja")) {
			System.out.println("user name is valid");
		}else {
				try {
					throw new LoginException();
					
				} catch (LoginException e) {
					e.printStackTrace();
					
				}
			}
}
 }