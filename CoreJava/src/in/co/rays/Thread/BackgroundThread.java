package in.co.rays.Thread;

public class BackgroundThread extends Thread {
	
	public String name=null;
	
	
	public BackgroundThread(String name) {
		
		this.name=name;
	}
	
	public void run() {
		while(true) {
	
   try {
	Thread.sleep(200);
} catch (InterruptedException e) {

	e.printStackTrace();
}			
		}
	}

}
