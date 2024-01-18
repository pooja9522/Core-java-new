package in.co.rays.Thread;

public class TestByRunnable {
	
	public static void main(String[] args) {
		
	Thread  t1=new Thread(new  ByRunnable("pooja"));
	Thread  t2=new Thread(new ByRunnable("luckky"));
		
		
		t1.start();
		t2.start();
		for (int i = 0; i <=10; i++) {
			
			System.out.println(i+" "+"my name is pooja");
			
		}

		
	}

}
