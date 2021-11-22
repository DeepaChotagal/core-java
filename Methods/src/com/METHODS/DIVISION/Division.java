package com.METHODS.DIVISION;

public class Division {

	public static void main(String a[])
	{
		int value = div(5,2);
		System.out.println(value);
		int result = div(20,5);
		System.out.println(result);
		
		div(5,5,1);
	}
	
	public static int div(int a,int b)
	{
		return a*b;
	}
	
	public static void div(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
}
