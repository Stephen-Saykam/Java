package com.StringPrograms;

public class Duplicates_Printing {

	public static void main(String[] args) {
		int a[]={1,2,2,4,56,4,3,3,2};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
					System.out.println(a[j]); 
			}
		}

	}

}
