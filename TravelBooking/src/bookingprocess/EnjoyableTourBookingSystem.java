package bookingprocess;

import com.virtualpairprogrammers.travelbooking.TravelTicket;

public class EnjoyableTourBookingSystem implements BookingProcess {

	public EnjoyableTourBookingSystem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setTravelTicket(TravelTicket ticket) {
		System.out.println("Enjoyable tours has received ticket " + ticket);
	}

	@Override
	public void requestBooking() {
		System.out.println("Enjoyable tours has booking request");

	}

	@Override
	public boolean getStatus() {
		System.out.println("Enjoyable tours is providing the status of booking");
		return false;
	}

	@Override
	public boolean cancel() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	//interfaces have override
	//if we add another method

}
