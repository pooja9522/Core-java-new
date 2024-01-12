package in.co.rays.Oops;

public class TestParot {
	public static void main(String[] args) {
		Parot p=new Parot();
		p.eat();
		p.sleep();
		String s=p.name();
		System.out.println(s);
		int i=p.money();
		System.out.println(i);
		char c=p.ch();
		System.out.println(c);
	}

}
