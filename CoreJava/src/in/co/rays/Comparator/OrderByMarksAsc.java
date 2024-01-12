package in.co.rays.Comparator;

import java.util.Comparator;

public class OrderByMarksAsc implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		return m1.marks-m2.marks;
	}

}
