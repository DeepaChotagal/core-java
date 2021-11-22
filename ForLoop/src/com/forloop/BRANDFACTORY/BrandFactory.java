package com.forloop.BRANDFACTORY;

public class BrandFactory {


	static String BrandFactories[]={"Tata Group","Airtel","Reliance Industries","HDFC Bank","LIC","Colgate","lux","Britannia","Closeup","Ponda","vlinicPlus","LG","SBI","Reliance Communication","Pepsodent","Horlicks","LefeBouy","Amul","Samsung","Dettol"};
	
	public static void main(String a[])
	{
		
	System.out.println(BrandFactories.length);
	getBrandFactory();
	}
	public static void getBrandFactory()
	{
	
	   for(int i=0;i<BrandFactories.length;i++)
	   {
		System.out.println(BrandFactories[i]);
	   }
    }
}
