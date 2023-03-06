package week3day1;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("Reccuring Deposit");
	}

	public static void main(String[] args) {
	  AxisBank ab=new AxisBank();
	  ab.saving();
	  ab.fixed();
	  ab.deposit();
	  

	}

}
