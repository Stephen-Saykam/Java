package com.StringPrograms;

public class ArraySorting {

	public static void main(String[] args) {

		int a[]= {11,8,95,162,4};
		int t;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int k=0; k<a.length; k++)
		{
			System.out.println(a[k]);
		}

	}

}
