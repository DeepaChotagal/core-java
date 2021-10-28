class Bulb1{
	
	String specialFeature;
	int wattage;
	String material;
	String Brand;
	String color;
	String lightType;
	
	public Bulb1()
	{
		System.out.println("Bulb1 object is created");
	}
	
	public Bulb1(String specialFeature)
	{
		this();
		System.out.println("Bulb1 object with 1 parameter is created");
		this.specialFeature = specialFeature;
	}
	
	public Bulb1(int wattage,String material)
	{
		this("Energy Efficient");
		System.out.println("Bulb1 object with 2 parameter is created");
		this.wattage = wattage;
		this.material = material;
	}
	
	public Bulb1(String Brand,String color,String lightType)
	{
		this(60,"Glass");
		System.out.println("Bulb1 object with 3 parameter is created");
		this.Brand = Brand;
		this.color = color;
		this.lightType = lightType;
	}
    	
}