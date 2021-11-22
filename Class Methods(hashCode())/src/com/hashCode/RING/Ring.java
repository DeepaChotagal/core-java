package com.hashCode.RING;

public class Ring {

	 String material;
	 double price;
	 int ringid;
	 String shape;
	 
	@Override
	 public int hashCode()
	 {
		 return ringid;
	 }
	

	
	 public static void main(String a[])
	 {
		 Ring ring = new Ring();
		 ring.ringid=5;
		 System.out.println(ring.hashCode());
		 
		 Ring ring1 = new Ring();
		 ring1.ringid=6;
		 System.out.println(ring1.hashCode());
	 } 
}
