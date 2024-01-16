package in.co.rays.StreamCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamApiContestent {
	public static void main(String[] args) {
		
		List<StreamApiContestent>list=new ArrayList<StreamApiContestent>();
		
		list.add(new StreamApiContestent("pooja","95223184001"));
		list.add(new StreamApiContestent("pritee","9713640440"));
		list.add(new StreamApiContestent("laxman","9981558174"));
		list.add(new StreamApiContestent("vikash","9584733484"));
		list.add(new StreamApiContestent("vishnu","9826622931"));
		list.add(new StreamApiContestent("dinesh","99776620299"));
		list.add(new StreamApiContestent("mansingh","919754020850"));
		list.add(new StreamApiContestent("manoj","9826529264"));
		list.add(new StreamApiContestent("deepak","8878468459"));
		
	list.stream().map(e->e.phone).filter(e->e.length()==10).collect(Collectors.collectingAndThen(Collectors.toList(),e->{
		
		Collection.shuffle(e);
		
		return e.Stream();})).limit(2).forEach(e->{
			System.out.println(e);
		});
		
		
		
				
		
	}
	
	

}
