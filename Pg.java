class Pg{
	
	public RoomsDTO[] rooms;
	private int index;
	 
	public Pg(int size)
	{
		rooms = new RoomsDTO[size];
	}
	
	public boolean addRooms(RoomsDTO rooms)
	{
		boolean isAdded = false;
		System.out.println("go inside addRooms()");
		if(rooms != null)
		{
			System.out.println("went inside Room");
			this.rooms[index++] = rooms;
			isAdded = true;
		}
		else
		{
			System.out.println("not ready to go inside room");
		}
		return isAdded;
	}
	
	public void getAllRooms()
	{
		for(int i=0;i<rooms.length;i++)
		{
			if(rooms[i] != null)
			{
				System.out.println(rooms[i].getRoomNumber()+" "+rooms[i].getRoomCost()+" "+rooms[i].getRoomSize());
			}
		}
		
	}
	
	public boolean updateRoomCostByNumber(double cost, int  roomNumber)
	{
		System.out.println("inside updateRoomCostByNumber()");
		boolean costUpadated = false;
		if(cost>0.0 && roomNumber != null)
		{
			System.out.println("cost is to be updated");
			for(int i=0;i<rooms.length;i++)
			{
				if(rooms[i].getRoomNumber().equals(roomNumber))
				{
					rooms[i].setRoomCost(cost);
					roomCostUpdated = true;
				}
			}
		}
		return roomCostUpdated;
	}
	
	public boolean deleteRoomsByNumber(int number)
	{
		System.out.println("inside deleteRoomsByNumber()");
		boolean isDeleted = false;
		for(int i=0;i<rooms.length;i++)
		{
			if(rooms[i]!=null)
			{
				if(rooms[i].getRoomNumber()==number)
				{
					rooms[i]=null;
					isDeleted=true;
				}
			}
			else
			{
				System.out.println("Rooms got removed");
			}
		}
		return isDeleted;
	}
	
	public RoomsDTO getRoomsByRoomNumber(int number)
	{
		System.out.println("inside getRoomsBynumber");
		{
			RoomsDTO dto = null;
			for(int i=0;i<rooms.length;i++)
				if(number>0)
				{
					if(rooms[i].getRoomNumber()==number)
						dto = rooms[i];
				}
				else{
					System.out.println("room with"+ number + "is not avilable");
				}
		}
		return dto;
	}
}