class Clock1{
	
	String company;
	double price;
	String shape;
	String size;
	
	public Clock1()
	{
		System.out.println("Clock object is created");
	}
	
	public Clock1(String company,double price)
	{
		this();
		System.out.println("Clock1 with 2 parameter is created");
		this.company = company;
		this.price = price;
	}
	
	public Clock1(String shape,String size )
	{
		this("Sonata",5000.00);
		System.out.println("Clock1 with 2 parameter is created");
		this.shape = shape;
		this.size = size;
	}
	
}