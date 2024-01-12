package in.co.rays.Polymorphism;

public class OverridingRectangle extends OverridingShape {
	private int length=0;
	private int width=0;
	
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth() {
		return width;
	}
	public void area() {
		int Aarea=getLength()*getWidth();
		System.out.println("Ractangle"    +Aarea);
		
		
	}

}
