package in.co.rays.Inheritance;

public class Circle {
	private int radius=0;
	private int diametar=0;
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public  int getRadius() {
		return radius;
	}
	public void setDiametar(int diametar) {
		this.diametar=diametar;
	}
	public int getDiametar() {
		return diametar;
	}
	public void circle() {
		int dDiametar=getRadius()*getRadius();
		int rRadius=getDiametar()/2;
		System.out.println(diametar);
		System.out.println(radius);
		
	}

}
