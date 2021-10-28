class HallTicket{
	
	public String usnNo;
	public String subjectName;
	public String candidateName;
	
	public HallTicket(String usnNo,String subjectName,String candidateName)
	{
		this.usnNo = usnNo;
		this.subjectName =subjectName;
		this.candidateName = candidateName;
	}
	
	public void displayDetails()
	{
		System.out.println("inside displayDetails()");
		System.out.println("Usn No:"+ this.usnNo);
		System.out.println("Subject Name:"+ this.subjectName);
		System.out.println("Candidate Name:"+ this.candidateName);
	}
}