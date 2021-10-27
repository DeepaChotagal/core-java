class CoolerTester{
	
	public static void main(String a[])
	{
		System.out.println("main method started");
		
		Cooler cool = new Cooler(420,"voltas");
		Cooler cool1 = new Cooler(3000.00,"white","5 ltrs");
		System.out.println(cool.coolerid+"  "+cool.name+"  "+cool1.price+"  "+cool1.color+"  "+cool1.waterCapacity);
		System.out.println("main method ended");
	}
}