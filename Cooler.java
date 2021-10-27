class Cooler{
	
	int coolerid;
	String name;
	double price;
	String color;
	String waterCapacity;
	
	public Cooler()
	{
		System.out.println("cooler object is created");
	}
	
	public Cooler(int coolerid,String name)
	{
		System.out.println("cooler withe 2 parametr is called");
		this.coolerid=coolerid;
		this.name=name;
	}
	
	public Cooler(double price,String color,String waterCapacity)
	{
		System.out.println("cooler with 3 parameter is called");
		this.price=price;
		this.color=color;
		this.waterCapacity=waterCapacity;
	}
}