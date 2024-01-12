package in.co.rays.ShallowCloning;

public class BankAccountP implements Cloneable {
	public double balance=0; 
	
	public BankAccountP(double balance) {
		this.balance=balance;
		
		}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}

}



