package com.virtualpairprogrammers.travelbooking;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class BusTicket extends TravelTicket{
	//parameters
	
	//private ArrayList<String> permittedProviders;
	
	private ArrayList<String> permittedProviders;
	
	
	//constructor
	public BusTicket(Long ref, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime) {
		
	}
	
	//constructors--one from super
	public BusTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime,
			LocalDateTime arrivalTime, ArrayList<String> providers) throws InvalidTravelDurationException {
		super(bookingRef, origin, destination, price, departureTime, arrivalTime);
		
	}
	
	
	
	//convert parent vs child
	
	public BusTicket(TravelTicket t, ArrayList<String> permittedProviders) throws InvalidTravelDurationException {
		super(t.getBookingRef(), t.getOrigin(), t.getDestination(), t.getPrice(), t.getDepartureTime(), t.getArrivalTime());
		this.permittedProviders = permittedProviders;
	}
	
	
	
	
	
	//possible getters and setters
	public ArrayList<String> getPermittedProviders() {
		return permittedProviders;
	}



	public void setPermittedProviders(ArrayList<String> permittedProviders) {
		this.permittedProviders = permittedProviders;
	}

	@Override //this is an annotation, can provide configuration, method class or attribute, its an extra to check to see if it compiles form the parent class
	public void cancel() {
		// TODO Auto-generated method stub
		
		Duration d = Duration.between(LocalDateTime.now(), getDepartureTime());
		Long days = d.toDays();
		//for any if statement, you need to store locally prior to calling it
		//example days 
	
		if (days > 30) {
			super.cancel();
		}
		else {
			System.out.println("Sorry too late bitch!");
		}
		
		super.cancel(); //calling the parent class's cancel method
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusTicket)) return false;
        if (!super.equals(o)) return false;
        BusTicket busTicket = (BusTicket) o;
        return Objects.equals(permittedProviders, busTicket.permittedProviders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), permittedProviders);
    }

    @Override
    public String toString() {
        return "BusTicket{" +
                super.toString() +
                " permittedProviders=" + permittedProviders +
                "} " ;
	
	
	//finding out the duraciton
	


}
}
