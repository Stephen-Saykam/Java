package com.StringPrograms;

public class Zeros_Last_Print {

	public static void main(String[] args) {
		int a[]={25,41,2,0,15,3,0,1,54};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
