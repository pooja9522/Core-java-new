package in.co.rays.Oops;

public class ConstCall {
	String name="null";
	String lastname="null";
	String address="null";
	public ConstCall() {
		System.out.println("this is a default const");
	}
	public ConstCall(String name,String lastname) {
		this.name=name;
		this.lastname=lastname;
		}
	public ConstCall(String name,String lastname,String address) {
		this.name=name;
		this.lastname=lastname;
		this.address=address;
	}
	public void display() {
		System.out.println("detealls:+"+this.name+"="+this.lastname+"="+this.address);
	}


}
