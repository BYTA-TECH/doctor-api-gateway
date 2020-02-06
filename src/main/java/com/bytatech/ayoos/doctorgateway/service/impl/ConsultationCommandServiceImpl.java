package com.bytatech.ayoos.doctorgateway.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 

import com.bytatech.ayoos.doctorgateway.service.ConsultationCommandService;
import com.bytatech.ayoos.doctorgateway.client.consultation.api.*;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.BasicCheckUp;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.Consultation;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.NextTaskResource;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.Prescription;
@Service
@Transactional
public class ConsultationCommandServiceImpl implements ConsultationCommandService{

	
	@Autowired
	ConsultationCommandResourceApi consultationCommandResourceApi;
	@Override
	public  ResponseEntity<NextTaskResource> initiateConsultation(){
		return  consultationCommandResourceApi.initiateConsultationUsingPOST();
	}
	@Override
	public ResponseEntity<NextTaskResource> basicCheckUp(String processId, BasicCheckUp basicCheckUp){
		 return consultationCommandResourceApi.basicCheckUpTaskUsingPOST(processId, basicCheckUp);
	 }

	@Override
	public ResponseEntity<Consultation> consultPatient(String processId, Prescription prescription) {
		// TODO Auto-generated method stub
		return consultationCommandResourceApi.consultPatientUsingPOST(processId, prescription);
	}

	@Override
	public ResponseEntity<NextTaskResource> patientPrescription(String processId, Prescription prescription) {
		// TODO Auto-generated method stub
		return consultationCommandResourceApi.patientPrescriptionUsingPOST(processId, prescription);
	}

	@Override
	public ResponseEntity<NextTaskResource> requestPatientHistory(String processId, String choice) {
		// TODO Auto-generated method stub
		return consultationCommandResourceApi.requestPatientHistoryUsingPOST(processId, choice);
	}

	@Override
	public ResponseEntity<NextTaskResource> storeHistory(String processId, String otp, String choice) {
		// TODO Auto-generated method stub
		return consultationCommandResourceApi.storeHistoryUsingPOST(processId, choice, otp);
	}

}
