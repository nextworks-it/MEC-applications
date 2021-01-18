package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.NRcgi;
import io.swagger.model.TriggerNr;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of filtering criteria for the subscription. Any filtering criteria from below, which is included in the request, shall also be included in the response.
 */
@ApiModel(description = "List of filtering criteria for the subscription. Any filtering criteria from below, which is included in the request, shall also be included in the response.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class NrMeasRepUeSubscriptionFilterCriteriaNrMrs   {
  @JsonProperty("appInstanceId")
  private String appInstanceId = null;

  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("nrcgi")
  @Valid
  private List<NRcgi> nrcgi = null;

  @JsonProperty("triggerNr")
  @Valid
  private List<TriggerNr> triggerNr = null;

  public NrMeasRepUeSubscriptionFilterCriteriaNrMrs appInstanceId(String appInstanceId) {
    this.appInstanceId = appInstanceId;
    return this;
  }

  /**
   * Unique identifier for the MEC application instance.
   * @return appInstanceId
  **/
  @ApiModelProperty(value = "Unique identifier for the MEC application instance.")
  
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
  @ApiModelProperty(value = "0 to N identifiers to associate the information for a specific UE or flow.")
      @Valid
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
  @ApiModelProperty(value = "NR Cell Global Identier.")
      @Valid
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
  @ApiModelProperty(value = "Corresponds to a specific 5G UE Measurement Report trigger.")
      @Valid
    public List<TriggerNr> getTriggerNr() {
    return triggerNr;
  }

  public void setTriggerNr(List<TriggerNr> triggerNr) {
    this.triggerNr = triggerNr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
