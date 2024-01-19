package in.co.rays.Java8;

public class TestByAnnoymous {
	public static void main(String[] args) {
		Hello h=new Hello() {

			@Override
			public void say() {
				System.out.println("Function interface by Annoymous function");
				
			}
			
		};
		h.say();
		
	}

}
