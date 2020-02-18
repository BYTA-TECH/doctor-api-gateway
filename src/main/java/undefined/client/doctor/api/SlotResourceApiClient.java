package undefined.client.doctor.api;

import org.springframework.cloud.openfeign.FeignClient;
import undefined.client.doctor.ClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url:35.209.250.234:8083/}", configuration = ClientConfiguration.class)
public interface SlotResourceApiClient extends SlotResourceApi {
}