package in.co.rays.Interface;

public class TestInter {
	
	public static void main(String[] args) {
		BusinessMan bm=new BusinessMan();
		
		bm.earn();
		bm.party();
		bm.donation();
		bm.helpToOther();
		
		SocialWorker sw=new BusinessMan();
		sw.helpToOther();
		
		Richman rm=new BusinessMan();
		rm.earn();
		rm.party();
		rm.donation();
		System.out.println( "money");
		
	}
	
		}
