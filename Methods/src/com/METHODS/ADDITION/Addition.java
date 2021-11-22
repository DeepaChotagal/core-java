package com.METHODS.ADDITION;

public class Addition {


	public static void main(String a[])
	{
		int value = add(45,67);
		System.out.println(value);
		int ans = add(78,23);
		System.out.println(ans);
		int output = add(56,123);
		System.out.println(output);
		int finalOutput = add(67,1234);
		System.out.println(finalOutput);
		
		add(60,2,3);
		
	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
