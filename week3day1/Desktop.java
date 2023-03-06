package week3day1;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("Desktop size is 15 inches");
	}

	public static void main(String[] args) {
		Desktop dp=new Desktop();
		dp.computerModel();
		dp.desktopSize();

	}

}
