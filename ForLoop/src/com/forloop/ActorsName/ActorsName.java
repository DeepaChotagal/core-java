package com.forloop.ActorsName;

public class ActorsName {

	static String actors[]={"Darshan","sudeep","Appu","Yash","Ganesh","Ajit","Upendra","ShivarajKumar","Diganth","Gurukiran","Jaggesh","JaiJagadeesh","Chikkanna","Cheeru","Druvasarja","Devaraj","Prajwal","Komal","AnantNag","Murali"};
	
	public static void main(String a[])
	{
		getActorsName();
	}
	public static void   getActorsName()
	{
		for(int i=0;i<actors.length;i++)
		{
			System.out.println(actors[i] );
		}
	}
}
