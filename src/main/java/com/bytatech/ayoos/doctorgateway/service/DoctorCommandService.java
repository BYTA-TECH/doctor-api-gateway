package com.bytatech.ayoos.doctorgateway.service;

import java.net.URISyntaxException; 
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.ContactInfoDTO;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.DoctorDTO; 
import com.bytatech.ayoos.doctorgateway.client.doctor.model.DoctorSettingsDTO;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.PaymentSettingsDTO;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.QualificationDTO;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.SessionInfoDTO;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.TimingDetailDTO;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.WorkPlaceDTO;

public interface DoctorCommandService {
	public ResponseEntity<DoctorDTO> createDoctor(DoctorDTO doctorDTO) throws URISyntaxException;

	public ResponseEntity<DoctorDTO> updateDoctor(DoctorDTO doctorDTO);

	public ResponseEntity<ContactInfoDTO> createContactInfo(ContactInfoDTO contactInfoDTO);

	public ResponseEntity<ContactInfoDTO> updateContactInfo(ContactInfoDTO contactInfoDTO);

	public void deleteContactInfo(Long id);

	public ResponseEntity<QualificationDTO> createQualification(QualificationDTO qualificationDTO);

	public ResponseEntity<QualificationDTO> updateQualification(QualificationDTO qualificationDTO);

	public void deleteQualification(Long id);

	public ResponseEntity<WorkPlaceDTO> createWorkPlace(WorkPlaceDTO workPlaceDTO);

	public ResponseEntity<WorkPlaceDTO> updateWorkPlace(WorkPlaceDTO workPlaceDTO);

	public void deleteWorkPlace(Long id);

	public ResponseEntity<List<SessionInfoDTO>>  createSessionInfoByDates(List<TimingDetailDTO> timingDetailDTO);

	public ResponseEntity<PaymentSettingsDTO> createPaymentSetting(PaymentSettingsDTO paymentSettingsDTO);

	public ResponseEntity<PaymentSettingsDTO> updatePaymentSetting(PaymentSettingsDTO paymentSettingsDTO);

	public ResponseEntity<DoctorSettingsDTO> createDoctorSetting(DoctorSettingsDTO doctorSettingsDTO);

	public ResponseEntity<DoctorSettingsDTO> updateDoctorSetting(DoctorSettingsDTO doctorSettingsDTO);

}
