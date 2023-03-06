package week3day1;

public class AndroidPhone extends Mobile {
	
	public void takeVideo()
	{
		System.out.println("taking the vidoe");
	}

	public static void main(String[] args) {
		AndroidPhone ap=new AndroidPhone();
		ap.sendMsg();
		ap.makeCall();
		ap.saveContact();
		ap.takeVideo();

	}

}
