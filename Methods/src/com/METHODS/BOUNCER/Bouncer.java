package com.METHODS.BOUNCER;

public class Bouncer {

	public static void main(String a[])
	{
		System.out.println("main method started");
		check(22);
		System.out.println("main method ended");
	}
	public static void check(int age)
	{
		System.out.println("invoked check method");
		if(age>=18)
		{
			System.out.println("enter the pub and enjoyyyy.....");
		
		}
		else
		{
			System.out.println("grow up child...go home and study..");
		}
		System.out.println("end of check method");
	}
}
