class Printer{
	
	int printerId;
	String size;
	String brand;
	double price;
	String type;
	
	public void print()
	{
		System.out.println("printing papers");
	}
	public static void main(String a[])
	{
		Printer printer = new Printer();
		printer.size = "12x12 inch";
        printer.brand = "HP";
		printer.price = 8000.00;
		printer.type = "Ink-jet";
		printer.print();
		}
}