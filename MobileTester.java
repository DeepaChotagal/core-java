class MobileTester{
	
	public static void main(String a[])
	{
		
		OldMobile oldMobile = new OldMobile();
		oldMobile.call();
		oldMobile.message();
		
		MidMobile midMobile = new MidMobile();
		midMobile.camera();
		
		NewMobile newMobile = new NewMobile();
		newMobile.video();
		
		OldMobile newmobile = new NewMobile();
		newmobile.call();
		newmobile.message();
		
		OldMobile midmobile = new MidMobile();
		midmobile.call();
		midmobile.message();	
	}
}