package com.bytatech.ayoos.doctorgateway.client.consultation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NextTaskResource
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-19T14:36:23.395+05:30[Asia/Calcutta]")

public class NextTaskResource   {
  @JsonProperty("nextTaskId")
  private String nextTaskId = null;

  @JsonProperty("nextTaskName")
  private String nextTaskName = null;

  @JsonProperty("processId")
  private String processId = null;

  public NextTaskResource nextTaskId(String nextTaskId) {
    this.nextTaskId = nextTaskId;
    return this;
  }

  /**
   * Get nextTaskId
   * @return nextTaskId
  **/
  @ApiModelProperty(value = "")


  public String getNextTaskId() {
    return nextTaskId;
  }

  public void setNextTaskId(String nextTaskId) {
    this.nextTaskId = nextTaskId;
  }

  public NextTaskResource nextTaskName(String nextTaskName) {
    this.nextTaskName = nextTaskName;
    return this;
  }

  /**
   * Get nextTaskName
   * @return nextTaskName
  **/
  @ApiModelProperty(value = "")


  public String getNextTaskName() {
    return nextTaskName;
  }

  public void setNextTaskName(String nextTaskName) {
    this.nextTaskName = nextTaskName;
  }

  public NextTaskResource processId(String processId) {
    this.processId = processId;
    return this;
  }

  /**
   * Get processId
   * @return processId
  **/
  @ApiModelProperty(value = "")


  public String getProcessId() {
    return processId;
  }

  public void setProcessId(String processId) {
    this.processId = processId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextTaskResource nextTaskResource = (NextTaskResource) o;
    return Objects.equals(this.nextTaskId, nextTaskResource.nextTaskId) &&
        Objects.equals(this.nextTaskName, nextTaskResource.nextTaskName) &&
        Objects.equals(this.processId, nextTaskResource.processId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextTaskId, nextTaskName, processId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextTaskResource {\n");
    
    sb.append("    nextTaskId: ").append(toIndentedString(nextTaskId)).append("\n");
    sb.append("    nextTaskName: ").append(toIndentedString(nextTaskName)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
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

