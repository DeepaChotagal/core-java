package com.toString.BELL;

public class Bell {

	private String brand;
	private String color;
	private String material;
	private String shape;
	private double price;
    private int bellid;
	
	public void setBrand(String brand){
		this.brand =  brand;
	}
	public String getBrand(){
		return brand;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	
	public void setMaterial(String material){
		this.material = material;
	}
	public String getMaterial(){
		return material;
	}
	
	public void setShape(String shape){
		this.shape = shape;
	}
	public String getShape(){
		return shape;
	}
	
	public void setPrice(double price)
	{
		this.price= price;
	}
	public double getPrice()
	{
		return price;
	}
	
	public void setBellid(int bellid)
	{
		this.bellid = bellid;
	}
	public int getBellid(){
		return bellid;
	}

	@Override
	public String toString(){
		return "Bell - [ Brand = "+getBrand()+" Color = "+getColor()+" Material = "+getMaterial()+" Shape = "+getShape()+" , Price ="+getPrice()+" , Bellid="+getBellid()+"]";
	}
}
