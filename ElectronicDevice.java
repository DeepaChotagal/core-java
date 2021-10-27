class ElectronicDevice{
	
	public String name;
	public String processor;
	public double price;
	public String ram;
	
	public void dailyuse()
	{
		System.out.println("electronic devices are used in daily life");
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setProcessor(String processor)
	{
		this.processor = processor;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setRam(String ram)
	{
		this.ram = ram;
	}
	
	public void displayDetails()
	{
		System.out.println(this.name+" "+this.processor+" "+this.price+" "+this.ram);
	}
	
	public void dailylife()
	{
		System.out.println("used in daily life");
	}
	
	
}