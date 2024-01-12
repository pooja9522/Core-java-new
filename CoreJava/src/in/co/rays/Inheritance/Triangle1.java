package in.co.rays.Inheritance;

public class Triangle1 extends Shape1 {
	private double base=0;
	private double height=0;
	
	public void setBase(double base) {
		this.base=base;
	}
	public double getBase() {
		return base;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void area() {
		double rArea=(getBase()*getHeight())/2;
		System.out.println("Triangle"   +rArea);
		
	}

}
