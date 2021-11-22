package com.hashCode.CUP;

public class CupTester {
	public static void main(String[] args){
		Cup cup = new Cup();
		cup.setCupid(5);
		
		System.out.println(cup.hashCode());
	}
}
