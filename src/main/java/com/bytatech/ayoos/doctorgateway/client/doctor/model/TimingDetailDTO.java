package com.bytatech.ayoos.doctorgateway.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TimingDetailDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-07T12:55:19.430+05:30[Asia/Colombo]")

public class TimingDetailDTO   {
  @JsonProperty("doctorIdpCode")
  private String doctorIdpCode = null;

  @JsonProperty("fromDate")
  private LocalDate fromDate = null;

  @JsonProperty("fromTime")
  private LocalTime fromTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("interval")
  private Long interval = null;

  @JsonProperty("toDate")
  private LocalDate toDate = null;

  @JsonProperty("toTime")
  private LocalTime toTime = null;

  @JsonProperty("weekday")
  private Long weekday = null;

  @JsonProperty("workPlaceId")
  private Long workPlaceId = null;

  public TimingDetailDTO doctorIdpCode(String doctorIdpCode) {
    this.doctorIdpCode = doctorIdpCode;
    return this;
  }

  /**
   * Get doctorIdpCode
   * @return doctorIdpCode
  **/
  @ApiModelProperty(value = "")


  public String getDoctorIdpCode() {
    return doctorIdpCode;
  }

  public void setDoctorIdpCode(String doctorIdpCode) {
    this.doctorIdpCode = doctorIdpCode;
  }

  public TimingDetailDTO fromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getFromDate() {
    return fromDate;
  }

  public void setFromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
  }

  public TimingDetailDTO fromTime(LocalTime fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * Get fromTime
   * @return fromTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalTime getFromTime() {
    return fromTime;
  }

  public void setFromTime(LocalTime fromTime) {
    this.fromTime = fromTime;
  }

  public TimingDetailDTO id(Long id) {
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

  public TimingDetailDTO interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(value = "")


  public Long getInterval() {
    return interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }

  public TimingDetailDTO toDate(LocalDate toDate) {
    this.toDate = toDate;
    return this;
  }

  /**
   * Get toDate
   * @return toDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }

  public TimingDetailDTO toTime(LocalTime toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * Get toTime
   * @return toTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalTime getToTime() {
    return toTime;
  }

  public void setToTime(LocalTime toTime) {
    this.toTime = toTime;
  }

  public TimingDetailDTO weekday(Long weekday) {
    this.weekday = weekday;
    return this;
  }

  /**
   * Get weekday
   * @return weekday
  **/
  @ApiModelProperty(value = "")


  public Long getWeekday() {
    return weekday;
  }

  public void setWeekday(Long weekday) {
    this.weekday = weekday;
  }

  public TimingDetailDTO workPlaceId(Long workPlaceId) {
    this.workPlaceId = workPlaceId;
    return this;
  }

  /**
   * Get workPlaceId
   * @return workPlaceId
  **/
  @ApiModelProperty(value = "")


  public Long getWorkPlaceId() {
    return workPlaceId;
  }

  public void setWorkPlaceId(Long workPlaceId) {
    this.workPlaceId = workPlaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimingDetailDTO timingDetailDTO = (TimingDetailDTO) o;
    return Objects.equals(this.doctorIdpCode, timingDetailDTO.doctorIdpCode) &&
        Objects.equals(this.fromDate, timingDetailDTO.fromDate) &&
        Objects.equals(this.fromTime, timingDetailDTO.fromTime) &&
        Objects.equals(this.id, timingDetailDTO.id) &&
        Objects.equals(this.interval, timingDetailDTO.interval) &&
        Objects.equals(this.toDate, timingDetailDTO.toDate) &&
        Objects.equals(this.toTime, timingDetailDTO.toTime) &&
        Objects.equals(this.weekday, timingDetailDTO.weekday) &&
        Objects.equals(this.workPlaceId, timingDetailDTO.workPlaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doctorIdpCode, fromDate, fromTime, id, interval, toDate, toTime, weekday, workPlaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimingDetailDTO {\n");
    
    sb.append("    doctorIdpCode: ").append(toIndentedString(doctorIdpCode)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
    sb.append("    weekday: ").append(toIndentedString(weekday)).append("\n");
    sb.append("    workPlaceId: ").append(toIndentedString(workPlaceId)).append("\n");
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

