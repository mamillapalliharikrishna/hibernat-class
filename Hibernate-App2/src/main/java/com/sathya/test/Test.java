package com.sathya.test;

import com.sathya.dao.IPassengerDao;
import com.sathya.dao.impl.PassengerDaoImpl;
import com.sathya.entity.Passenger;

public class Test {
	public static void main(String[] args) {
		IPassengerDao  dao=new  PassengerDaoImpl();
		Passenger  passenger=new Passenger();
		passenger.setPassengerid(101);
		passenger.setFirstName("Pankaj");
		passenger.setLastName("Gupta");
		passenger.setAge(30);
		dao.save(passenger);
	}

}
