package com.spring.springall.hotelmanagment;

public class Reservations {
 
	private String place;
	
	private String hotelName;

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	@Override
	public String toString() {
		return "Reservations [place=" + place + ", hotelName=" + hotelName + "]";
	}
	
	
}
