class Xworkz{
	
	static String name;
	static String college;
	
	public Xworkz(String name,String college)
	{
		this.name = name;
		this.college = college;
		System.out.println("Xworkz object is created");
	}
	
	public static void main(String a[])
	{
		Xworkz xworkz = new Xworkz("Deepa","SKSVMACET");
		System.out.println(name+" "+college);
	}
      
	  

}