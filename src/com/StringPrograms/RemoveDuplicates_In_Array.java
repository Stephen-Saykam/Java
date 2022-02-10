package com.StringPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_In_Array {

	public static void main(String[] args) {
		
		//Using Set Interface , We are removing Duplicates in an Array
		
		Integer[] a=new Integer[] {1,5,89,6,1,2,1,1,2,2};
		
		Set<Integer> uniqEle=new LinkedHashSet<>(Arrays.asList(a));
		
		for(Integer singleEle:uniqEle)
		{
			System.out.println(singleEle);
		}
		
		
		
//		int a[]= {1,45,85,1,2,1,2,47};
//		int t;
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=0; j<a.length-1; j++)
//			{
//				if(a[j]<a[j+1])
//				{
//					t=a[j];
//					a[j]=a[j+1];
//					a[j+1]=t;
//				}
//				if(a[j]==a[j+1])
//				{
//					a[j+1]=0;
//				}
//			}
//		}
//		
//		for(int k=0; k<a.length; k++)
//		{
//			if(a[k]!=0)
//			{
//				System.out.println(a[k]);
//			}
//		}
		
		

	}
}
