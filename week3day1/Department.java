package week3day1;

public class Department extends College{
	
	public void deptName()
	{
		System.out.println("Computerscience Engineering");
	}

	public static void main(String[] args) {
		Department dp=new Department();
		dp.collegeName();
		dp.collegeCode();
		dp.collegeRank();
		dp.deptName();

	}

}
