package undefined.client.doctor.model;

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

/**
 * SlotDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-18T14:33:18.015+05:30[Asia/Calcutta]")

public class SlotDTO   {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("doctorId")
  private Long doctorId = null;

  @JsonProperty("fromTime")
  private OffsetDateTime fromTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("toTime")
  private OffsetDateTime toTime = null;

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

  public SlotDTO fromTime(OffsetDateTime fromTime) {
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

  public SlotDTO toTime(OffsetDateTime toTime) {
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
        Objects.equals(this.fromTime, slotDTO.fromTime) &&
        Objects.equals(this.id, slotDTO.id) &&
        Objects.equals(this.toTime, slotDTO.toTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, doctorId, fromTime, id, toTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlotDTO {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
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

