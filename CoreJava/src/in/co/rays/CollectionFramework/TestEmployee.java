package in.co.rays.CollectionFramework;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(12, "pooja", 1000000);
		Employee e2=new Employee(12, "pooja", 1000000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hascode());
		System.out.println(e2.hascode());
	}

}
