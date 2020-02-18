package undefined.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DoctorSessionInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-18T14:33:18.015+05:30[Asia/Calcutta]")

public class DoctorSessionInfoDTO   {
  @JsonProperty("fromDate")
  private LocalDate fromDate = null;

  @JsonProperty("fromTime")
  private org.joda.time.* fromTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("interval")
  private Long interval = null;

  @JsonProperty("toDate")
  private LocalDate toDate = null;

  @JsonProperty("toTime")
  private org.joda.time.* toTime = null;

  @JsonProperty("weekday")
  private Long weekday = null;

  public DoctorSessionInfoDTO fromDate(LocalDate fromDate) {
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

  public DoctorSessionInfoDTO fromTime(org.joda.time.* fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * Get fromTime
   * @return fromTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public org.joda.time.* getFromTime() {
    return fromTime;
  }

  public void setFromTime(org.joda.time.* fromTime) {
    this.fromTime = fromTime;
  }

  public DoctorSessionInfoDTO id(Long id) {
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

  public DoctorSessionInfoDTO interval(Long interval) {
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

  public DoctorSessionInfoDTO toDate(LocalDate toDate) {
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

  public DoctorSessionInfoDTO toTime(org.joda.time.* toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * Get toTime
   * @return toTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public org.joda.time.* getToTime() {
    return toTime;
  }

  public void setToTime(org.joda.time.* toTime) {
    this.toTime = toTime;
  }

  public DoctorSessionInfoDTO weekday(Long weekday) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoctorSessionInfoDTO doctorSessionInfoDTO = (DoctorSessionInfoDTO) o;
    return Objects.equals(this.fromDate, doctorSessionInfoDTO.fromDate) &&
        Objects.equals(this.fromTime, doctorSessionInfoDTO.fromTime) &&
        Objects.equals(this.id, doctorSessionInfoDTO.id) &&
        Objects.equals(this.interval, doctorSessionInfoDTO.interval) &&
        Objects.equals(this.toDate, doctorSessionInfoDTO.toDate) &&
        Objects.equals(this.toTime, doctorSessionInfoDTO.toTime) &&
        Objects.equals(this.weekday, doctorSessionInfoDTO.weekday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDate, fromTime, id, interval, toDate, toTime, weekday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoctorSessionInfoDTO {\n");
    
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
    sb.append("    weekday: ").append(toIndentedString(weekday)).append("\n");
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

