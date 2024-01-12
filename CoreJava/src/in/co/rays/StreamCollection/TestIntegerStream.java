package in.co.rays.StreamCollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestIntegerStream {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(5,6,66,66,200,12,456,888);
		
		Stream<Integer> stream =list.stream();
		
		stream.distinct().sorted().forEach(e->{
			
			System.out.println(e);
			
		});
		
	}

}
