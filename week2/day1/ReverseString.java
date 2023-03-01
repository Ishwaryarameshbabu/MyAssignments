package week2.day1;

public class ReverseString {

	public static void main(String[] args) {
		String test="Feeling Good";
		char[]ch=test.toCharArray();
		//for(int i=ch.length-1;i>=0;i--)
		//{
			//System.out.println(ch[i]);
		//}
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i]==ch[i+1])
			{
				System.out.println(ch[i+1]);
			}
		}

	}

}
