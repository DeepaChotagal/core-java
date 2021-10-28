class MobilePhoneTester{
	
	public static void main(String a[])
	{
		System.out.println("main method started");
		
		MobilePhone mobile = new MobilePhone(15000.00,"5G","Blue","Andriod");
		System.out.println(mobile.name+"  "+mobile.version+"  "+mobile.memory+"  "+mobile.price+"  "+mobile.cellularTechnology+"  "+mobile.color+"  "+mobile.os);
		System.out.println("main method is ended");
	}
}