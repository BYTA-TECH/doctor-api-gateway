package undefined.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatusDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-18T14:33:18.015+05:30[Asia/Calcutta]")

public class StatusDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("slotId")
  private Long slotId = null;

  @JsonProperty("status")
  private String status = null;

  public StatusDTO id(Long id) {
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

  public StatusDTO slotId(Long slotId) {
    this.slotId = slotId;
    return this;
  }

  /**
   * Get slotId
   * @return slotId
  **/
  @ApiModelProperty(value = "")


  public Long getSlotId() {
    return slotId;
  }

  public void setSlotId(Long slotId) {
    this.slotId = slotId;
  }

  public StatusDTO status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDTO statusDTO = (StatusDTO) o;
    return Objects.equals(this.id, statusDTO.id) &&
        Objects.equals(this.slotId, statusDTO.slotId) &&
        Objects.equals(this.status, statusDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slotId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slotId: ").append(toIndentedString(slotId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

