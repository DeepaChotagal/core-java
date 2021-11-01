class BanksName{
	
	static String banks[]={"SBI","canara","Indianbank","Unionbank","PunjabNationalBank","BankOfBaroda","CentralBank","PunjabandSind","KarnatakaBank","CorporationBank"};
		public static void main(String a[])
		{
		
		System.out.println(banks.length);
		getBanksName();
		}
		
		public static void getBanksName()
		{
			for(int i=0;i<banks.length;i++)
			{
				System.out.println(banks[i]);
			}
	    }
    }