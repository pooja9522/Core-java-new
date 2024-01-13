package in.co.rays.CollectionFrameworkPractice;

public class Employee1<Employee> {
	
	private int id;
	private String name;
	private int marks;
	
	
	public Employee1(int id, String name,int marks) {
		
		this.id=id;
		this.name=name;
		this.marks=marks;
		
		}
	
	public int getId() {
		return id;
		
	}
	
	public String getName() {
		return name;
	}
		
	public int getMarks() {
		return marks;
		
		}
	
	public int hascode() {
		String str =id+name+marks;

		return str.hashCode() ; 
	}
	
	
	public boolean equals (Object obj) {
		Employee1 e=  (Employee1) obj;
		
	boolean b=this.id==e.id && this.name==e.name && this.marks==e.marks;
	return b;
	}
	public String toString() {
		return id+" "+name+" "+marks;
	}
 
}
