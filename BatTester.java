class BatTester{
	
	public static void main(String a[])
	{
		Bat bat = new Bat();
		bat.id = 345;
		bat.brand = "MRF";
		bat.weightInKgs = 15;
		bat.typeOfMaterial = "wood";
		bat.price = 5000.00;
		bat.handleColor = "Black";
		boolean play = bat.play(false);
		System.out.println("can we startr the match:"+play);
	}
}