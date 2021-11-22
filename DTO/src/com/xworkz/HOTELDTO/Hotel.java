package com.xworkz.HOTELDTO;

public class Hotel {
	
	public Hotel()
	{
		System.out.println("HotelDTO object is created");
	}
	
	private int hotelid;
	private String name;
	private String address;
	private String[] menuItems;
	
	public int getHotelid()
	{
		return hotelid;
	}
	
	public void setHotelid(int hotelid)
	{
		this.hotelid = hotelid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String[] getMenuitems()
	{
		return menuItems;
	}
	
	public void setMenuitems(String[] menuItems)
	{
		this.menuItems = menuItems;
	}
}
