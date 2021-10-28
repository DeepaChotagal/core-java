class Bulb1Tester{
	
	public static void main(String a[])
	{
		System.out.println("main method started");
		
		Bulb1 bulb = new Bulb1("PHILIPS","white","incandescent");
		System.out.println(bulb.specialFeature+"  "+bulb.wattage+"  "+bulb.material+"  "+bulb.Brand+"  "+bulb.color+"  "+bulb.lightType);
		System.out.println("main method ended");
	}
}







