package week2.day1;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[]input= {2,5,3,1,4,5,7,6,3,2};
		for(int i=0;i<input.length;i++)
		{
          for(int j=i+1;j<input.length;j++)
          {
        	  if(input[i]==input[j])
        	  {
        		  System.out.println(input[i]);
        	  }
          }
	}
	}
}
