package in.co.rays.Thread;

public class WithoutThread {
	
	public String name=null;
	
	
	public  WithoutThread(String name) {
		this.name=name;
	}
	
	public void run() {
		
		for (int i = 0; i <=5; i++) {
			
			System.out.println(name);
			
		}
	}
	
	

}
