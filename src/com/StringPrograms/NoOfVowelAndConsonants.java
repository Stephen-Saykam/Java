package com.StringPrograms;

public class NoOfVowelAndConsonants {

	public static void main(String[] args) {
		
		String str= "Iam in office";
		str=str.toLowerCase();
		System.out.println(str);
		int vCount = 0, cCount=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				cCount++;
			}
			
		}
		System.out.println("No of vowels : "+vCount);
		System.out.println("No of Consonants : "+cCount);
		

	}

}
