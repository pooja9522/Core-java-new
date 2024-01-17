package in.co.rays.Thread;

public class TestWithoutThread {
	
	public static void main(String[] args) {
		
		WithoutThread t1=new WithoutThread("pooja");
		WithoutThread t2=new WithoutThread("laxman");
		
		t1.run();
		t2.run();
		
	}

}
