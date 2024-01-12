package in.co.rays.Oops;

public class Account {
	private String name=null;
	private String gmail=null;
	private String number=null;
	private String type=null;
	private float balance=0;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
		
	}
	public void setGmail(String gmail) {
		this.gmail=gmail;
	}
	public String getGmail() {
		return gmail;
		
	}
	
	public void setNumber(String number) {
		this.number=number;
	}
	public String getNumber() {
		return number;
	}
	public void setType(String type) {
		this.type=type;
		}
	public String getType() {
		return type;
	}
	
	
	public void setBalance(float balance) {
		this.balance=balance;
	}
	
	public float getBalance() {
		return balance;
	}
	public float deposit(float amount) {
		balance = balance + amount;
		return balance;
		
	}
	public float Withdraw(float amount) {
		balance = balance-amount;
		return balance;
	}
	
	}
	
	
	


