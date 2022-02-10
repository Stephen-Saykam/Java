package com.StringPrograms;

public class TotalNoOfChars {

	public static void main(String[] args) {
		
		String s=new String("Stephen");
		System.out.println(s);
		
		
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			
			count++;
		}
		System.out.println("No of Characters in a String : "+count);

	}

}
