package com.forloop.MobileName;

public class MobileName {

	static String mobiles[]={"vivo","oppo","samsung","redmi","apple","oneplus","techno","lenova","nokia","asus","jio","gionee","realme","micromx","karbon"};

	public static void main(String a[]){
		
		System.out.println(mobiles.length);
                getMobileName();

	}

  
	public static void getMobileName()
       {
             for(int i=0;i<mobiles.length;i++)
             {
                 System.out.println(mobiles[i]+"  ");
             }
       }
}
