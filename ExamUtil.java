class ExamUtil{
	
	public static void main(String a[])
	{
		Exam exam = new Exam(1300);
		
		HallTicket ticket = new HallTicket("2ka17ec012","mathematics","Deepa");
		exam.allow(ticket);
	}
}