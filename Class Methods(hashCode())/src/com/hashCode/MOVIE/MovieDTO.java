package com.hashCode.MOVIE;

public class MovieDTO {


	  int movieid;
	  String name;
	  int noOfActors;
	  
	  @Override
	  public int hashCode()
	  {
		  return movieid;
	  }
	  
	  @Override
	  public String toString()
	  {
		return "MovieDTO - [Movieid = "+this.movieid+" name = "+this.name+" NoOfActors = "+this.noOfActors+"]";  
	  }
	  
	  
	  //equality Contract
	  @Override
	  public boolean equals(Object obj)
	  {
		
		  if(this.hashCode() == obj.hashCode())
		  {
			  return true;
		  }
		  return false;
	  }
}
