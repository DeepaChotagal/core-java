class MobilePhone{
	
	String name;
	int version;
	String memory;
	double price;
	String cellularTechnology;
	String color;
	String os;
	
	public MobilePhone()
	{
		System.out.println("MobilePhone object is created");
	}
	
	public MobilePhone(String name)
	{
		this();
		System.out.println("MobilePhone with 1 parameter is called");
		this.name = name;
	}
	
	public MobilePhone(int version,String memory)
	{
		this("vivo");
		System.out.println("MobilePhone with 2 parameter is called");
		this.version = version;
		this.memory = memory;
	}
	
	public MobilePhone(double price,String cellulaarTechnology,String color,String os)
	{
		this(7,"64gb");
		System.out.println("MobilePhone with 4 parameter is created");
	}
	
}