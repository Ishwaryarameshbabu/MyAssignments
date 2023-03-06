package week3day1;

public class SmartPhone extends AndroidPhone{

	public void connectWhatsApp()
	{
		System.out.println("Connecting to my whatsapp");
	}
	public void takeVideo()
	{
		System.out.println("Planning to take a slomo");
	}
	public static void main(String[] args) {
	SmartPhone sp=new SmartPhone();
	sp.sendMsg();
	sp.makeCall();
	sp.saveContact();
	sp.takeVideo();
	sp.connectWhatsApp();

	}

}
