package com.METHODS.FACTORIAL;

public class Factorial {


	public static void main(String a[])
	{
		System.out.println("main method started");
		findFactorial(6);
		System.out.println("main method ended");
	
	}
	public static void findFactorial(int n)
	{
		System.out.println("invoked findFactorial method");
		int fact=1;
		for(int i=0;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		System.out.println("end of findFactorial method");
	}
}
