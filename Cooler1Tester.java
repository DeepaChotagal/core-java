class Cooler1Tester{
	
	public static void main(String a[]){
		System.out.println("main method started");
		
		Cooler1 cool=new Cooler1(3000.00,"white","5 ltrs");
		System.out.println(cool.coolerid+" "+cool.name+" "+cool.price+" "+cool.color+" "+cool.waterCapacity);
		System.out.println("main method is ended");
	}
}