package com.lti.rest;

import java.util.ArrayList;
import java.util.List;

import com.lti.rest.Passenger.Status;

public class PnrDao {
	public Pnr fetch(int pnrNo) {
		Pnr pnr=new Pnr();
		pnr.setPnrNo(100);
		pnr.setTrainNo(1020);
		
		List<Passenger> passengers = new ArrayList<>();
		Passenger p1= new Passenger();
		p1.setName("Himani");
		p1.setStatus(Status.RAC);
		Passenger p2= new Passenger();
		p2.setName("Megha");
		p2.setStatus(Status.CONFIRMED);
		passengers.add(p1);
		passengers.add(p2);
		pnr.setPassengers(passengers);
		
		
		return pnr;
	}

}
