package in.co.rays.Inheritance;

public class CircleAreaA extends Circle {
	private int radius=0;
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void area() {
		double Aarea=3.14*getRadius()*getRadius();
	}
	

}
