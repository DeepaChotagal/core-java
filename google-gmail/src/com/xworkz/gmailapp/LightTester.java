package com.xworkz.gmailapp;

public class LightTester {
   
	public static void main(String[] args)
	{
		//Abstraction
		Switch switch1 = new TubeLightImplementation();
		switch1.sOn();
		switch1.sOff();
		
		//Abstraction
		Switch switch2 = new LedLightImplementaion();
		switch2.sOn();
		switch2.sOff();
	}
}
