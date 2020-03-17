package com.bytatech.ayoos.doctorgateway.web.rest;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.DoctorDTO;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.DoctorSettingsDTO;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.PaymentSettingsDTO;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.Qualification;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.SessionInfo;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.UserRatingReview;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.WorkPlace;
import com.bytatech.ayoos.doctorgateway.service.DoctorQueryService;


@RestController
@RequestMapping("/api/query")
public class QueryResource {
	@Autowired
	DoctorQueryService doctorQueryService;
	
	@GetMapping("/test")
	public String test() {
		return "success";
	}
	
	@GetMapping("/doctor/{doctorIdpCode}")
	public ResponseEntity<DoctorDTO> findDoctorByDoctorIdpCode(@PathVariable String doctorIdpCode) {
		return ResponseEntity.ok(doctorQueryService.findDoctorByDoctorIdpCode(doctorIdpCode));

	}


	@GetMapping("/workPlaces/{doctorIdpCode}")
	public Page<WorkPlace> findWorkPlacesByDoctorIdpCode(@PathVariable String doctorIdpCode, Pageable pageable) {
	
		return doctorQueryService.findWorkPlacesByDoctorIdpCode(doctorIdpCode, pageable);
	}



	@GetMapping("/findAllUserRatingReview")
	public Page<UserRatingReview> findAllUserRatingReview(Pageable pageable) {
		return doctorQueryService.findAllUserRatingReview(pageable);
	}


	@GetMapping("/qualifications/{doctorIdpCode}")
	public ResponseEntity<List<Qualification>> findAllQualificationByDoctorIdpCode(@PathVariable String doctorIdpCode,
			Pageable pageable) {
	
		return ResponseEntity.ok(doctorQueryService.findAllQualificationByDoctorIdpCode(doctorIdpCode, pageable).getContent());
	}

	@GetMapping("/findAllSesionInfoByDoctorsWorkPlace/{doctorIdpCode}/{workPlaceId}")
	public ResponseEntity<Page<SessionInfo>> findAllSesionInfoByDoctorsWorkPlace(@PathVariable String doctorIdpCode,
			@PathVariable Long workPlaceId, Pageable pageable) {
		return ResponseEntity.ok()
				.body(doctorQueryService.findSessionInfoByDoctorsWorkPlace(doctorIdpCode, workPlaceId, pageable));
	}
	
//	@GetMapping("/findAllSesionInfoByWeekday/{doctorIdpCode}/{weekday}")
//	public ResponseEntity<Page<SessionInfo>> findAllSesionInfoByWeekday(@PathVariable String doctorIdpCode,
//			@PathVariable Long weekday, Pageable pageable) {
//		return ResponseEntity.ok()
//				.body(doctorQueryService.findSessionInfoByWeekday(doctorIdpCode, weekday, pageable));
//	}
	
	@GetMapping("/findAllSesionInfoByWeekday/{doctorIdpCode}/{weekday}/{workPlaceId}")
	public ResponseEntity<Page<SessionInfo>> findAllSesionInfoByWeekday(@PathVariable String doctorIdpCode,
			@PathVariable Long weekday, @PathVariable Long workPlaceId, Pageable pageable) {
		return ResponseEntity.ok()
				.body(doctorQueryService.findSessionInfoByWeekday(doctorIdpCode, weekday,workPlaceId, pageable));
	}

	@GetMapping("/doctorSettings/{doctorIdpCode}")
	public ResponseEntity<DoctorSettingsDTO> findDoctorSettings(@PathVariable String doctorIdpCode) {
		return  ResponseEntity.ok(doctorQueryService.findDoctorSettings(doctorIdpCode));
	}


	
	@GetMapping("/findPaymentSettingsByDoctorIdpCode/{doctorIdpCode}")
	public ResponseEntity<PaymentSettingsDTO> findPaymentSettingsByDoctorIdpCode(@PathVariable String doctorIdpCode)
	{
		return ResponseEntity.ok(doctorQueryService.findPaymentSettingsByDoctorIdpCode(doctorIdpCode));
	}
	
}
