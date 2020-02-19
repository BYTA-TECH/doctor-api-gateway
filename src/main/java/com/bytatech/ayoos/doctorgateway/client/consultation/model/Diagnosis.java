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
 * Diagnosis
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-19T11:36:48.535+05:30[Asia/Calcutta]")

public class Diagnosis   {
  @JsonProperty("diagnosisRef")
  private String diagnosisRef = null;

  @JsonProperty("id")
  private Long id = null;

  public Diagnosis diagnosisRef(String diagnosisRef) {
    this.diagnosisRef = diagnosisRef;
    return this;
  }

  /**
   * Get diagnosisRef
   * @return diagnosisRef
  **/
  @ApiModelProperty(value = "")


  public String getDiagnosisRef() {
    return diagnosisRef;
  }

  public void setDiagnosisRef(String diagnosisRef) {
    this.diagnosisRef = diagnosisRef;
  }

  public Diagnosis id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Diagnosis diagnosis = (Diagnosis) o;
    return Objects.equals(this.diagnosisRef, diagnosis.diagnosisRef) &&
        Objects.equals(this.id, diagnosis.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnosisRef, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Diagnosis {\n");
    
    sb.append("    diagnosisRef: ").append(toIndentedString(diagnosisRef)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

