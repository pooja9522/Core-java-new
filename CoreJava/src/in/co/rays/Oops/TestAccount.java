package in.co.rays.Oops;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a =new Account();
		a.setName("laxminarayan patel");
		a.setGmail("luckypate3112@gmail.com");
		a.setNumber("9988443458");
		a.setType("saving Account");
		a.setBalance(10000);
		
	System.out.println("name"+" = "+a.getName());
	System.out.println("gmail id"+" = "+a.getGmail());
	System.out.println("accountno"+" = "+a.getNumber());
	System.out.println("Account type"+" = "+a.getType());
	System.out.println("Balance"+" = "+a.getBalance());
	System.out.println("withdral amount =2000"+" = "+a.Withdraw(2000));
	System.out.println("Deposit amount=00"+" = "+a.deposit(00));
		
		
		
	}

}
