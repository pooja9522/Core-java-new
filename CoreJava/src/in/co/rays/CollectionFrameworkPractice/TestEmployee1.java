package in.co.rays.CollectionFrameworkPractice;

public class TestEmployee1 {
	
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1(10,"pooja",90);
		Employee1 e2=new Employee1(10,"pooja",90);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1 .equals (e2));
		System.out.println(e1.hascode());
		System.out.println(e2.hascode());
		
	}

}
