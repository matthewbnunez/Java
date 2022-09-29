//... imports class definition...
package com.caresoft.clinicpp;
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	
    // Inside class:    
    private ArrayList<String> patientNotes;

    
    // TO DO: Constructor that takes an ID
    public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
    public Physician(Integer id, int pin) {
		super(id, pin);
		// TODO Auto-generated constructor stub
	}


	// TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
    	// TODO Auto-generated method stub
    	if(pin > 999 && pin < 10000) {
    		return true;
    	}
    	return false;
    }
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	// TODO Auto-generated method stub
    	if(confirmedAuthID == id){
    		return true;
    	}
    	return false;
    }
	
    
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	
    // TO DO: Setters & Getters
    public ArrayList<String> getPatientNotes() {
    	return patientNotes;
    }
    
    
    public void setPatientNotes(ArrayList<String> patientNotes) {
    	this.patientNotes = patientNotes;
    }
    

}
