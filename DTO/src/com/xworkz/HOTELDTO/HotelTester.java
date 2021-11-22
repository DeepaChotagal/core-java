package com.xworkz.HOTELDTO;

public class HotelTester {

	static String []menuItems = {"chicken Biryani","All sweets","fish fry","jamun","gobi"};
	
	public static void main(String a[])
	{
		Hotel dto = new Hotel();
		dto.setHotelid(23);
		dto.setName("President Hotel");
		dto.setAddress("Hubli");
		dto.setMenuitems(menuItems);
		
		System.out.println(dto.getHotelid()+" "+dto.getName()+" "+dto.getAddress());
		
		String[] items = dto.getMenuitems();
		for(int i=0;i<items.length;i++)
		{
			System.out.println(items[i]);
		}
	}
}
