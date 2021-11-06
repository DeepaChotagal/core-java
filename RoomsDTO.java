public class RoomsDTO{
	int roomNumber;
	double roomCost;
	String roomSize;
	
	public void setRoomNumber(int roomNumber){
		this.roomNumber =  roomNumber;
	}
	public int getRoomNumber(){
		return roomNumber;
	}
	public void setRoomCost(double roomCost){
		this.roomCost = roomCost;
	}
	public double getRoomCost(){
		return roomCost;
	}
	
	
	public void setRoomSize(String roomSize){
		this.roomSize = roomSize;
	}
	public String getRoomSize(){
		return roomSize;
	}
}