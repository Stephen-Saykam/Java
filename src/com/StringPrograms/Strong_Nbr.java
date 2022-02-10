package com.StringPrograms;

public class Strong_Nbr {

	public static void main(String[] args) {
		int num=145,fact=1,sum=0,rem;
		int b=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			for(int i=1; i<=rem; i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			fact=1;
		}
		System.out.println(sum);
		if(b==sum)
		{
			System.out.println("Strong Nbr");
		}
		else
		{
			System.out.println("Not Strong Nbr");
		}

	}

}
