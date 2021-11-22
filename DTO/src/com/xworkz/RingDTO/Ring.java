package com.xworkz.RingDTO;

public class Ring {
	public Ring()
	{
		System.out.println("RingDTO object is created");
	}
	
	private String material;
	private double price;
	private int ringid;
	private String shape;
	
	public String getMaterial()
	{
		return material;
	}
	public void setMaterial(String material)
	{
		this.material=material;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public int getRingid()
	{
		return ringid;
	}
	public void setRingid(int ringid)
	{
		this.ringid =ringid;
	}
	
	public String getShape()
	{
		return shape;
	}
	public void setShape(String shape)
	{
		this.shape = shape;
	}
}
