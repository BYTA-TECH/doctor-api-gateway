package com.bytatech.ayoos.doctorgateway.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.*;
import java.time.LocalDate;
import java.util.*;
public interface DoctorQueryService{
	public DoctorDTO findDoctorByDoctorIdpCode(String doctorIdpCode);
 public Page<UserRatingReview> findAllUserRatingReview(Pageable pageable);
 public ContactInfo findContactInfoById(String contactInfoById);
	public Page<WorkPlace> findWorkPlacesByDoctorIdpCode(String doctorIdpCode, Pageable pageable);
	public Page<Qualification> findAllQualificationByDoctorIdpCode(String doctorIdpCode, Pageable pageable);
	//public Page<Slot> findAllReservedSlotByDoctorIdpCode(String doctorIdpCode, Pageable pageable) ;	
	public Page<SessionInfo> findSessionInfoByDoctorsWorkPlace(String doctorIdpCode, Long workPlaceId, Pageable pageable);
	public DoctorSettingsDTO findDoctorSettings(String doctorIdpCode); 
	//public PaymentSettingsDTO findPaymentSettings(Long id);
	public Set<Slot> createSlot(Long workPlaceId,LocalDate date,String doctorIdpCode,Pageable pageable);
	public PaymentSettingsDTO findPaymentSettingsByDoctorIdpCode(String doctorIdpCode);
	
}
