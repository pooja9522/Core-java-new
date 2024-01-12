package in.co.rays.Oops;

public class SumLogic {
	//public void sum(int a, int b) {
	//	int d = a+b;
		//System.out.println(d);
//	}
		public void  NoteCount(int number) {
			int count=0;
			int[]notes= {100,50,20,10,5,2,1};
			for (int i = 0; i < notes.length; i++) {
				count=number/notes[i];
				number=number%notes[i];
				count++;
				
			
				if(count>0) {
					System.out.println(notes[i]+" "+count);
				}
				
			}
			
			
		}
		
	
		
	

}

	
