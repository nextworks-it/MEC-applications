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
public class NrMeasRepUeSubscriptionFilterCriteriaNrMrs {
  @SerializedName("appInstanceId")
  private String appInstanceId = null;

  @SerializedName("associateId")
  private List<AssociateId> associateId = null;

  @SerializedName("nrcgi")
  private List<NRcgi> nrcgi = null;

  @SerializedName("triggerNr")
  private List<TriggerNr> triggerNr = null;

  public NrMeasRepUeSubscriptionFilterCriteriaNrMrs appInstanceId(String appInstanceId) {
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

  public NrMeasRepUeSubscriptionFilterCriteriaNrMrs associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public NrMeasRepUeSubscriptionFilterCriteriaNrMrs addAssociateIdItem(AssociateId associateIdItem) {
    if (this.associateId == null) {
      this.associateId = new ArrayList<AssociateId>();
    }
    this.associateId.add(associateIdItem);
    return this;
  }

   /**
   * 0 to N identifiers to associate the information for a specific UE or flow.
   * @return associateId
  **/
  @Schema(description = "0 to N identifiers to associate the information for a specific UE or flow.")
  public List<AssociateId> getAssociateId() {
    return associateId;
  }

  public void setAssociateId(List<AssociateId> associateId) {
    this.associateId = associateId;
  }

  public NrMeasRepUeSubscriptionFilterCriteriaNrMrs nrcgi(List<NRcgi> nrcgi) {
    this.nrcgi = nrcgi;
    return this;
  }

  public NrMeasRepUeSubscriptionFilterCriteriaNrMrs addNrcgiItem(NRcgi nrcgiItem) {
    if (this.nrcgi == null) {
      this.nrcgi = new ArrayList<NRcgi>();
    }
    this.nrcgi.add(nrcgiItem);
    return this;
  }

   /**
   * NR Cell Global Identier.
   * @return nrcgi
  **/
  @Schema(description = "NR Cell Global Identier.")
  public List<NRcgi> getNrcgi() {
    return nrcgi;
  }

  public void setNrcgi(List<NRcgi> nrcgi) {
    this.nrcgi = nrcgi;
  }

  public NrMeasRepUeSubscriptionFilterCriteriaNrMrs triggerNr(List<TriggerNr> triggerNr) {
    this.triggerNr = triggerNr;
    return this;
  }

  public NrMeasRepUeSubscriptionFilterCriteriaNrMrs addTriggerNrItem(TriggerNr triggerNrItem) {
    if (this.triggerNr == null) {
      this.triggerNr = new ArrayList<TriggerNr>();
    }
    this.triggerNr.add(triggerNrItem);
    return this;
  }

   /**
   * Corresponds to a specific 5G UE Measurement Report trigger.
   * @return triggerNr
  **/
  @Schema(description = "Corresponds to a specific 5G UE Measurement Report trigger.")
  public List<TriggerNr> getTriggerNr() {
    return triggerNr;
  }

  public void setTriggerNr(List<TriggerNr> triggerNr) {
    this.triggerNr = triggerNr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NrMeasRepUeSubscriptionFilterCriteriaNrMrs nrMeasRepUeSubscriptionFilterCriteriaNrMrs = (NrMeasRepUeSubscriptionFilterCriteriaNrMrs) o;
    return Objects.equals(this.appInstanceId, nrMeasRepUeSubscriptionFilterCriteriaNrMrs.appInstanceId) &&
        Objects.equals(this.associateId, nrMeasRepUeSubscriptionFilterCriteriaNrMrs.associateId) &&
        Objects.equals(this.nrcgi, nrMeasRepUeSubscriptionFilterCriteriaNrMrs.nrcgi) &&
        Objects.equals(this.triggerNr, nrMeasRepUeSubscriptionFilterCriteriaNrMrs.triggerNr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInstanceId, associateId, nrcgi, triggerNr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NrMeasRepUeSubscriptionFilterCriteriaNrMrs {\n");
    
    sb.append("    appInstanceId: ").append(toIndentedString(appInstanceId)).append("\n");
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    nrcgi: ").append(toIndentedString(nrcgi)).append("\n");
    sb.append("    triggerNr: ").append(toIndentedString(triggerNr)).append("\n");
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