package in.co.rays.Inheritance;

public class Shape {
	private String color="null";
	private int borderwidth='0';
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth=borderwidth;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void paper() {
		System.out.println("yes this is a nice paper");
	}
		
}
