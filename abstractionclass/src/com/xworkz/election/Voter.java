package com.xworkz.election;

public class Voter implements Election {

	@Override
	public int validAge() {
		return 19;
	}

	@Override
	public int wardNo() {
		return 250;
	}

	@Override
	public String address() {
		return "Banglore";
	}

}

