package com.StringPrograms;

public class Happy_Nbr {

	public static void main(String[] args) {
		int num=28,sum=0,rem;
		int b=num;
		while(num>9)
		{
			while(num>0)
			{
				rem=num%10;
				num=num/10;
				sum=sum+(rem*rem);
			}
			num=sum;
			sum=0;
		}
		System.out.println(num);
		if(num==1)
		{
			System.out.println("Happy Nbr");
		}
		else
		{
			System.out.println("Not Happy Nbr");
		}

	}

}
