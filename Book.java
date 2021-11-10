class Book{
	int bookid;
	String name;
	
	@Override
	public int hashCode()
	{
		return bookid;
	}
	void getknowledge()
	{
		System.out.println("book provides knowledge");
	}
	
	public static void main(String a[])
	{
		Book book = new Book();
		book.bookid = 1;
		System.out.println(book.hashCode());
		
		Book book1 = new Book();
		book1.bookid=2;
		System.out.println(book1.hashCode());
	}
}