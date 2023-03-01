package week1.day1;

public class Mobile {
	
	public void makeCall()
	{
		System.out.println("Your call is getting connected.");
	}
	public void sendMsg()
	{
		System.out.println("Message is Delivered.");
	}

	public static void main(String[] args) {
	    Mobile obj2 = new Mobile();
        obj2.makeCall();
        obj2.sendMsg();
	}

}
