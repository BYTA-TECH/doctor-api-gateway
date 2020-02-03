package com.bytatech.ayoos.doctorgateway.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.*;
/**
 * SlotDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-31T12:41:12.842+05:30[Asia/Kolkata]")

public class SlotDTO   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("doctorId")
  private Long doctorId = null;

 

  @JsonProperty("id")
  private Long id = null;

 
 
  @JsonProperty("fromTime")
  private Instant fromTime  = null;

  @JsonProperty("toTime")
  private Instant toTime  = null;

  public SlotDTO date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public SlotDTO doctorId(Long doctorId) {
    this.doctorId = doctorId;
    return this;
  }

  /**
   * Get doctorId
   * @return doctorId
  **/
  @ApiModelProperty(value = "")


  public Long getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(Long doctorId) {
    this.doctorId = doctorId;
  }

  public SlotDTO toTime(Instant toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * Get toTime
   * @return toTime
  **/
  @ApiModelProperty(value = "")


  public Instant getToTime() {
    return toTime;
  }

  public void setToTime(Instant toTime) {
    this.toTime = toTime;
  }

  public SlotDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SlotDTO fromTime(Instant fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * Get fromTime
   * @return fromTime
  **/
  @ApiModelProperty(value = "")


  public Instant getFromTime() {
    return fromTime;
  }

  public void setFromTime(Instant fromTime) {
    this.fromTime = fromTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlotDTO slotDTO = (SlotDTO) o;
    return Objects.equals(this.date, slotDTO.date) &&
        Objects.equals(this.doctorId, slotDTO.doctorId) &&
        Objects.equals(this.toTime, slotDTO.toTime) &&
        Objects.equals(this.id, slotDTO.id) &&
        Objects.equals(this.fromTime, slotDTO.fromTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, doctorId, toTime, id, fromTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlotDTO {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

