package com.HMHDP.model;

public class HospitalDetails {

	private String hospitalId;
	private int availableBeds;

	public HospitalDetails(String hospitalId, int availableBeds) {
		super();
		this.hospitalId = hospitalId;
		this.availableBeds = availableBeds;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public int getAvailableBeds() {
		return availableBeds;
	}

	public void setAvailableBeds(int availableBeds) {
		this.availableBeds = availableBeds;
	}

}
