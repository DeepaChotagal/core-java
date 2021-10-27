class Bat{
	
	int id;
	String brand;
	double weightInKgs;
	String typeOfMaterial;
	double price ;
	String handleColor ;
	boolean isBatAvailableAndPlay;
	
	public Bat()
	{
		System.out.println("Bat object is created");
	}
	
	public boolean play(boolean haveMoodToPlay)
	{
		int minMembersRequiredToPlay = 3;
		System.out.println("invoked play");
		
		if(haveMoodToPlay == true && isBatAvailableAndPlay == true )
		{
			isBatAvailableAndPlay = true;
		}
		else
		{
			System.out.println("no mood to play");
			isBatAvailableAndPlay = false;
		}
		
		if(minMembersRequiredToPlay > 1 && isBatAvailableAndPlay == true)
		{
			System.out.println("Memebers are there start the match machha");
		}
		else
		{
			System.out.println("Bat is available ....but members are not available");
		}
	
		
		return isBatAvailableAndPlay;
	}
	
}