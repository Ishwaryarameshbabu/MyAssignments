package week3day1;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("Ishwarya");
	}
	public void studentDept()
	{
		System.out.println("My Department is: CSE");
	}
	public void studentId()
	{
		System.out.println("85654323");
	}

	public static void main(String[] args) {
		Student st=new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();

	}

}
