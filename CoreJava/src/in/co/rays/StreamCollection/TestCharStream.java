package in.co.rays.StreamCollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class TestCharStream {
	
	public static void main(String[] args) {
		
		List<Character>list=Arrays.asList('b','c','f','d','w','a','z','g','b','d','p','s');
		
		Stream<Character>stream=list.stream();
		
		stream.map(e-> e.toUpperCase(e)).sorted().distinct().forEach(e->{
			
			System.out.println(e);
			
			
		});
		
		
		
	}

}
