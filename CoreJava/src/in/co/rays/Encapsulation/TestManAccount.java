package in.co.rays.Encapsulation;

public class TestManAccount {
	public static void main(String[] args) {
		ManAccount M=new ManAccount() ;
		M.setName("lucky patel");
		M.setEmails("luckypatel12@gmail.com");
		M.setAccountnum(45566554234l);
		M.setAmount(1000000.96);
		System.out.println("name"+" = "+M.getName());
		System.out.println("emails"+"= "+M.getEmails());
		System.out.println("Accountnum"+" ="+M.getAccountnum());
		System.out.println("Amount"+"= "+M.getAmount());
		
	}

}
