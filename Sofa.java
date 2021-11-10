class Sofa{
	
	 String material;
	 int price;
	 int sofaid;
	 String shape;
	 int varieties;
	 
	@Override
	 public int hashCode()
	 {
		 return sofaid;
	
	 }
	
	 public static void main(String a[])
	 {
		 Sofa sofa = new Sofa();
		 sofa.sofaid=68;
		 System.out.println(sofa.hashCode());
	 } 
}
	