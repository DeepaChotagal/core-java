class Bangle{
	
    String material;
	double price;
	String shape;
	String size;
	int Bangles;
		
	public void bangle()
	{
		System.out.println("girls love Bangles");
	}
	
	public static void main(String a[])
	{
		Bangle bangles = new Bangle();
		bangles.material = "gold";
		bangles.price = 2000;
		bangles.shape = "round";
		bangles.size = "small";
		bangles.Bangles = 6;
		
		Bangle bangles1 = new Bangle();
		bangles1.material = "silver";
		bangles1.price = 5000;
		bangles1.shape = "round";
		bangles1.size = "medium";
		bangles1.Bangles = 8;
		
		bangles.bangle();
		bangles1.bangle();
	}
}