package in.co.rays.Comparator;

import java.util.Comparator;

public class OrderByIdAsc implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		// TODO Auto-generated method stub
		return m1.id-m2.id;
	}

}
