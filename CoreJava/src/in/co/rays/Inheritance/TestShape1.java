package in.co.rays.Inheritance;

public class TestShape1 extends Shape1{
	public static void main(String[] args) {
		Shape1 s= new Shape1();
		System.out.println("shape1 ");
		s.setColor("black");
		s.setBorderwidth(15);
		s.mat();
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		
	
	Ractangle1 r=new Ractangle1();
	System.out.println("ractangle ");
	r.setLength(15);
	r.setWidth(12);
	r.area();
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
	
	Circle1 c=new Circle1();
	System.out.println("circle ");
	c.setRadius(5);
	c.area();
	System.out.println(c.getRadius());
	
	Triangle1 t=new Triangle1();
	System.out.println("triangle ");
	t.setBase(2);
	t.setHeight(1);
	t.area();
	System.out.println(t.getBase());
	System.out.println(t.getHeight());
	
	}
}