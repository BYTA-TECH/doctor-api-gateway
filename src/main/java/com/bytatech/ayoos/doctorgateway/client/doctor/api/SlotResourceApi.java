/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.doctorgateway.client.doctor.api;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.SlotDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-18T15:52:38.246+05:30[Asia/Calcutta]")

@Api(value = "SlotResource", description = "the SlotResource API")
public interface SlotResourceApi {

    @ApiOperation(value = "createSlot", nickname = "createSlotUsingPOST", notes = "", response = SlotDTO.class, tags={ "slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SlotDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/slots",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<SlotDTO> createSlotUsingPOST(@ApiParam(value = "slotDTO" ,required=true )  @Valid @RequestBody SlotDTO slotDTO);


    @ApiOperation(value = "deleteSlot", nickname = "deleteSlotUsingDELETE", notes = "", tags={ "slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/slots/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSlotUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllSlots", nickname = "getAllSlotsUsingGET", notes = "", response = SlotDTO.class, responseContainer = "List", tags={ "slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SlotDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/slots",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<SlotDTO>> getAllSlotsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getSlot", nickname = "getSlotUsingGET", notes = "", response = SlotDTO.class, tags={ "slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SlotDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/slots/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<SlotDTO> getSlotUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "updateSlot", nickname = "updateSlotUsingPUT", notes = "", response = SlotDTO.class, tags={ "slot-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SlotDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/slots",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<SlotDTO> updateSlotUsingPUT(@ApiParam(value = "slotDTO" ,required=true )  @Valid @RequestBody SlotDTO slotDTO);

}
