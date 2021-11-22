package com.xworkz.gmailapp;

public class LedLightImplementaion implements Switch {
  @Override 
  public void sOn() {
	  System.out.println("LedLight is turned on");
  }
  
  @Override
  public void sOff() {
	  System.out.println("LedLight is turned off");
	 
  }
}
