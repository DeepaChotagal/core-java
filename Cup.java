public class Cup{
	private String color;
	private double price;
	private String  size;
	private String material;
	private int weightingrams;
	private int cupid;
	
	public Cup(){
		System.out.println("CupDTO object is created");
	}
	

	public void setColor(String color){
		this.color =  color;
	}
	public String getColor(){
		return color;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	
	public String getSize(){
		return size;
	}
	public void setSize(String size){
		this.size=size;
	}
	
	public String getMaterial()
	{
		return material;
	}
	public void setMaterial(String material){
		this.material=material;
	}
	
	public int getWeightingrams(){
		return weightingrams;
	}
	public void setWeightingrams(int weightingrams)
	{
		this.weightingrams=weightingrams;
	}
	
	public int getCupid()
	{
	  return cupid;
	}
	public void setCupid(int cupid){
	this.cupid=cupid;
	}
	
	
	@Override
	public int hashCode(){
		return cupid;
	}
}