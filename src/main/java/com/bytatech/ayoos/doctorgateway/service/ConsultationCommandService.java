package com.bytatech.ayoos.doctorgateway.service;

import org.springframework.http.ResponseEntity;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.Prescription;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.BasicCheckUp;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.Consultation;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.NextTaskResource;

public interface ConsultationCommandService {
	public  ResponseEntity<NextTaskResource> initiateConsultation();
	public  ResponseEntity<NextTaskResource> basicCheckUp(String processId, BasicCheckUp basicCheckUp);
	public  ResponseEntity<Consultation> consultPatient( String processId, Prescription prescription );
	public  ResponseEntity<NextTaskResource> patientPrescription(String processId, Prescription prescription);
	public  ResponseEntity<NextTaskResource> requestPatientHistory(String processId, String choice );
	public  ResponseEntity<NextTaskResource> storeHistory(String processId, String otp,String choice);
	
	 }
