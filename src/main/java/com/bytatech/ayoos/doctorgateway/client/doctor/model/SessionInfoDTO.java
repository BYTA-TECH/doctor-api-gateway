package com.bytatech.ayoos.doctorgateway.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SessionInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-07T12:55:19.430+05:30[Asia/Colombo]")

public class SessionInfoDTO   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("doctorIdpCode")
  private String doctorIdpCode = null;

  @JsonProperty("fromTime")
  private Instant fromTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("interval")
  private Long interval = null;

  @JsonProperty("sessionName")
  private String sessionName = null;

  /**
   * Gets or Sets sessionStatus
   */
  public enum SessionStatusEnum {
    AVAILABLE("AVAILABLE"),
    
    PENDING("PENDING"),
    
    RESERVED("RESERVED"),
    
    CANCELLED("CANCELLED");

    private String value;

    SessionStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SessionStatusEnum fromValue(String text) {
      for (SessionStatusEnum b : SessionStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sessionStatus")
  private SessionStatusEnum sessionStatus = null;

  @JsonProperty("statusId")
  private Long statusId = null;

  @JsonProperty("toTime")
  private Instant toTime = null;

  @JsonProperty("weekDay")
  private Long weekDay = null;

  @JsonProperty("workPlaceId")
  private Long workPlaceId = null;

  public SessionInfoDTO date(LocalDate date) {
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

  public SessionInfoDTO doctorIdpCode(String doctorIdpCode) {
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

  public SessionInfoDTO fromTime(Instant fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * Get fromTime
   * @return fromTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getFromTime() {
    return fromTime;
  }

  public void setFromTime(Instant fromTime) {
    this.fromTime = fromTime;
  }

  public SessionInfoDTO id(Long id) {
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

  public SessionInfoDTO interval(Long interval) {
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

  public SessionInfoDTO sessionName(String sessionName) {
    this.sessionName = sessionName;
    return this;
  }

  /**
   * Get sessionName
   * @return sessionName
  **/
  @ApiModelProperty(value = "")


  public String getSessionName() {
    return sessionName;
  }

  public void setSessionName(String sessionName) {
    this.sessionName = sessionName;
  }

  public SessionInfoDTO sessionStatus(SessionStatusEnum sessionStatus) {
    this.sessionStatus = sessionStatus;
    return this;
  }

  /**
   * Get sessionStatus
   * @return sessionStatus
  **/
  @ApiModelProperty(value = "")


  public SessionStatusEnum getSessionStatus() {
    return sessionStatus;
  }

  public void setSessionStatus(SessionStatusEnum sessionStatus) {
    this.sessionStatus = sessionStatus;
  }

  public SessionInfoDTO statusId(Long statusId) {
    this.statusId = statusId;
    return this;
  }

  /**
   * Get statusId
   * @return statusId
  **/
  @ApiModelProperty(value = "")


  public Long getStatusId() {
    return statusId;
  }

  public void setStatusId(Long statusId) {
    this.statusId = statusId;
  }

  public SessionInfoDTO toTime(Instant toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * Get toTime
   * @return toTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getToTime() {
    return toTime;
  }

  public void setToTime(Instant toTime) {
    this.toTime = toTime;
  }

  public SessionInfoDTO weekDay(Long weekDay) {
    this.weekDay = weekDay;
    return this;
  }

  /**
   * Get weekDay
   * @return weekDay
  **/
  @ApiModelProperty(value = "")


  public Long getWeekDay() {
    return weekDay;
  }

  public void setWeekDay(Long weekDay) {
    this.weekDay = weekDay;
  }

  public SessionInfoDTO workPlaceId(Long workPlaceId) {
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
    SessionInfoDTO sessionInfoDTO = (SessionInfoDTO) o;
    return Objects.equals(this.date, sessionInfoDTO.date) &&
        Objects.equals(this.doctorIdpCode, sessionInfoDTO.doctorIdpCode) &&
        Objects.equals(this.fromTime, sessionInfoDTO.fromTime) &&
        Objects.equals(this.id, sessionInfoDTO.id) &&
        Objects.equals(this.interval, sessionInfoDTO.interval) &&
        Objects.equals(this.sessionName, sessionInfoDTO.sessionName) &&
        Objects.equals(this.sessionStatus, sessionInfoDTO.sessionStatus) &&
        Objects.equals(this.statusId, sessionInfoDTO.statusId) &&
        Objects.equals(this.toTime, sessionInfoDTO.toTime) &&
        Objects.equals(this.weekDay, sessionInfoDTO.weekDay) &&
        Objects.equals(this.workPlaceId, sessionInfoDTO.workPlaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, doctorIdpCode, fromTime, id, interval, sessionName, sessionStatus, statusId, toTime, weekDay, workPlaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionInfoDTO {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    doctorIdpCode: ").append(toIndentedString(doctorIdpCode)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
    sb.append("    sessionStatus: ").append(toIndentedString(sessionStatus)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
    sb.append("    weekDay: ").append(toIndentedString(weekDay)).append("\n");
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

