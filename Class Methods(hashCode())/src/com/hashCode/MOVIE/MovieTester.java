package com.hashCode.MOVIE;

public class MovieTester {
  
	public static void main(String a[])
	 {
	 MovieDTO movie = new MovieDTO();
	 movie.movieid = 1;
	 movie.name = "Robert";
	 movie.noOfActors = 9;
	 System.out.println(movie);
	 
	 MovieDTO movie1 = new MovieDTO();
	 movie1.movieid = 1;
	 movie1.name = "Robert";
	 movie1.noOfActors = 9;
	 System.out.println(movie1);
	 
	 System.out.println(movie.equals(movie1));
	 }
}
