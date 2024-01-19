package in.co.rays.Java8;

public class TestDefaultStatic {
	
	public static void main(String[] args) {
		DefaultStaticMethod ds=new DefaultStaticMethod() {

			@Override
			public void abstructMethod() {
				System.out.println("this is a abstruct method");
			
				
			}
			
		};
		ds.defaultmethod();
		ds.abstructMethod();
		
	}

}
