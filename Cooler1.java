class Cooler1{
	
	int coolerid;
	String name;
	double price;
	String color;
	String waterCapacity;
	
	public Cooler1()
	{
		System.out.println("Cooler object is created");
	}
	
	public Cooler1(int coolerid,String name)
	{
		this();
		System.out.println("Cooler with 2 parameter is called ");
		this.coolerid = coolerid;
		this.name = name;
	}
	
	public Cooler1(double price,String color,String waterCapacity)
	{
		this(240,"voltas");
		System.out.println("cooler with 3 parameter is called");
		this.price= price;
		this.color = color;
		this.waterCapacity = waterCapacity;
	}
}