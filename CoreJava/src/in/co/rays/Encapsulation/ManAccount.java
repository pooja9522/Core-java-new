package in.co.rays.Encapsulation;

public class ManAccount {
	private long accountnum;
	private String name;
	private String emails;
	private double amount;
	
	public void setAccountnum(long accountnum) {
		this.accountnum=accountnum;
	}
	public long getAccountnum() {
		return accountnum;
		}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmails(String emails) {
		this.emails = emails;
	}
	public String getEmails() {
		return emails;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	}
