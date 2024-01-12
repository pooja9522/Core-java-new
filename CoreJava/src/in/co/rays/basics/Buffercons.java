package in.co.rays.basics;

public class Buffercons {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("pooja jawaiya");
		sb.append("pritee");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		System.out.println(sb.indexOf("pooja"));
		System.out.println(sb.replace(0,3,"kkk"));
		System.out.println(sb.reverse());

		
	}

}
