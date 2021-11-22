package com.xworkz.gmailapp;

public class TubeLightImplementation implements Switch{
    
	 @Override 
	  public void sOn() {
		  System.out.println("TubeLigth is turned on");
	  }
	  
	  @Override
	  public void sOff() {
		  System.out.println("TubeLight is turned off");
		 
	  }
}
