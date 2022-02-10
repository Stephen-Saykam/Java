package com.StringPrograms;

public class Perfect_Nbr {

	public static void main(String[] args) {
		int num=28, sum=0;
		for(int i=1; i<=(num/2); i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("Perfect Nbr");
		}
		else
		{
			System.out.println("Not Perfect Nbr");
		}

	}

}
