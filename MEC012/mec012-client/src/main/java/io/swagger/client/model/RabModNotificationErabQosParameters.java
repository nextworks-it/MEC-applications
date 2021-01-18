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
 * The QoS parameters for the E-RAB as defined below.
 */
@Schema(description = "The QoS parameters for the E-RAB as defined below.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-09T15:33:56.133+01:00[Europe/Rome]")
public class RabModNotificationErabQosParameters {
  @SerializedName("qci")
  private Integer qci = null;

  @SerializedName("qosInformation")
  private RabModNotificationErabQosParametersQosInformation qosInformation = null;

  public RabModNotificationErabQosParameters qci(Integer qci) {
    this.qci = qci;
    return this;
  }

   /**
   * QoS Class Identifier as defined in ETSI TS 123 401 [i.4].
   * @return qci
  **/
  @Schema(required = true, description = "QoS Class Identifier as defined in ETSI TS 123 401 [i.4].")
  public Integer getQci() {
    return qci;
  }

  public void setQci(Integer qci) {
    this.qci = qci;
  }

  public RabModNotificationErabQosParameters qosInformation(RabModNotificationErabQosParametersQosInformation qosInformation) {
    this.qosInformation = qosInformation;
    return this;
  }

   /**
   * Get qosInformation
   * @return qosInformation
  **/
  @Schema(description = "")
  public RabModNotificationErabQosParametersQosInformation getQosInformation() {
    return qosInformation;
  }

  public void setQosInformation(RabModNotificationErabQosParametersQosInformation qosInformation) {
    this.qosInformation = qosInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabModNotificationErabQosParameters rabModNotificationErabQosParameters = (RabModNotificationErabQosParameters) o;
    return Objects.equals(this.qci, rabModNotificationErabQosParameters.qci) &&
        Objects.equals(this.qosInformation, rabModNotificationErabQosParameters.qosInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qci, qosInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabModNotificationErabQosParameters {\n");
    
    sb.append("    qci: ").append(toIndentedString(qci)).append("\n");
    sb.append("    qosInformation: ").append(toIndentedString(qosInformation)).append("\n");
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
