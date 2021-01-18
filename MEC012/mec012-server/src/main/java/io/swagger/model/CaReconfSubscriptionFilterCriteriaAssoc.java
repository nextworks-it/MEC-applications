package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.Ecgi;
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


public class CaReconfSubscriptionFilterCriteriaAssoc   {
  @JsonProperty("appInstanceId")
  private String appInstanceId = null;

  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("ecgi")
  @Valid
  private List<Ecgi> ecgi = null;

  public CaReconfSubscriptionFilterCriteriaAssoc appInstanceId(String appInstanceId) {
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

  public CaReconfSubscriptionFilterCriteriaAssoc associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public CaReconfSubscriptionFilterCriteriaAssoc addAssociateIdItem(AssociateId associateIdItem) {
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

  public CaReconfSubscriptionFilterCriteriaAssoc ecgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
    return this;
  }

  public CaReconfSubscriptionFilterCriteriaAssoc addEcgiItem(Ecgi ecgiItem) {
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
  @ApiModelProperty(value = "E-UTRAN Cell Global Identifier.")
      @Valid
    public List<Ecgi> getEcgi() {
    return ecgi;
  }

  public void setEcgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaReconfSubscriptionFilterCriteriaAssoc caReconfSubscriptionFilterCriteriaAssoc = (CaReconfSubscriptionFilterCriteriaAssoc) o;
    return Objects.equals(this.appInstanceId, caReconfSubscriptionFilterCriteriaAssoc.appInstanceId) &&
        Objects.equals(this.associateId, caReconfSubscriptionFilterCriteriaAssoc.associateId) &&
        Objects.equals(this.ecgi, caReconfSubscriptionFilterCriteriaAssoc.ecgi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInstanceId, associateId, ecgi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaReconfSubscriptionFilterCriteriaAssoc {\n");
    
    sb.append("    appInstanceId: ").append(toIndentedString(appInstanceId)).append("\n");
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
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
