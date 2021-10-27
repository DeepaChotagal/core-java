class PrinterConstruct{
	
	int printerId;
	String size;
	String brand;
	double price;
	String type;
	
	public PrinterConstruct(int pid, String sz, String bnd, double pc, String tp)
	{
		System.out.println("Printer Object is created");
		printerId = pid;
		size = sz;
		brand = bnd;
		price = pc;
		type = tp;
	}
	
	public void print()
	{
		System.out.println("printing papers");
	}
	
	public void displayDetails()
	{
		System.out.println(printerId+"  "+size+"  "+brand+"  "+price+"  "+type);
	}
	
	public static void main(String a[])
	{
		PrinterConstruct printer = new PrinterConstruct(4567,"12x12 inch","HP",8000.00,"Ink-jet");
		printer.displayDetails();
		PrinterConstruct printer1 = new PrinterConstruct(5678,"15x15 inch","canon",7000.00,"Normal");
		printer.displayDetails();
		printer.print();
		printer1.print();
	}
}