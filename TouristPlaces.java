class TouristPlaces{
	
	static String touristPlaces[]={"Mysore","Bangalore","Hampi","Gokarna","Belur and Halebidu","Joga Falls","Dandeli","Udupi","Nandi Hills","Bijapur","Chikmagalur","Shivanasamudra Falls","coorga","Bandipur National Park","Kemmangundi","Murudeshwar","Mangalore","Badami","Srirangapatna","Sringeri"};
		
		
	public static void main(String a[])
        {        
                 System.out.println(touristPlaces.length);
                  getTouristPlaces();
        }
          
	public static void getTouristPlaces()
        {
		
	 for(int i=0;i<touristPlaces.length;i++)
           {
	      System.out.println(touristPlaces[i]);
            }
		
		
	}
	
}