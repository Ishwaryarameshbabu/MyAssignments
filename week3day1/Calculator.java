package week3day1;

public class Calculator {
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void sub(double c,double d)
	{
		System.out.println(c-d);
	}
	
	public void sub(int c,int d)
	{
		System.out.println(c-d);
	}
	public void mul(int c,double d)
	{
		System.out.println(c*d);
	}
	public void mul(double e,double f)
	{
		System.out.println(e*f);
	}

	public static void main(String[] args) {
		
		Calculator ca=new Calculator();
		ca.add(13, 15);
		ca.add(13, 76, 67);
		ca.sub(23.54, 87.09);
		ca.sub(67, 80);
		ca.mul(23.67, 89.45);
		ca.mul(89, 23.09);

	}

}
