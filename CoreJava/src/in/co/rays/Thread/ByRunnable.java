package in.co.rays.Thread;

public class ByRunnable implements Runnable {
	
	public String name=null;
	
	public ByRunnable(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		
		for (int i = 0; i <=100; i++) {
			
			System.out.println(i+" "+name);
			
		}
		
		
	}
	

}
