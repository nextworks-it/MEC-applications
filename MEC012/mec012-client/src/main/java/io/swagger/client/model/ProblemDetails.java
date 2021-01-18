/*
 * ETSI GS MEC 012 - Radio Network Information API
 * The ETSI MEC ISG MEC012 Radio Network Information API described using OpenAPI.
 *
 * OpenAPI spec version: 2.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ProblemDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-09T15:33:56.133+01:00[Europe/Rome]")
public class ProblemDetails {
  @SerializedName("detail")
  private String detail = null;

  @SerializedName("instance")
  private String instance = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private String type = null;

  public ProblemDetails detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem
   * @return detail
  **/
  @Schema(description = "A human-readable explanation specific to this occurrence of the problem")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ProblemDetails instance(String instance) {
    this.instance = instance;
    return this;
  }

   /**
   * A URI reference that identifies the specific occurrence of the problem
   * @return instance
  **/
  @Schema(description = "A URI reference that identifies the specific occurrence of the problem")
  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  public ProblemDetails status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code for this occurrence of the problem
   * @return status
  **/
  @Schema(description = "The HTTP status code for this occurrence of the problem")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ProblemDetails title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem type
   * @return title
  **/
  @Schema(description = "A short, human-readable summary of the problem type")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProblemDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A URI reference according to IETF RFC 3986 that identifies the problem type
   * @return type
  **/
  @Schema(description = "A URI reference according to IETF RFC 3986 that identifies the problem type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetails problemDetails = (ProblemDetails) o;
    return Objects.equals(this.detail, problemDetails.detail) &&
        Objects.equals(this.instance, problemDetails.instance) &&
        Objects.equals(this.status, problemDetails.status) &&
        Objects.equals(this.title, problemDetails.title) &&
        Objects.equals(this.type, problemDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, instance, status, title, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetails {\n");
    
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
