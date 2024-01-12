package in.co.rays.StreamCollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestDoubleStteam {

	public static void main(String[] args) {
		
		List <Double>list=Arrays.asList(2.0,33.0,45.0,33.45,22.0);
		Stream<Double>stream=list.stream();
		
		stream.distinct().sorted().forEach(e->{
			System.out.println(e);
		});
		
		
	}
}
