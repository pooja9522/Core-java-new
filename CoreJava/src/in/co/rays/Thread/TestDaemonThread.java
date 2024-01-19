package in.co.rays.Thread;

public class TestDaemonThread {
	public static void main(String[] args) {
		
		BackgroundThread t1=new BackgroundThread("DaemonThread");
		
		
		t1.setDaemon(true);
		t1.start();
		
		
		for (int i = 0; i <=20; i++) {
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(i+"this is a Daemon");
		}
		
		
	}
	
	
	
	
	

}
