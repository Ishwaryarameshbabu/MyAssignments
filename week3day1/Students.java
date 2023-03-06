package week3day1;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("My ID is:"+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("My ID:"+id);
		System.out.println("My name is:"+name);
	}
	public void getStudentInfo(String email,long phoneNumber)
	{
		System.out.println("My EmailId is:"+email);
		System.out.println("PhoneNumber is:"+phoneNumber);
	}
	
	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentInfo(3465566);
		st.getStudentInfo(3465566, "Ishwarya");
		st.getStudentInfo("ishwaryarameshbabu@gmail.com",8925416830l);

	}

}
