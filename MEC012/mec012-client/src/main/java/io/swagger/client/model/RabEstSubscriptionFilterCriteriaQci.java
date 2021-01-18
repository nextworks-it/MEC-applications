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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * List of filtering criteria for the subscription. Any filtering criteria from below, which is included in the request, shall also be included in the response.
 */
@Schema(description = "List of filtering criteria for the subscription. Any filtering criteria from below, which is included in the request, shall also be included in the response.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-09T15:33:56.133+01:00[Europe/Rome]")
public class RabEstSubscriptionFilterCriteriaQci {
  @SerializedName("appInstanceId")
  private String appInstanceId = null;

  @SerializedName("ecgi")
  private List<Ecgi> ecgi = null;

  @SerializedName("qci")
  private Integer qci = null;

  public RabEstSubscriptionFilterCriteriaQci appInstanceId(String appInstanceId) {
    this.appInstanceId = appInstanceId;
    return this;
  }

   /**
   * Unique identifier for the MEC application instance.
   * @return appInstanceId
  **/
  @Schema(description = "Unique identifier for the MEC application instance.")
  public String getAppInstanceId() {
    return appInstanceId;
  }

  public void setAppInstanceId(String appInstanceId) {
    this.appInstanceId = appInstanceId;
  }

  public RabEstSubscriptionFilterCriteriaQci ecgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
    return this;
  }

  public RabEstSubscriptionFilterCriteriaQci addEcgiItem(Ecgi ecgiItem) {
    if (this.ecgi == null) {
      this.ecgi = new ArrayList<Ecgi>();
    }
    this.ecgi.add(ecgiItem);
    return this;
  }

   /**
   * E-UTRAN Cell Global Identifier.
   * @return ecgi
  **/
  @Schema(description = "E-UTRAN Cell Global Identifier.")
  public List<Ecgi> getEcgi() {
    return ecgi;
  }

  public void setEcgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
  }

  public RabEstSubscriptionFilterCriteriaQci qci(Integer qci) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabEstSubscriptionFilterCriteriaQci rabEstSubscriptionFilterCriteriaQci = (RabEstSubscriptionFilterCriteriaQci) o;
    return Objects.equals(this.appInstanceId, rabEstSubscriptionFilterCriteriaQci.appInstanceId) &&
        Objects.equals(this.ecgi, rabEstSubscriptionFilterCriteriaQci.ecgi) &&
        Objects.equals(this.qci, rabEstSubscriptionFilterCriteriaQci.qci);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInstanceId, ecgi, qci);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabEstSubscriptionFilterCriteriaQci {\n");
    
    sb.append("    appInstanceId: ").append(toIndentedString(appInstanceId)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    qci: ").append(toIndentedString(qci)).append("\n");
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
