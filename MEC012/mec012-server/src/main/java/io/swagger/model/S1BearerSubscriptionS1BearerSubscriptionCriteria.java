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
 * As defined below.
 */
@ApiModel(description = "As defined below.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class S1BearerSubscriptionS1BearerSubscriptionCriteria   {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("ecgi")
  @Valid
  private List<Ecgi> ecgi = null;

  @JsonProperty("erabId")
  @Valid
  private List<Integer> erabId = null;

  public S1BearerSubscriptionS1BearerSubscriptionCriteria associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public S1BearerSubscriptionS1BearerSubscriptionCriteria addAssociateIdItem(AssociateId associateIdItem) {
    if (this.associateId == null) {
      this.associateId = new ArrayList<AssociateId>();
    }
    this.associateId.add(associateIdItem);
    return this;
  }

  /**
   * 0 to N identifiers to associate the events for a specific UE or a flow.
   * @return associateId
  **/
  @ApiModelProperty(value = "0 to N identifiers to associate the events for a specific UE or a flow.")
      @Valid
    public List<AssociateId> getAssociateId() {
    return associateId;
  }

  public void setAssociateId(List<AssociateId> associateId) {
    this.associateId = associateId;
  }

  public S1BearerSubscriptionS1BearerSubscriptionCriteria ecgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
    return this;
  }

  public S1BearerSubscriptionS1BearerSubscriptionCriteria addEcgiItem(Ecgi ecgiItem) {
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

  public S1BearerSubscriptionS1BearerSubscriptionCriteria erabId(List<Integer> erabId) {
    this.erabId = erabId;
    return this;
  }

  public S1BearerSubscriptionS1BearerSubscriptionCriteria addErabIdItem(Integer erabIdItem) {
    if (this.erabId == null) {
      this.erabId = new ArrayList<Integer>();
    }
    this.erabId.add(erabIdItem);
    return this;
  }

  /**
   * The attribute that uniquely identifies a S1 bearer for a specific UE, as defined in ETSI TS 136 413 [i.3].
   * @return erabId
  **/
  @ApiModelProperty(value = "The attribute that uniquely identifies a S1 bearer for a specific UE, as defined in ETSI TS 136 413 [i.3].")
  
    public List<Integer> getErabId() {
    return erabId;
  }

  public void setErabId(List<Integer> erabId) {
    this.erabId = erabId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S1BearerSubscriptionS1BearerSubscriptionCriteria s1BearerSubscriptionS1BearerSubscriptionCriteria = (S1BearerSubscriptionS1BearerSubscriptionCriteria) o;
    return Objects.equals(this.associateId, s1BearerSubscriptionS1BearerSubscriptionCriteria.associateId) &&
        Objects.equals(this.ecgi, s1BearerSubscriptionS1BearerSubscriptionCriteria.ecgi) &&
        Objects.equals(this.erabId, s1BearerSubscriptionS1BearerSubscriptionCriteria.erabId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, ecgi, erabId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S1BearerSubscriptionS1BearerSubscriptionCriteria {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    erabId: ").append(toIndentedString(erabId)).append("\n");
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
