package in.co.rays.basics;

public class TestArray {
	public static void main(String[] args) {
		int[]table=new int[10];
		table[0]=2;
		table[1]=4;
		table[2]=6;
	    table[3]=8;
	    table[4]=10;
	    table[5]=12;
	    table[6]=14;
	    table[7]=16;
	    table[8]=18;
		table[9]=20;
		
		int ele=table[8];
		System.out.println("9th element"+"="+ ele);
		int size=table.length;
		System.out.println("size is"+" = " +size);
	
		
	}

}
