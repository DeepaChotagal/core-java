class PowerBank1{
	
	String brand;
	String color;
	String connectorType;
	int voltage;
	double batteryCapacity;
	double price;
	
	public PowerBank1(String brand)
	{
		System.out.println("PowerBank object with 1 parameter is created");
        this.brand = brand;
	}
	
	public PowerBank1(String color,String connectorType)
	{
		this("URBN");
		System.out.println("PowerBannk with 2 parameter is created");
		this.color = color;
		this.connectorType = connectorType;
	}
	
	public PowerBank1(int voltage,double batteryCapacity,double price)
	{
		this("black","USB");
		System.out.println("PowerBank with 3 parameter is created");
		this.voltage = voltage;
		this.batteryCapacity = batteryCapacity;
		this.price = price;
	}
}