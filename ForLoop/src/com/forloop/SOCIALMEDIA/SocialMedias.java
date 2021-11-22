package com.forloop.SOCIALMEDIA;

public class SocialMedias {


	static String SocialMedia[]={"Instagram","facebook","twitter","whatsapp","linkedin","sharechat","youtube","gmail","snapchat","tiktok"};
	
	public static void main(String a[])
	{
		
	System.out.println(SocialMedia.length);
	getSocialMedias();
	}
	public static void getSocialMedias()
	{
		for(int i=0;i<SocialMedia.length;i++)
		{
			System.out.println(SocialMedia[i]);
		}
	}
	
}
