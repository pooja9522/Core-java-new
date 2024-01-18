package in.co.rays.Thread;

public class DaemonThread extends Thread {
	
	public void run() {
		System.out.println("DaemonThread T started"+Thread.currentThread());
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
