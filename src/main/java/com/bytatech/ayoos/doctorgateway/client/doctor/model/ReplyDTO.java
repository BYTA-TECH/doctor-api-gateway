package com.bytatech.ayoos.doctorgateway.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReplyDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-26T15:32:09.438+05:30[Asia/Calcutta]")

public class ReplyDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("reply")
  private String reply = null;

  @JsonProperty("userRatingReviewId")
  private Long userRatingReviewId = null;

  public ReplyDTO id(Long id) {
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

  public ReplyDTO reply(String reply) {
    this.reply = reply;
    return this;
  }

  /**
   * Get reply
   * @return reply
  **/
  @ApiModelProperty(value = "")


  public String getReply() {
    return reply;
  }

  public void setReply(String reply) {
    this.reply = reply;
  }

  public ReplyDTO userRatingReviewId(Long userRatingReviewId) {
    this.userRatingReviewId = userRatingReviewId;
    return this;
  }

  /**
   * Get userRatingReviewId
   * @return userRatingReviewId
  **/
  @ApiModelProperty(value = "")


  public Long getUserRatingReviewId() {
    return userRatingReviewId;
  }

  public void setUserRatingReviewId(Long userRatingReviewId) {
    this.userRatingReviewId = userRatingReviewId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplyDTO replyDTO = (ReplyDTO) o;
    return Objects.equals(this.id, replyDTO.id) &&
        Objects.equals(this.reply, replyDTO.reply) &&
        Objects.equals(this.userRatingReviewId, replyDTO.userRatingReviewId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reply, userRatingReviewId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
    sb.append("    userRatingReviewId: ").append(toIndentedString(userRatingReviewId)).append("\n");
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

