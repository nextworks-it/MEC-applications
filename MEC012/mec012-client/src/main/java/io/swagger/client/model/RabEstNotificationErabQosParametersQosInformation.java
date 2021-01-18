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
 * The QoS information for the E-RAB.
 */
@Schema(description = "The QoS information for the E-RAB.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-09T15:33:56.133+01:00[Europe/Rome]")
public class RabEstNotificationErabQosParametersQosInformation {
  @SerializedName("erabGbrDl")
  private Integer erabGbrDl = null;

  @SerializedName("erabGbrUl")
  private Integer erabGbrUl = null;

  @SerializedName("erabMbrDl")
  private Integer erabMbrDl = null;

  @SerializedName("erabMbrUl")
  private Integer erabMbrUl = null;

  public RabEstNotificationErabQosParametersQosInformation erabGbrDl(Integer erabGbrDl) {
    this.erabGbrDl = erabGbrDl;
    return this;
  }

   /**
   * This attribute indicates the guaranteed downlink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.
   * @return erabGbrDl
  **/
  @Schema(required = true, description = "This attribute indicates the guaranteed downlink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.")
  public Integer getErabGbrDl() {
    return erabGbrDl;
  }

  public void setErabGbrDl(Integer erabGbrDl) {
    this.erabGbrDl = erabGbrDl;
  }

  public RabEstNotificationErabQosParametersQosInformation erabGbrUl(Integer erabGbrUl) {
    this.erabGbrUl = erabGbrUl;
    return this;
  }

   /**
   * This attribute indicates the guaranteed uplink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.
   * @return erabGbrUl
  **/
  @Schema(required = true, description = "This attribute indicates the guaranteed uplink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.")
  public Integer getErabGbrUl() {
    return erabGbrUl;
  }

  public void setErabGbrUl(Integer erabGbrUl) {
    this.erabGbrUl = erabGbrUl;
  }

  public RabEstNotificationErabQosParametersQosInformation erabMbrDl(Integer erabMbrDl) {
    this.erabMbrDl = erabMbrDl;
    return this;
  }

   /**
   * This attribute indicates the maximum downlink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.
   * @return erabMbrDl
  **/
  @Schema(required = true, description = "This attribute indicates the maximum downlink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.")
  public Integer getErabMbrDl() {
    return erabMbrDl;
  }

  public void setErabMbrDl(Integer erabMbrDl) {
    this.erabMbrDl = erabMbrDl;
  }

  public RabEstNotificationErabQosParametersQosInformation erabMbrUl(Integer erabMbrUl) {
    this.erabMbrUl = erabMbrUl;
    return this;
  }

   /**
   * This attribute indicates the maximum uplink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.
   * @return erabMbrUl
  **/
  @Schema(required = true, description = "This attribute indicates the maximum uplink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.")
  public Integer getErabMbrUl() {
    return erabMbrUl;
  }

  public void setErabMbrUl(Integer erabMbrUl) {
    this.erabMbrUl = erabMbrUl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabEstNotificationErabQosParametersQosInformation rabEstNotificationErabQosParametersQosInformation = (RabEstNotificationErabQosParametersQosInformation) o;
    return Objects.equals(this.erabGbrDl, rabEstNotificationErabQosParametersQosInformation.erabGbrDl) &&
        Objects.equals(this.erabGbrUl, rabEstNotificationErabQosParametersQosInformation.erabGbrUl) &&
        Objects.equals(this.erabMbrDl, rabEstNotificationErabQosParametersQosInformation.erabMbrDl) &&
        Objects.equals(this.erabMbrUl, rabEstNotificationErabQosParametersQosInformation.erabMbrUl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(erabGbrDl, erabGbrUl, erabMbrDl, erabMbrUl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabEstNotificationErabQosParametersQosInformation {\n");
    
    sb.append("    erabGbrDl: ").append(toIndentedString(erabGbrDl)).append("\n");
    sb.append("    erabGbrUl: ").append(toIndentedString(erabGbrUl)).append("\n");
    sb.append("    erabMbrDl: ").append(toIndentedString(erabMbrDl)).append("\n");
    sb.append("    erabMbrUl: ").append(toIndentedString(erabMbrUl)).append("\n");
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