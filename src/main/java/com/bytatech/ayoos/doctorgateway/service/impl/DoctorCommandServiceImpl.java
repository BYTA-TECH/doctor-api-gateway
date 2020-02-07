package com.bytatech.ayoos.doctorgateway.service.impl;
import com.bytatech.ayoos.doctorgateway.service.DoctorCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.bytatech.ayoos.doctorgateway.client.doctor.api.*;
//import com.bytatech.ayoos.client.doctorgateway.doctor.domain.ReservedSlot;
//import com.bytatech.ayoos.client.doctorgateway.doctor.model.*;

//import com.bytatech.ayoos.web.rest.errors.BadRequestAlertException;
//import com.bytatech.ayoos.web.rest.util.HeaderUtil;



import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.http.ResponseEntity;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.*;

@Service

public class DoctorCommandServiceImpl  implements DoctorCommandService {
	
	@Autowired
	PaymentSettingsResourceApi paymentSettingsResourceApi;

	@Autowired
	DoctorSettingsResourceApi doctorSettingsResourceApi;

	  @Autowired
	    DoctorResourceApi doctorApi;
	  
	  @Autowired
	  QualificationResourceApi qualificationApi;
	  
	  @Autowired
	  ContactInfoResourceApi contactInfoResourceApi;
	  
	  @Autowired
	  SessionInfoResourceApi sessionInfoAPi;
	  
	  @Autowired
	  WorkPlaceResourceApi workPlaceResourceApi;
	  
	  @Autowired
	  SlotResourceApi slotResourceApi;
	
	 
	    public ResponseEntity<DoctorDTO> createDoctor(  DoctorDTO doctorDTO) throws URISyntaxException {
		 
		
		  ResponseEntity<DoctorDTO> doctorDto = doctorApi.createDoctorUsingPOST(doctorDTO); 
		    
		  return  doctorDto;
	  }
	  

	    public ResponseEntity<DoctorDTO> updateDoctor(  DoctorDTO doctorDTO)  {
		  return doctorApi.updateDoctorUsingPUT(doctorDTO);
	  }    
	  
	
	  public ResponseEntity<ContactInfoDTO> createContactInfo(  ContactInfoDTO contactInfoDTO){
		  
		  ResponseEntity<ContactInfoDTO> contactInfo =contactInfoResourceApi.createContactInfoUsingPOST(contactInfoDTO);
		  
		  return contactInfo;
	  }
	  
	
	  public ResponseEntity<ContactInfoDTO> updateContactInfo(  ContactInfoDTO contactInfoDTO){
		  return contactInfoResourceApi.updateContactInfoUsingPUT(contactInfoDTO);
	  }
	 
	
	  public void deleteContactInfo(Long id){
		  contactInfoResourceApi.deleteContactInfoUsingDELETE(id);
	  }
	  
	 
	  public ResponseEntity<QualificationDTO> createQualification(  QualificationDTO qualificationDTO){
		 return qualificationApi.createQualificationUsingPOST(qualificationDTO);
	  }
	  
	  public ResponseEntity<QualificationDTO> updateQualification(  QualificationDTO qualificationDTO){
		 return qualificationApi.updateQualificationUsingPUT(qualificationDTO);
	  }
	  
	 
	  public void deleteQualification(  Long id){
		  qualificationApi.deleteQualificationUsingDELETE(id);
	  }
	  
	
	  public ResponseEntity<WorkPlaceDTO> createWorkPlace(  WorkPlaceDTO workPlaceDTO){
		  ResponseEntity<WorkPlaceDTO> workPlace=  workPlaceResourceApi.createWorkPlaceUsingPOST(workPlaceDTO);
		
		  return workPlace;
	  }
	
	  public ResponseEntity<WorkPlaceDTO> updateWorkPlace(  WorkPlaceDTO workPlaceDTO){
		  
		  return workPlaceResourceApi.updateWorkPlaceUsingPUT(workPlaceDTO);
		  
	  }
	  
	
	  public void deleteWorkPlace(  Long id){
		  workPlaceResourceApi.deleteWorkPlaceUsingDELETE(id);
	  }
	  
	
	
	 //please wire this method instead of createSessionInfo
	
		 public ResponseEntity<List<SessionInfoDTO>> createSessionInfoByDates(SessionInfoDTO sessionInfoDTO,
					  String fromDate,  String toDate){
			 
			 return  sessionInfoAPi.setSessionByDatesUsingPOST(fromDate, toDate, sessionInfoDTO);
			 
			
		 }


	public ResponseEntity<PaymentSettingsDTO> createPaymentSetting(  PaymentSettingsDTO paymentSettingsDTO) {
		return paymentSettingsResourceApi.createPaymentSettingsUsingPOST(paymentSettingsDTO);
	}

	
	public ResponseEntity<PaymentSettingsDTO> updatePaymentSetting(  PaymentSettingsDTO paymentSettingsDTO) {
		return paymentSettingsResourceApi.updatePaymentSettingsUsingPUT(paymentSettingsDTO);
	}
	
	
	public ResponseEntity<DoctorSettingsDTO> createDoctorSetting(  DoctorSettingsDTO doctorSettingsDTO) {
		return doctorSettingsResourceApi.createDoctorSettingsUsingPOST(doctorSettingsDTO);
	}
	
	
	public ResponseEntity<DoctorSettingsDTO> updateDoctorSetting(  DoctorSettingsDTO doctorSettingsDTO) {
		return doctorSettingsResourceApi.updateDoctorSettingsUsingPUT(doctorSettingsDTO);
	}
	

}
