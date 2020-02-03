package com.bytatech.ayoos.doctorgateway.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.*;
/**
 * SessionInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-03T12:20:38.958+05:30[Asia/Kolkata]")

public class SessionInfoDTO   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("fromTime")
  private OffsetDateTime fromTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("interval")
  private Long interval = null;

  @JsonProperty("sessionName")
  private String sessionName = null;

  @JsonProperty("toTime")
  private OffsetDateTime toTime = null;

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

  public SessionInfoDTO fromTime(OffsetDateTime fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * Get fromTime
   * @return fromTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getFromTime() {
    return fromTime;
  }

  public void setFromTime(OffsetDateTime fromTime) {
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

  public SessionInfoDTO toTime(OffsetDateTime toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * Get toTime
   * @return toTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getToTime() {
    return toTime;
  }

  public void setToTime(OffsetDateTime toTime) {
    this.toTime = toTime;
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
        Objects.equals(this.fromTime, sessionInfoDTO.fromTime) &&
        Objects.equals(this.id, sessionInfoDTO.id) &&
        Objects.equals(this.interval, sessionInfoDTO.interval) &&
        Objects.equals(this.sessionName, sessionInfoDTO.sessionName) &&
        Objects.equals(this.toTime, sessionInfoDTO.toTime) &&
        Objects.equals(this.workPlaceId, sessionInfoDTO.workPlaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, fromTime, id, interval, sessionName, toTime, workPlaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionInfoDTO {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
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

