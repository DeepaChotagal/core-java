package com.toString.BELL;

public class BellTester {

	public static void main(String[] args){
		Bell bell = new Bell();
		
		bell.setBrand("Anchor");
		bell.setColor("White");
		bell.setMaterial("Plastic");
		bell.setShape("rectangular");
		bell.setPrice(4000.00);
		bell.setBellid(10);
		
		System.out.println(bell);
	}
}
