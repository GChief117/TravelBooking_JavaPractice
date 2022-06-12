package com.virtualpairprogrammers.travelbooking;

import java.math.BigDecimal;
import java.util.Objects;

public class PlaneTicket extends TravelTicket{
	//parameters
	
	private TravelTicketting travelClass;//wrapper class
	private Integer seatNumber;
	private Integer stopOvers;
	
	
	
	
	
	
	
	//default constructor
	public PlaneTicket() {
		super();
	}
	
	
	
	//all parameter construcotr

	
	

	public TravelTicketting gettravelClass() {
		return travelClass;
	}
	public PlaneTicket(TravelTicketting travelClass, Integer seatNumber, Integer stopOvers) {
		super();
		this.travelClass = travelClass;
		this.seatNumber = seatNumber;
		this.stopOvers = stopOvers;
	}


	///then mthods--getters & setters
	public void settravelClass(TravelTicketting travelClass) {
		this.travelClass = travelClass;
	}
	public Integer getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}
	public Integer getStopOvers() {
		return stopOvers;
	}
	public void setStopOvers(Integer stopOvers) {
		this.stopOvers = stopOvers;
	}
	
	
	//methods
	
	
	public void upgrade() {
		super.setPrice(getPrice().multiply(new BigDecimal("2")));
		System.out.println("Upgrade");		
	}
	
	
	
	public void addStopOver() {
		stopOvers++;
		System.out.println("You have " + stopOvers + " stopovers");
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(seatNumber, stopOvers, travelClass);
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
		PlaneTicket other = (PlaneTicket) obj;
		return Objects.equals(seatNumber, other.seatNumber) && Objects.equals(stopOvers, other.stopOvers)
				&& Objects.equals(travelClass, other.travelClass);
	}



	@Override
	public String toString() {
		return "PlaneTicket [travelClass=" + travelClass + ", seatNumber=" + seatNumber + ", stopOvers=" + stopOvers
				+ "]";
	}

	
	

	}
	
	
	
	
	
