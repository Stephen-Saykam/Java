package com.StringPrograms;

public class Get_All_Strong_Nbrs {

	public static void main(String[] args) {
		int num=68,rem,sum=0,fact=1;
		int b=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			for(int i=1; i<=rem; i++)
			{
				fact=fact*i;
	
				
			}
		}

	}

}
