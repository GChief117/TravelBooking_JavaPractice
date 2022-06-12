package com.virtualpairprogrammers.travelbooking;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import bookingprocess.BookingProcess;
import bookingprocess.CheapTravelBookingSystem;
import bookingprocess.EnjoyableTourBookingSystem;

public class Main {

    public static void main(String[] args) throws InvalidTravelDurationException {

        TrainTicket trainTicket = new TrainTicket();
        trainTicket.cancel();

        TrainTicket trainTicket2 = null;
		try {
			trainTicket2 = new TrainTicket(123L,"London","Edinburgh", new BigDecimal("59.00"),
			        LocalDateTime.of(2022,3,7,22,03),
			        LocalDateTime.of(2022,3,7,23,03),
			        TravelTicketting.FIRST, 3, 42);
	        trainTicket2.upgrade();//where we get the error, only will run if train ticket 2 is created
	        trainTicket2.cancel();
		} catch (InvalidTravelDurationException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
        
        
		
        
        //String[] providers = {"First bus", "second buss"};
        
        
        
        //array list
        ArrayList<String> providers = new ArrayList<>();//shit gets imported<>//means specufuc object type
        providers.add("First bus company"); //instantiate in java
        providers.add("Second bus company");
        providers.add("Third bus company");
        //an an integer to the array list wont register in the list because we specified the object type
       // provider.add(123);
        
        
        
        System.out.println(providers.size());
        System.out.println(providers);
        
        providers.remove(1);
        
        
        System.out.println(providers.size());
        System.out.println(providers);
        
        
        BusTicket busTicket = null;//we set to null to initlaize variable
//	try {
        busTicket = new BusTicket(124L,"London","Edinburgh", new BigDecimal("59.00"),
			        LocalDateTime.of(2021,9,30,16,03),
			        LocalDateTime.of(2022,3,7,19,03), providers);
//		} catch (InvalidTravelDurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        //busTicket.cancel();
			
		BusTicket busTicket2 = new BusTicket(125L,"New York","Boston", new BigDecimal("59.00"),
			        LocalDateTime.of(2021,9,30,16,03),
			        LocalDateTime.of(2022,3,7,19,03), providers);
			
			
		BusTicket busTicket3 = new BusTicket(126L,"Paris","Calais", new BigDecimal("59.00"),
			        LocalDateTime.of(2021,9,30,16,03),
			        LocalDateTime.of(2022,3,7,19,03), providers);
			
	
    
    
    //array list bus
	List<TravelTicket> tickets = new ArrayList<>();//shit gets imported<>//means specufuc object type
	//HashSet<TravelTicket> tickets = new HashSet<>();	
	tickets.add(busTicket);//instantiate in java
    tickets.add(busTicket2);
    tickets.add(busTicket2);
    tickets.add(busTicket2);
    tickets.add(busTicket2);
    tickets.add(busTicket3);
    tickets.add(trainTicket2);

//    System.out.println(busTickets.get(1));
    
    
//    for (int i = 0; i < busTickets.size(); i++) {
//    	System.out.println(busTickets.get(i));
//   }
    
    //for each
    
    //cannot loop through all bustickets
   for (TravelTicket b: tickets) {
    System.out.println(b);
    	
   }
   
   //isntance of operator
   
   
   //getting an object fromo our list 
   TravelTicket foundTicket = tickets.get(2);
   System.out.println(foundTicket);
   
   
   
   if (foundTicket instanceof BusTicket) {
	   System.out.println("This is a bus ticket");
	   //casting
	   BusTicket foundBusTicket = (BusTicket) foundTicket; //casting to a found ticket
	   System.out.println(foundBusTicket.getPermittedProviders());
   }
   
   else if (foundTicket instanceof TrainTicket) {
	   System.out.println("This is a train ticket");
   } else {
	   System.out.println("This is a plane ticket");
   }
   
   //We just need to know what the methods are going to be called
   
   
   BusTicket foundBusTicket = (BusTicket) foundTicket;
   
   
   //converting travel ticket to bus ticket
   BusTicket busTicket31 = new BusTicket(foundTicket, providers);
   
   
   BookingProcess bookingSystem = new CheapTravelBookingSystem(foundTicket);
   
   //can also do cheap travels
   
   
   //we will try and look for them
   
   //BookingProcess bookingSystem = null; //cannot instatiate because its an interface

   
   bookingSystem.setTravelTicket(busTicket31);
   bookingSystem.requestBooking();
   System.out.println("The booking status " + bookingSystem.getStatus());
   
   //casting 
   
   
   //creating implentaiton of the interface
   //booking system will ahve access to interface
   
   
    
    //for ( BusTicket b: busTickets) { //for each
    //	System.out.println(b.getBookingRef()); //we will never get back an item which is null
    //}
   
   
   //create a list of integers
   List<Integer> integerList1 = new ArrayList<>();
   integerList1.add(1);
   integerList1.add(2);
   integerList1.add(3);
   integerList1.add(4);
   integerList1.add(5);
   
//can put values in list   
   List<Integer> integerList2 = List.of(1,2,3,4,5);
   
   for(Integer i: integerList2) { ///can do a for each loop 
	   System.out.println(i);
   }
   System.out.println(integerList2.getClass());
   
   integerList1.add(6);
   //integerList2.add(6);

   
	System.out.println(BookingProcess.getVersion());

	
	
	BookingProcess bookingSystem2 = BookingProcess.of(trainTicket);
   
   
    
    }
    
}
