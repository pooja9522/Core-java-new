package in.co.rays.Comparator;

import java.util.Comparator;

public class OrderBynameDesc implements Comparator<Marksheet> {
	

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		return( m1.name. compareTo (m2.name)) ;
	}

}
