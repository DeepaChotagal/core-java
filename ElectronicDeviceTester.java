class ElectronicDeviceTester{
	
	public static void main(String a[])
	{
		ElectronicDevice device = new ElectronicDevice();
		device.setName("TV");
		device.setProcessor("OS");
		device.setPrice(60000.00);
		device.setRam("8gb");
		device.displayDetails();
		
		SmartPhone phone = new SmartPhone();
		phone.setName("vivo");
		phone.setProcessor("intel");
		phone.setPrice(10000.00);
		phone.setRam("4gb");
		phone.displayDetails();
		
		SmartWatch watch = new SmartWatch();
		watch.setName("Samsung");
		watch.setProcessor("Android based os");
		watch.setPrice(5000.00);
		watch.setRam("2gb");
		watch.displayDetails();
	}
}