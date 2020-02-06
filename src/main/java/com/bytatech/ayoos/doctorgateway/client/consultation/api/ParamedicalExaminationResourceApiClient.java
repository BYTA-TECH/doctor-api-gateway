package com.bytatech.ayoos.doctorgateway.client.consultation.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.doctorgateway.client.consultation.ClientConfiguration;

@FeignClient(name="${consultation.name:consultation}", url="${consultation.url:35.209.250.234:8090/}", configuration = ClientConfiguration.class)
public interface ParamedicalExaminationResourceApiClient extends ParamedicalExaminationResourceApi {
}