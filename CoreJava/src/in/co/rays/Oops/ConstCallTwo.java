package in.co.rays.Oops;

public class ConstCallTwo {
	String name="null";
	String lastname="null";
	int num = 0;
	int rollno= 0;
	char section=68;
	public ConstCallTwo() {
		System.out.println("this is a defauit constructor");
	}
	public ConstCallTwo(String name,String lastname ) {
		this.name=name;
		this.lastname=lastname;
	}
	public ConstCallTwo(String name,int num,int rollno,char section) {
		this.lastname=name;
		this.num=num;
		this.rollno=rollno;
		this.section=section;
	}
	public void print() {
		System.out.println("detealls:+" +this.name+" "+this.lastname+" "+this.num+" "+this.rollno+" "+this.section);
		
	}
	
	
	

}
