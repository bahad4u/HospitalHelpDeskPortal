package com.HMHDP.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.HMHDP.model.Appointment;
import com.HMHDP.model.HospitalDetails;
import com.HMHDP.model.Specialist;

@Service
public class HospitalHelpDeskService {

	public final static List<Specialist> specialistsAndDetails = populateSpecialistsAndDetails();

	public final static List<HospitalDetails> hospitalDetails = populateHospitalDetails();

	private static List<Specialist> populateSpecialistsAndDetails() {
		List<Specialist> specialistsAndDetails = new ArrayList<>();
		specialistsAndDetails.add(new Specialist("Dr.Manikavasagam", "Pediatricians", "Monday,Wednesday", "5 to 6", "Y", "102"));
		specialistsAndDetails.add(new Specialist("Dr.Yousuf", "Pediatricians", "Monday,Thursday", "6 to 8", "N", "102"));
		specialistsAndDetails.add(new Specialist("Dr.Laxmi", "Cardiologist", "Monday,Tuesday", "10 to 12", "Y", "105"));
		specialistsAndDetails.add(new Specialist("Dr.Madhavan", "Cardiologist", "Monday,Friday", "11 to 12", "Y", "105"));
		specialistsAndDetails.add(new Specialist("Dr.Aravind", "Pediatricians", "Tuesday,Wednesday", "2 to 4", "N", "106"));
		return specialistsAndDetails;
	}

	/**
	 * Populate Hospital details
	 * 
	 * @return
	 */

	private static List<HospitalDetails> populateHospitalDetails() {
		List<HospitalDetails> hospitalDetails = new ArrayList<>();
		hospitalDetails.add(new HospitalDetails("102", 8));
		hospitalDetails.add(new HospitalDetails("105", 12));
		hospitalDetails.add(new HospitalDetails("106", 5));
		return hospitalDetails;
	}

	/**
	 * Get specialist details
	 * 
	 * @param hospitalId
	 * @param type
	 * @return
	 */
	public Specialist getSpecialistDetails(String hospitalId, String type) {
		Specialist specialistDetails = null;
		for (Specialist specialist : specialistsAndDetails) {
			if (specialist.getHospitalId().equalsIgnoreCase(hospitalId)
					&& specialist.getType().equalsIgnoreCase(type)) {
				specialistDetails = specialist;
			}
		}
		return specialistDetails;
	}
	
	public Specialist retrieveSpecialistfromhospitalDetails(String hospitalId ){
		Specialist specialistDetails = null;
		for (Specialist specialist : specialistsAndDetails) {
		if (specialist.getHospitalId().equalsIgnoreCase(hospitalId)) {
			specialistDetails = specialist;
		}
		}
		return specialistDetails;
	}

	public int getAvailableBeds(String hospitalId) {
		int hospitalDetail = 0;
		for (HospitalDetails hospital : hospitalDetails) {
			if (hospital.getHospitalId().equalsIgnoreCase(hospitalId)) {
				hospitalDetail = hospital.getAvailableBeds();
			}
		}
		return hospitalDetail;
	}

	public Appointment createAppointment(String hospitalId, String doctorName, String patientName,
			String availableDay) {
		Appointment appointmentDetails = null;
		for (Specialist doctorsDetails : specialistsAndDetails) {
			if (doctorsDetails.getHospitalId().equalsIgnoreCase(hospitalId)
					&& doctorsDetails.getName().equalsIgnoreCase(doctorName)) {
					appointmentDetails = new Appointment(doctorsDetails.getName(), patientName,
						doctorsDetails.getAvailableDay(), doctorsDetails.getAvailableTime());
			}
		}
		return appointmentDetails;
	}

	/**
	 * check specialist already available or not
	 * 
	 * @param specialistName
	 * @return
	 */
	public boolean checkSpecialistName(String specialistName) {
		boolean flag = false;
		for (Specialist specialist : specialistsAndDetails) {
			if (specialist.getName().equalsIgnoreCase(specialistName)) {
				flag = true;
			}
		}
		return flag;
	}
	
	public List<Specialist> listOfSpecialist() {		
		return specialistsAndDetails;
	}
}
