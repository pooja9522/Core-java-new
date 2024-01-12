package in.co.rays.basics;

public class Notecount {

	public static void main(String[] args) {
		int number=8850;
		int count=0;
		int[]notes= {500,100,10,5,1};
		for (int i = 0; i < notes.length; i++) {
			count=number/notes[i];
			
			number=number%notes[i];
		
			if (count>0) {
				System.out.println((notes[i]+"="+count));
				}
				
				
			}
	}
			
		}
		
		

	


