package com.forloop.PROGRAMMING;

public class ProgrammingLanguages {


	static String programmingLanguages[]={"java","python","javascrip","PHP","Ruby","Swift","Perl","SQL","C","Matlab","Ada","Rust","Cobol","Lisp","TypeScript","Dart","Prolog","Visual","Lua","Scala"};
	
	public static void main(String a[])
	{
		System.out.println(programmingLanguages.length);
		getProgrammingLanguage();
	}
	
		public static void getProgrammingLanguage()
		{
			for(int i=0;i<programmingLanguages.length;i++)
			{
				System.out.println(programmingLanguages[i]+"  ");	
			}
		}
}
