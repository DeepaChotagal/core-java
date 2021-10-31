class SuperMarkets{
	
	
	    static String groceries[]={"bread","rice","wheat","dal","biscuits","oil","salt","drink powder","masala","detergent","soap"};
		static String dairyProducts[]={"Milk","curd","milshake","butter","lassi","cheese","yogurt","ice cream","cottege cheese","sour cream","powdered milk"};
		static String vegetables[]={"tomato","biiterGuard","pumpkin","lady'sFinger","drumStick","cabbege","carrot","radish","onion","tinda"};
		static String fruits[]={"Apple","banana","cherry","orange","grape","peach","kiwi","blueberry","plum","watermelon","pineapple"};
		static String dryfruits[]={"almond","cashewnuts","pista","kishmish","walnut","anjeer","date","peanuts","sesame seeds","alsi"};
		static String careproducts[]={"body lotion","glass cleaners","oven cleaners","soaps","conditioners","handwahs","shampoo","perfume","hair spray","hair gel"};
		
		
		public static void main(String a[])
		{
		System.out.println(groceries.length);
		System.out.println(dairyProducts.length);
		System.out.println(vegetables.length);
		System.out.println(fruits.length);
		System.out.println(dryfruits.length);
		System.out.println(careproducts.length);
		
		getSuperMarkets();
		}
		
		public static void getSuperMarkets()
		{
			for(int i=0;i<groceries.length;i++)
			{
	         System.out.println(groceries[i]);
			}
	        for(int i=0;i<dairyProducts.length;i++)
			{
				System.out.println(dairyProducts[i]);
			}
			for(int i=0;i<vegetables.length;i++)
			{
			    System.out.println(vegetables[i]);	
			}
			for(int i=0;i<fruits.length;i++)
			{
				System.out.println(fruits[i]);
			}
			for(int i=0;i<dryfruits.length;i++)
			{
				System.out.println(dryfruits[i]);
			}
			for(int i=0;i<careproducts.length;i++)
			{
				System.out.println(careproducts[i]);
			}
		}
			
    }