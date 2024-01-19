package in.co.rays.Java8;

public class TestByLaambda {
	
	public static void main(String[] args) {
		
		Hello h=()->{
			System.out.println("Test by Lambda expression");
		};
		h.say();
	}

}
