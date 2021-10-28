class Bangle1{
	
	String material;
	double price;
	String shape;
	String size;
	int bangles;
	
	public Bangle1()
	{
		System.out.println("Bangle object is created");
	}
	
	public Bangle1(String material,double price)
	{
		this();
		System.out.println("Bangle object with 2 parameter is created");
		this.material = material;
		this.price = price;
	}
	
	public Bangle1(String shape,String size,int bangles)
	{
		this("gold",2000.00);
		System.out.println("Bangle object with 3 parameter is created");
		this.shape = shape;
		this.size = size;
		this.bangles = bangles;
	}
}