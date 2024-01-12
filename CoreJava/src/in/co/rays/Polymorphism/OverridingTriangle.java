package in.co.rays.Polymorphism;

public class OverridingTriangle  extends OverridingShape{
	private int base=0;
	private int hight=0;
	
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public void area() {
	int	Aarea=(getBase()*getHight())/2;
	System.out.println("Triangle"      +Aarea);
	}
	
		
	}	