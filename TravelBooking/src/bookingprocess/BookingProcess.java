package bookingprocess;

import com.virtualpairprogrammers.travelbooking.TravelTicket;

public interface BookingProcess {
	//we will define the methods
	
	//then find if the booking is successful
	
	
	public void setTravelTicket(TravelTicket ticket);

	public void requestBooking(); 
	
	public boolean getStatus();
	
	public boolean cancel();
	
	
	//Interfaces are contracts
	
	public static String getVersion() {
		return "version 1";
	}
	
	
	
	public static BookingProcess of(TravelTicket ticket) {
		BookingProcess bookingSystem = new CheapTravelBookingSystem(ticket);
		bookingSystem.setTravelTicket(ticket);
		return bookingSystem;
		
	}
	
	
	public default boolean isExpire() {
		return true;
	}


	
	
	
	
	
	//There are no {} in interfaces only ;
	
	
	
	
	
}
