package com.bytatech.ayoos.doctorgateway.service.impl;

import com.bytatech.ayoos.doctorgateway.config.ServiceUtility;
import com.bytatech.ayoos.doctorgateway.service.DoctorCommandService;
import com.bytatech.ayoos.doctorgateway.service.DoctorQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.elasticsearch.search.suggest.completion.CompletionSuggestion;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.time.*;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.core.CountRequest;
import org.elasticsearch.client.core.CountResponse;
import org.elasticsearch.common.unit.DistanceUnit;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.elasticsearch.search.suggest.term.*;
import org.elasticsearch.search.suggest.*;
import org.elasticsearch.search.suggest.phrase.*;
import org.elasticsearch.search.suggest.SuggestBuilder;
import org.springframework.stereotype.Service;
import com.bytatech.ayoos.doctorgateway.client.doctor.model.*;
import com.bytatech.ayoos.doctorgateway.service.mapper.*;
@Service
public class DoctorQueryServiceImpl implements DoctorQueryService {
	@Autowired
	ServiceUtility serviceUtility;
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	RestHighLevelClient restHighLevelClient;
	@Autowired
	DoctorMapper doctorMapper;
	
	@Autowired
	DoctorSettingsMapper doctorSettingsMapper;
	
	@Autowired
	PaymentSettingsMapper paymentSettingsMapper;
	private final Logger log = LoggerFactory.getLogger(DoctorQueryServiceImpl.class);

	@Override
	public DoctorDTO findDoctorByDoctorIdpCode(String doctorIdpCode) {
		QueryBuilder dslQuery = QueryBuilders.boolQuery().filter(termQuery("doctorIdpCode.keyword", doctorIdpCode));
		SearchSourceBuilder builder = new SearchSourceBuilder();

		String[] include = new String[] { "doctorIdpCode", "specialization", "registerNumber", "practiceSince",
				"firstName", "contactInfo.*", "doctorSettings.*", "paymentSettings.*" };
		String[] exclude = new String[] { "workPlaces.*", "qualifications.*" };

		builder.fetchSource(include, exclude);

		builder.query(dslQuery);

		SearchRequest searchRequest = new SearchRequest("doctor");

		searchRequest.source(builder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		Doctor doctor= serviceUtility.getObjectResult(searchResponse, new Doctor());
		return doctorMapper.toDto(doctor);
	}

	@Override
	public Page<UserRatingReview> findAllUserRatingReview(Pageable pageable) {
		QueryBuilder dslQuery = matchAllQuery();
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(dslQuery);
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("userreatingreview", searchSourceBuilder,
				pageable);

		Page<UserRatingReview> userRatingReviewPage = serviceUtility.getPageResult(searchResponse, pageable,
				new UserRatingReview());

		log.debug("output", userRatingReviewPage);

		return userRatingReviewPage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bytatech.ayoos.service.QueryService#findContactInfo(java.lang.String,
	 * org.springframework.data.domain.Pageable)
	 */

	@Override
	public ContactInfo findContactInfoById(String contactInfoById) {
		QueryBuilder dslQuery = QueryBuilders.boolQuery().filter(termQuery("id", contactInfoById));

		SearchResponse searchResponse = serviceUtility.searchResponseForObject("contactinfo", dslQuery);

		return serviceUtility.getObjectResult(searchResponse, new ContactInfo());
	}

	@Override
	public Page<WorkPlace> findWorkPlacesByDoctorIdpCode(String doctorIdpCode, Pageable pageable) {
		// Add this in query
		/*
		 * String[] include = new String[] { "id", "location", "name", "locationName",
		 * "doctor.*" };
		 * 
		 * String[] exclude = new String[] {};
		 * 
		 * builder.fetchSource(include, exclude);
		 */

		QueryBuilder dslQuery = QueryBuilders.boolQuery().filter(termQuery("doctor.doctorIdpCode", doctorIdpCode));
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(dslQuery);
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("workplace", searchSourceBuilder,
				pageable);

		Page<WorkPlace> workPlacePage = serviceUtility.getPageResult(searchResponse, pageable, new WorkPlace());

		log.debug("output", workPlacePage);

		return workPlacePage;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bytatech.ayoos.service.QueryService#findAllQualification(org.
	 * springframework.data.domain.Pageable)
	 */

	@Override
	public Page<Qualification> findAllQualificationByDoctorIdpCode(String doctorIdpCode, Pageable pageable) {
		QueryBuilder dslQuery = QueryBuilders.boolQuery().filter(termQuery("doctor.doctorIdpCode", doctorIdpCode));
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(dslQuery);
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("qualification", searchSourceBuilder,
				pageable);

		Page<Qualification> qualificationPage = serviceUtility.getPageResult(searchResponse, pageable,
				new Qualification());

		log.debug("output", qualificationPage);

		return qualificationPage;

	}

	/*@Override
	public Page<Slot> findAllReservedSlotByDoctorIdpCode(String doctorIdpCode, Pageable pageable) {

		QueryBuilder dslQuery = QueryBuilders.boolQuery().filter(termQuery("doctor.doctorIdpCode", doctorIdpCode));
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(dslQuery);
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("slot", searchSourceBuilder, pageable);

		Page<Slot> slotPage = serviceUtility.getPageResult(searchResponse, pageable, new Slot());

		log.debug("output", slotPage);

		return slotPage;

	}*/

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bytatech.ayoos.service.QueryService#findSessionInfoByDoctorsWorkPlace
	 * (java.lang.String, java.lang.Long, org.springframework.data.domain.Pageable)
	 */

	@Override
	public Page<SessionInfo> findSessionInfoByDoctorsWorkPlace(String doctorIdpCode, Long workPlaceId,
			Pageable pageable) {

		QueryBuilder dslQuery = QueryBuilders.boolQuery()
				.must(QueryBuilders.termQuery("workPlace.doctor.doctorIdpCode.keyword", doctorIdpCode))
				.must(QueryBuilders.termQuery("workPlace.id", workPlaceId));
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(dslQuery);
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("sessioninfo", searchSourceBuilder,
				pageable);

		Page<SessionInfo> sessionInfoPage = serviceUtility.getPageResult(searchResponse, pageable, new SessionInfo());

		log.debug("output", sessionInfoPage);

		return sessionInfoPage;

	}
	public DoctorSettingsDTO findDoctorSettings(Long id){
		QueryBuilder dslQuery = QueryBuilders.boolQuery().filter(termQuery("id",id));

		SearchResponse searchResponse = serviceUtility.searchResponseForObject("contactinfo", dslQuery);

		DoctorSettings doctorSettings=serviceUtility.getObjectResult(searchResponse, new DoctorSettings());
	return	doctorSettingsMapper.toDto(doctorSettings);
	}
	
	public PaymentSettingsDTO findPaymentSettings(Long id) {
		QueryBuilder dslQuery = QueryBuilders.boolQuery().filter(termQuery("id",id));

		SearchResponse searchResponse = serviceUtility.searchResponseForObject("paymentsettings", dslQuery);

		PaymentSettings paymentSettings=serviceUtility.getObjectResult(searchResponse, new PaymentSettings());
	return	paymentSettingsMapper.toDto(paymentSettings);
	}
public	Set<Slot> createSlot(Long workPlaceId,LocalDate date, String doctorIdpCode,Pageable pageable){
	List<SessionInfo> sessioninfoList=findSessionInfoByDoctorsWorkPlaceAndDate(date,doctorIdpCode,workPlaceId);
	List<Slot> slotList = findSlotbyStatus(date,doctorIdpCode,"booked");
	
	Set<Slot> slotSet = new HashSet<>(slotList); 
	for(SessionInfo s:sessioninfoList) {
		
		OffsetDateTime slotEndTime = null;
		int i = 1;
		do {
	
			
			Slot slot = new Slot();
			slot.setDate(date);
			slot.setFromTime(s.getFromTime());
			slot.setToTime(s.getFromTime().plusSeconds(s.getInterval()+i));
			slotEndTime =slot.getToTime();
			slotSet.add(slot);
			i++;
			
		}
		while(slotEndTime==s.getToTime());
	}
	
	
	return slotSet;
		
	}

private List<SessionInfo> findSessionInfoByDoctorsWorkPlaceAndDate(LocalDate date,String doctorIdpCode, Long workPlaceId) {
    
	QueryBuilder dslQuery = QueryBuilders.boolQuery()
			.must(QueryBuilders.termQuery("workPlace.doctor.doctorIdpCode.keyword", doctorIdpCode))
			.must(QueryBuilders.termQuery("workPlace.id", workPlaceId))
			.must(QueryBuilders.termQuery("date",date.toString()));
	SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
	searchSourceBuilder.query(dslQuery);
	  SearchRequest searchRequest = new SearchRequest("sessioninfo");
	  searchRequest.source(searchSourceBuilder);
	  SearchResponse searchResponse = null;
	  
	  try { searchResponse = restHighLevelClient.search(searchRequest,
	  RequestOptions.DEFAULT); }
	  catch (IOException e) { // TODO Auto-generated
	  e.printStackTrace(); }
	  SearchHit[] searchHit =searchResponse.getHits().getHits();
	  
	  
	  List<SessionInfo> sessioninfoList = new ArrayList<>();
	  
	  for (SearchHit hit : searchHit) {

		  sessioninfoList.add(objectMapper.convertValue(hit.getSourceAsMap(), SessionInfo.class));
	  }
	  return sessioninfoList;
	 
}	
	
private List<Slot>  findSlotbyStatus(LocalDate date,String doctorIdpCode,String status){
	
	QueryBuilder dslQuery = QueryBuilders.boolQuery()
			.must(QueryBuilders.termQuery("slot.doctor.doctorIdpCode.keyword", doctorIdpCode))
			.must(QueryBuilders.termQuery("status",status))
			.must(QueryBuilders.termQuery("date",date.toString()));
	
	
	SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
	searchSourceBuilder.query(dslQuery);
	  SearchRequest searchRequest = new SearchRequest("status");
	  searchRequest.source(searchSourceBuilder);
	  SearchResponse searchResponse = null;
	  
	  try { searchResponse = restHighLevelClient.search(searchRequest,
	  RequestOptions.DEFAULT); }
	  catch (IOException e) { // TODO Auto-generated
	  e.printStackTrace(); }
	  SearchHit[] searchHit =searchResponse.getHits().getHits();
	  
	  
	  List<Status> sessioninfoList = new ArrayList<>();
	  
	  for (SearchHit hit : searchHit) {

		  sessioninfoList.add(objectMapper.convertValue(hit.getSourceAsMap(), Status.class));
	  }
	  
	 
	
	return null;
	
}







}
	
	
	
	
	

