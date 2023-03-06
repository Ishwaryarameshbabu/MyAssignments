package week3day1;

public class BankInfo {
	
	public void saving()
	{
		System.out.println("current account");
	}

	public void fixed()
	{
		System.out.println("RD");
	}
	public void deposit()
	{
		System.out.println("Fixed Deposit");
	}
	public static void main(String[] args) {
		
		BankInfo bi=new BankInfo();
		bi.saving();
		bi.fixed();
		bi.deposit();

	}

}
