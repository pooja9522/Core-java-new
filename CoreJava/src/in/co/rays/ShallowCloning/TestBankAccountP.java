package in.co.rays.ShallowCloning;

public class TestBankAccountP {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	BankAccountP ba1=new BankAccountP(1200);
	BankAccountP ba2=(BankAccountP) ba1.clone();
	ba2.balance=1000;
	System.out.println(ba1.balance);
	System.out.println(ba2.balance);

	
	

}
}