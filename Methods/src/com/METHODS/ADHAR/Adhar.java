package com.METHODS.ADHAR;

public class Adhar {

	public static void main(String a[])
	{
		long adhar = getAdharNo();
		System.out.println(adhar);
		
		String name = getAdharName();
		System.out.println(name);
	}
	
	public static long getAdharNo()
    {
		long adharNo=564798302l;
		return adharNo;
	}
	
	public static String getAdharName()
	{
		return "deepa chotagal";
	}
}
