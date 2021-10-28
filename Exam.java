class Exam{
	
	int fees;
	
    HallTicket hallTicket;
	
	public Exam(int fees)
	{
		this.fees = fees;
	}
	
	public static String universityName = "VTU";
	
	public void allow(HallTicket hallTicket)
	{
		System.out.println("inside allow()");
		if(fees>1200)
		{
			if(hallTicket!= null)
			{
				this.hallTicket =  hallTicket;
				hallTicket.displayDetails();
				System.out.println("allowed to write Exam...All the best");
			}
			else
			{
				System.out.println("NO HallTicket found ....not allowed to write exam");
			}
		}
		else
		{
			System.out.println("Gube...please first pay the fees");
			
		}
	}
}