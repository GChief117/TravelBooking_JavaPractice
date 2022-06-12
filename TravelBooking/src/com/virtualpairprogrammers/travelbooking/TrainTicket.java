package com.virtualpairprogrammers.travelbooking;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class TrainTicket extends TravelTicket {

    private TravelTicketting travelClass;
    private Integer carriageNumber;
    private Integer seatNumber;

    public TrainTicket() {
        super(); //the superclass allows for //use super when you are inheriting constructors from another class
    }

    public TrainTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, TravelTicketting travelClass, Integer carriageNumber, Integer seatNumber) throws InvalidTravelDurationException {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.carriageNumber = carriageNumber;
        this.seatNumber = seatNumber;
    }

    public TravelTicketting getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(TravelTicketting travelClass) {
        this.travelClass = travelClass;
    }

    public Integer getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(Integer carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void upgrade() {
        if(travelClass != TravelTicketting.FIRST) {
            travelClass = TravelTicketting.FIRST;
            System.out.println("You have been upgraded");
        }
        else {
            System.out.println("You are already in 1st class");
        }
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(carriageNumber, seatNumber, travelClass);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainTicket other = (TrainTicket) obj;
		return Objects.equals(carriageNumber, other.carriageNumber) && Objects.equals(seatNumber, other.seatNumber)
				&& Objects.equals(travelClass, other.travelClass);
	}

	@Override
	public String toString() {
		return "TrainTicket [travelClass=" + travelClass + ", carriageNumber=" + carriageNumber + ", seatNumber="
				+ seatNumber + "]";
	}
    
	
    
    
    
    
    
    
    
    
    
}
