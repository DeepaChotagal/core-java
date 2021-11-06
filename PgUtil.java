import java.util.Scanner;

class PgUtil{



public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size");
       int size    =  sc.nextInt();
          Pg pg = new Pg(size);
  RoomsDTO dto1 ;
      for(int i = 0 ; i < size ; i++){
     dto1 = new RoomsDTO();
  System.out.println("Enter the Number");
          dto1.setRoomNumber(sc.nextInt());
 System.out.println("Enter the  Room cost");
          dto1.setRoomCost(sc.nextDouble());
 System.out.println("Enter the  room size");
          dto1.setRoomSize(sc.next());

     }


 String text = null ;
   do{
     System.out.println("Press 1 to get all rooms");
   System.out.println(" Press 2   to Update room cost By Name");
    System.out.println("Press 3   to Delete room By Number");
   System.out.println("Press 4 to fetch Room By Number") ;

       int choice =   sc.nextInt();
    
switch(choice){
      case 1  :      pg.getAllRooms();
      break;
      case 2  :   System.out.println("Enter the room Number to update Cost");
                        int roomNumber = sc.nextInt();
                        System.out.println("Enter the Updated Cost ");
                       double Cost = sc.nextDouble();
                       boolean isUpdated =  pg. updateRoomCostByNumber(Cost , roomNumber) ; 
                       System.out.println("cost is Updated "+isUpdated);
      break ; 

   case 3  :    System.out.println("Enter the  Number to delete Food Item");
                     pg.deleteRoomsByNumber(sc.nextInt());
     break ; 
   case 4  :   System.out.println("Enter the  Id to get Food Item");
    RoomsDTO   dto  =    pg.getRoomsByRoomNumber(sc.nextInt()) ; 
      if(dto != null){
              System.out.println(dto.getRoomNumber() + "   "+ dto.getRoomCost()  + "  "+  dto.getRoomSize() );
       }
else{
         System.out.println("No Room Found");
    }
   break ; 
    default :   System.out.println("Wrong Choice ...... ");
 break  ; 
}
   
  System.out.println(" Do u want to continue ?  Y/N");
   text =  sc.next();
 }while(text.equals("Y")) ;
  
  System.out.println("Thank you for Using the our Pg Rooms");


}


}