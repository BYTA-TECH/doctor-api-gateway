package com.bytatech.ayoos.doctorgateway.client.consultation.model;

import java.util.Objects;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.Consultation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Symptom
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-06T14:02:08.034+05:30[Asia/Kolkata]")

public class Symptom   {
  @JsonProperty("consultation")
  private Consultation consultation = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("symptomRef")
  private String symptomRef = null;

  public Symptom consultation(Consultation consultation) {
    this.consultation = consultation;
    return this;
  }

  /**
   * Get consultation
   * @return consultation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Consultation getConsultation() {
    return consultation;
  }

  public void setConsultation(Consultation consultation) {
    this.consultation = consultation;
  }

  public Symptom id(Long id) {
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

  public Symptom symptomRef(String symptomRef) {
    this.symptomRef = symptomRef;
    return this;
  }

  /**
   * Get symptomRef
   * @return symptomRef
  **/
  @ApiModelProperty(value = "")


  public String getSymptomRef() {
    return symptomRef;
  }

  public void setSymptomRef(String symptomRef) {
    this.symptomRef = symptomRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Symptom symptom = (Symptom) o;
    return Objects.equals(this.consultation, symptom.consultation) &&
        Objects.equals(this.id, symptom.id) &&
        Objects.equals(this.symptomRef, symptom.symptomRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultation, id, symptomRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Symptom {\n");
    
    sb.append("    consultation: ").append(toIndentedString(consultation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symptomRef: ").append(toIndentedString(symptomRef)).append("\n");
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

