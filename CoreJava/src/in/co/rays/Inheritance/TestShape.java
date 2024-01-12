package in.co.rays.Inheritance;

public class TestShape extends Rectangle {
	public static void main(String[] args ) {
		Shape s=new Shape();
		s.paper();
		s.setBorderwidth(8);
		s.setColor("pink");
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());
		Rectangle R=new Rectangle();
	
		R.setLength(8);
		R.setWidth(10); 
		R.area();
		System.out.println(R.getLength());
		System.out.println(R.getWidth());
		
	}
}