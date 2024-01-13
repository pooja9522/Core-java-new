package in.co.rays.CollectionFramework;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
		
	}
	public String getname() {
		return name;
		
	}
	
	public int getSalary() {
		return salary;
		
		}
	public int hascode() {
		String str=id+name+salary;
		return str.hashCode();
	}
	public boolean equals (Object obj) {
		Employee e=(Employee) obj;
	
		boolean b=this.id==e.id && this.name==e.name&& this.salary==e.salary;
		return b;
		
	}
	public String toString() {
		return id+"  "+name+"  "+salary+"  ";
		
	}
		
	
	
	}


