package in.co.rays.Inheritance;

public class Circle1 extends Shape1 {
	private int radius=0;
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void area() {
		float rArea=(float) (3.14 * getRadius()*getRadius());
		System.out.println("circle"    +rArea);
	}
	

}
