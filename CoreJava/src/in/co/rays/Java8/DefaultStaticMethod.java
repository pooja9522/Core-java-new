package in.co.rays.Java8;

public interface DefaultStaticMethod {
	
	public void abstructMethod();
	
	public default void defaultmethod() {
		System.out.println("this is default method");
	}

}
