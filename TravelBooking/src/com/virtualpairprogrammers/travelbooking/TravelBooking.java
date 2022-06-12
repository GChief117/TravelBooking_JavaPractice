package com.virtualpairprogrammers.travelbooking;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TravelBooking {
	
	public static void main (String [] args) throws InvalidTravelDurationException {
		Scanner scanner = new Scanner(System.in);
				
		
		int option = 0;
		
		while( !(option >=1 && option <=3)) {
			System.out.println("Enter 1 for bus ticket, 2 for train, or 3 for plane");
			option = scanner.nextInt();
			
			
		}
		
		System.out.println("Enter the booking ref");
		Long ref = scanner.nextLong();//set values at the end
		scanner.nextLine();
		//dont put in the next line
		
		System.out.println("Enter the origin");
		String origin = scanner.nextLine();//set values at the end
		
		System.out.println("Enter the destination");
		String destination = scanner.nextLine();//set values at the end
		
		System.out.println("Enter the price");
		BigDecimal price = scanner.nextBigDecimal();//set values at the end
		
		System.out.println("Enter the departure time");
		String dTime = scanner.nextLine();
		LocalDateTime departureTime = LocalDateTime.parse(dTime);//set values at the end
		
		System.out.println("Enter the arrival time");
		String aTime = scanner.nextLine();
		LocalDateTime arrivalTime = LocalDateTime.parse(aTime);//set values at the end
		
		
		switch (option) {
		case 1:  //bus
			BusTicket busTicket = new BusTicket(ref, origin, destination, price, departureTime, arrivalTime);
			System.out.println(busTicket);
			break;
		case 2:  //train
			System.out.println("Enter the travel case");
			String tClass = scanner.nextLine();
			TravelTicketting travelClass = TravelTicketting.valueOf(tClass.toUpperCase());
			System.out.println("eneter carriage number");
			int carriageNumber = scanner.nextInt();
			scanner.nextLine();
			System.out.println("eneter seat number");
			int seatNumber = scanner.nextInt();
			
			TrainTicket trainTicket = new TrainTicket(ref, origin, destination, price, departureTime, arrivalTime, travelClass, carriageNumber, seatNumber);
			System.out.println(trainTicket);
			
			break;
		case 3:  //plane
			System.out.println("Enter the travel case");
			String tClass2 = scanner.nextLine();
			TravelTicketting travelClass2 = TravelTicketting.valueOf(tClass2.toUpperCase());
			
			System.out.println("eneter stopover numbers");
			int stopovers = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("eneter seat number");
			int seatNumber2 = scanner.nextInt();
			
			TrainTicket planeTicket = new TrainTicket(ref, origin, destination, price, departureTime, arrivalTime, travelClass2, seatNumber2, stopovers);
			System.out.println(planeTicket);
			
			break;
		}
		
	}

}
