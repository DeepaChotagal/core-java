package com.xworkz.RingDTO;

public class RingTester {
	public static void main(String a[])
	{
		Ring  dto = new Ring();
		dto.setMaterial("gold");
		dto.setPrice(5000.00);
		dto.setRingid(5);
		dto.setShape("round");
		
		System.out.println(dto.getMaterial()+" "+dto.getPrice()+" "+dto.getRingid()+" "+dto.getShape());
		
	}
}
