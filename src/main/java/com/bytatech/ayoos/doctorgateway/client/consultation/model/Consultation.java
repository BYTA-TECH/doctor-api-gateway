package com.bytatech.ayoos.doctorgateway.client.consultation.model;

import java.util.Objects;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.BasicCheckUp;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.Diagnosis;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.Prescription;
import com.bytatech.ayoos.doctorgateway.client.consultation.model.Symptom;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Consultation
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-06T14:02:08.034+05:30[Asia/Kolkata]")

public class Consultation   {
  @JsonProperty("basicCheckUp")
  private BasicCheckUp basicCheckUp = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("diagnosis")
  private Diagnosis diagnosis = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("patientIdpCode")
  private String patientIdpCode = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("prescription")
  private Prescription prescription = null;

  @JsonProperty("symptoms")
  @Valid
  private List<Symptom> symptoms = null;

  @JsonProperty("trackingId")
  private String trackingId = null;

  public Consultation basicCheckUp(BasicCheckUp basicCheckUp) {
    this.basicCheckUp = basicCheckUp;
    return this;
  }

  /**
   * Get basicCheckUp
   * @return basicCheckUp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasicCheckUp getBasicCheckUp() {
    return basicCheckUp;
  }

  public void setBasicCheckUp(BasicCheckUp basicCheckUp) {
    this.basicCheckUp = basicCheckUp;
  }

  public Consultation date(LocalDate date) {
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

  public Consultation diagnosis(Diagnosis diagnosis) {
    this.diagnosis = diagnosis;
    return this;
  }

  /**
   * Get diagnosis
   * @return diagnosis
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Diagnosis getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(Diagnosis diagnosis) {
    this.diagnosis = diagnosis;
  }

  public Consultation id(Long id) {
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

  public Consultation patientIdpCode(String patientIdpCode) {
    this.patientIdpCode = patientIdpCode;
    return this;
  }

  /**
   * Get patientIdpCode
   * @return patientIdpCode
  **/
  @ApiModelProperty(value = "")


  public String getPatientIdpCode() {
    return patientIdpCode;
  }

  public void setPatientIdpCode(String patientIdpCode) {
    this.patientIdpCode = patientIdpCode;
  }

  public Consultation phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Consultation prescription(Prescription prescription) {
    this.prescription = prescription;
    return this;
  }

  /**
   * Get prescription
   * @return prescription
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Prescription getPrescription() {
    return prescription;
  }

  public void setPrescription(Prescription prescription) {
    this.prescription = prescription;
  }

  public Consultation symptoms(List<Symptom> symptoms) {
    this.symptoms = symptoms;
    return this;
  }

  public Consultation addSymptomsItem(Symptom symptomsItem) {
    if (this.symptoms == null) {
      this.symptoms = new ArrayList<Symptom>();
    }
    this.symptoms.add(symptomsItem);
    return this;
  }

  /**
   * Get symptoms
   * @return symptoms
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Symptom> getSymptoms() {
    return symptoms;
  }

  public void setSymptoms(List<Symptom> symptoms) {
    this.symptoms = symptoms;
  }

  public Consultation trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  /**
   * Get trackingId
   * @return trackingId
  **/
  @ApiModelProperty(value = "")


  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consultation consultation = (Consultation) o;
    return Objects.equals(this.basicCheckUp, consultation.basicCheckUp) &&
        Objects.equals(this.date, consultation.date) &&
        Objects.equals(this.diagnosis, consultation.diagnosis) &&
        Objects.equals(this.id, consultation.id) &&
        Objects.equals(this.patientIdpCode, consultation.patientIdpCode) &&
        Objects.equals(this.phoneNumber, consultation.phoneNumber) &&
        Objects.equals(this.prescription, consultation.prescription) &&
        Objects.equals(this.symptoms, consultation.symptoms) &&
        Objects.equals(this.trackingId, consultation.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicCheckUp, date, diagnosis, id, patientIdpCode, phoneNumber, prescription, symptoms, trackingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consultation {\n");
    
    sb.append("    basicCheckUp: ").append(toIndentedString(basicCheckUp)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    diagnosis: ").append(toIndentedString(diagnosis)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientIdpCode: ").append(toIndentedString(patientIdpCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    prescription: ").append(toIndentedString(prescription)).append("\n");
    sb.append("    symptoms: ").append(toIndentedString(symptoms)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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

