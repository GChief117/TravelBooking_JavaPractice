package bookingprocess;

import com.virtualpairprogrammers.travelbooking.TravelTicket;

public class CheapTravelBookingSystem implements BookingProcess {

	public CheapTravelBookingSystem(TravelTicket ticket) {
		System.out.print("CheapTravel has received ticket" + ticket);
	}

	@Override
	public void setTravelTicket(TravelTicket ticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestBooking() {
		System.out.println("Cheap travel has had a booking request.");
	}

	@Override
	public boolean getStatus() {
		return false;
	}

	public boolean cancel() {
		// TODO Auto-generated method stub
		return false;
	}


}
