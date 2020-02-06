/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.doctorgateway.client.consultation.api;

import com.bytatech.ayoos.doctorgateway.client.consultation.model.PublishResult;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.SseEmitter;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-06T14:02:08.034+05:30[Asia/Kolkata]")

@Api(value = "ConsultationKafkaResource", description = "the ConsultationKafkaResource API")
public interface ConsultationKafkaResourceApi {

    @ApiOperation(value = "consume", nickname = "consumeUsingGET", notes = "", response = SseEmitter.class, tags={ "consultation-kafka-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SseEmitter.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/consultation-kafka/consume",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<SseEmitter> consumeUsingGET(@NotNull @ApiParam(value = "consumerParams", required = true) @Valid @RequestParam(value = "consumerParams", required = true) Object consumerParams,@NotNull @ApiParam(value = "topic", required = true) @Valid @RequestParam(value = "topic", required = true) List<String> topic);


    @ApiOperation(value = "publish", nickname = "publishUsingPOST", notes = "", response = PublishResult.class, tags={ "consultation-kafka-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PublishResult.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/consultation-kafka/publish/{topic}",
        produces = "*/*", 
        method = RequestMethod.POST)
    ResponseEntity<PublishResult> publishUsingPOST(@NotNull @ApiParam(value = "message", required = true) @Valid @RequestParam(value = "message", required = true) String message,@ApiParam(value = "topic",required=true) @PathVariable("topic") String topic,@ApiParam(value = "key") @Valid @RequestParam(value = "key", required = false) String key);

}
