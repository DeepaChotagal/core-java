package com.xworkz.election;

public class ElectionUtil {

	public static void main(String[] args) {
		Election election = new Voter();

		ElectionCommision electionCommision= new ElectionCommision(election);

		System.out.println(electionCommision.cardValidation());
	}
}

