class PowerBank1Tester{
	
	public static void main(String a[])
	{
		System.out.println("main method started");
		
		PowerBank1 powerbank = new PowerBank1(5,20000,950);
		
		System.out.println(powerbank.brand+"  "+powerbank.color+"  "+powerbank.connectorType+"  "+powerbank.voltage+"  "+powerbank.batteryCapacity+"  "+powerbank.price);
		System.out.println("main method ended");
	}
}