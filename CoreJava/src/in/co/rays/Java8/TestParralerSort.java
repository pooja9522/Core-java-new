package in.co.rays.Java8;

import java.util.Arrays;

public class TestParralerSort {
	public static void main(String[] args) {
		int[]arr= {100,35,5,89,844,4447,54};
		Arrays.parallelSort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

}
