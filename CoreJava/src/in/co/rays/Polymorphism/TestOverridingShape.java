package in.co.rays.Polymorphism;

public class TestOverridingShape {
	public static void main(String[] args) {
		
		OverridingShape s=new OverridingShape();
		System.out.println("shape");
		s.area();
		s.setBorderwidth(10);
		s.setColor("white");
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		
		OverridingCircle c=new OverridingCircle();
		System.out.println("circle");
		
		c.setRadius(5);
		c.area();
		System.out.println(c.getRadius());
		
		OverridingRectangle r=new OverridingRectangle();
		System.out.println("Ractangle");
		
	    r.setLength(10);
		r.setWidth(5);
		r.area();
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		
		OverridingTriangle t=new OverridingTriangle();
		System.out.println("triangle");
		
		t.setBase(10);
		t.setHight(10);
		t.area();
		System.out.println(t.getBase());
		System.out.println(t.getHight());
		
		
	}
}