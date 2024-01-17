package in.co.rays.Thread;

public class TestWithThread {
	public static void main(String[] args) {
		
		WithThread t1=new WithThread("pooja");
		WithThread t2=new WithThread("lucky");
		
		t1.start();
		t2.start();
	}

}
