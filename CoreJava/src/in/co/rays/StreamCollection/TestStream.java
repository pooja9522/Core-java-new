package in.co.rays.StreamCollection;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
	
	public static void main(String[] args) {
		
List <String> list=Arrays.asList("one","ten","three","four","three","five");
		
				
		Stream<String> stream =list.stream() ;
		stream.map(e-> e.toUpperCase()).filter(e-> e.startsWith("T")).sorted().distinct().forEach(e->{
			
		
		System.out.println(e);
		
		

		
		});

}
}