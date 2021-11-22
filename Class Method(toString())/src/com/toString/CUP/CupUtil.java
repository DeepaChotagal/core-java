package com.toString.CUP;

public class CupUtil {

	public static void main(String[] args){
		Cup cup = new Cup();
		cup.setColor("Brown");
		cup.setPrice(200.00);
		cup.setSize("small");
		cup.setMaterial("Ceramic");
		cup.setWeightingrams(300);
		
		
		System.out.println(cup);
	}
}
