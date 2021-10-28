class Clock1Tester{
	
	public static void main(String a[])
	{
		System.out.println("main method started");
		
		Clock1 clock = new Clock1("square","small");
		
		System.out.println(clock.company+" "+clock.price+" "+clock.shape+" "+clock.size);
		System.out.println("main method is ended");
	}
}