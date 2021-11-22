package com.forloop.LANGUAGES;

public class Languages {

	static String languages[]={"kannada","english","telugu","tamil","marathi","hindi","urdu","malayalam","odia","gujarati","punjabi","sanskrit","konkani","nepali","sindhi","kashmiri","manipuri","tulu","maitili","santali"};
	
public static void main(String a[]){
getLanguages();
            }
public static void getLanguages(){
for(int i=0;i<languages.length;i++)
{
System.out.println(languages[i]+" ");
}	
}
}
