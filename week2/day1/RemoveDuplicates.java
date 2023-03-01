package week2.day1;

import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		int count;
		String[]split=text.split(" ");
		for(int i=0;i<split.length;i++)
		{	
			for(int j=i+1;j<split.length;j++){
				if(split[i]==split[j])
				{
					System.out.println(split[i]);
				}
			}
		}

	}

}
