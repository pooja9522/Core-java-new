package in.co.rays.Thread;

public class TestPriorityThread {
	public static void main(String[] args) {
		
		PriorityThread t1=new PriorityThread("a");
	//	PriorityThread t2=new PriorityThread("ab");
		
		
		
		
		
		t1.setPriority(5);
		//t2.setPriority(1);
		
		
		
		
		t1.start();
		//t2.start();
		
	
		
		
		}

}
