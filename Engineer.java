class Engineer{
	
	static String Engineertypes[]={"Aerospace engineer","Agriculture engineer","Automotive engineer","Biomedical engineer","Chemical engineer","Civil engineer","Data engineer","Electrical engineer","Environmental engineer","Geological engineer","Software engineer"};
	
	public static void main(String a[])
	{
	System.out.println(Engineertypes.length);
	getEngineer();
	}
	
	public static void getEngineer()
	{
		for(int i=0;i<Engineertypes.length;i++)
		{
			System.out.println(Engineertypes[i]);
		}
	}
}