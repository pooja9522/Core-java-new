package in.co.rays.Thread;

public class WithThread extends Thread {
	
	public String name=null;
	
public WithThread(String name) {
	this.name=name;
}

public void run() {
	for (int i = 0; i <=5; i++) {
  System.out.println(i+name);
		
	}
}
}

