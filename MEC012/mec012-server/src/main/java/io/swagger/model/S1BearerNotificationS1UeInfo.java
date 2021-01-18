package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.CellChangeNotificationTempUeId;
import io.swagger.model.Ecgi;
import io.swagger.model.S1BearerInfoS1BearerInfoDetailed;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information on specific UE that matches the criteria in S1BearerSubscription as defined below.
 */
@ApiModel(description = "Information on specific UE that matches the criteria in S1BearerSubscription as defined below.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class S1BearerNotificationS1UeInfo   {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("ecgi")
  @Valid
  private List<Ecgi> ecgi = new ArrayList<Ecgi>();

  @JsonProperty("s1BearerInfo")
  @Valid
  private List<S1BearerInfoS1BearerInfoDetailed> s1BearerInfo = new ArrayList<S1BearerInfoS1BearerInfoDetailed>();

  @JsonProperty("tempUeId")
  private CellChangeNotificationTempUeId tempUeId = null;

  public S1BearerNotificationS1UeInfo associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public S1BearerNotificationS1UeInfo addAssociateIdItem(AssociateId associateIdItem) {
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

  public S1BearerNotificationS1UeInfo ecgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
    return this;
  }

  public S1BearerNotificationS1UeInfo addEcgiItem(Ecgi ecgiItem) {
    this.ecgi.add(ecgiItem);
    return this;
  }

  /**
   * E-UTRAN Cell Global Identifier.
   * @return ecgi
  **/
  @ApiModelProperty(required = true, value = "E-UTRAN Cell Global Identifier.")
      @NotNull
    @Valid
  @Size(min=1)   public List<Ecgi> getEcgi() {
    return ecgi;
  }

  public void setEcgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
  }

  public S1BearerNotificationS1UeInfo s1BearerInfo(List<S1BearerInfoS1BearerInfoDetailed> s1BearerInfo) {
    this.s1BearerInfo = s1BearerInfo;
    return this;
  }

  public S1BearerNotificationS1UeInfo addS1BearerInfoItem(S1BearerInfoS1BearerInfoDetailed s1BearerInfoItem) {
    this.s1BearerInfo.add(s1BearerInfoItem);
    return this;
  }

  /**
   * S1 bearer information as defined below.
   * @return s1BearerInfo
  **/
  @ApiModelProperty(required = true, value = "S1 bearer information as defined below.")
      @NotNull
    @Valid
  @Size(min=1)   public List<S1BearerInfoS1BearerInfoDetailed> getS1BearerInfo() {
    return s1BearerInfo;
  }

  public void setS1BearerInfo(List<S1BearerInfoS1BearerInfoDetailed> s1BearerInfo) {
    this.s1BearerInfo = s1BearerInfo;
  }

  public S1BearerNotificationS1UeInfo tempUeId(CellChangeNotificationTempUeId tempUeId) {
    this.tempUeId = tempUeId;
    return this;
  }

  /**
   * Get tempUeId
   * @return tempUeId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CellChangeNotificationTempUeId getTempUeId() {
    return tempUeId;
  }

  public void setTempUeId(CellChangeNotificationTempUeId tempUeId) {
    this.tempUeId = tempUeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S1BearerNotificationS1UeInfo s1BearerNotificationS1UeInfo = (S1BearerNotificationS1UeInfo) o;
    return Objects.equals(this.associateId, s1BearerNotificationS1UeInfo.associateId) &&
        Objects.equals(this.ecgi, s1BearerNotificationS1UeInfo.ecgi) &&
        Objects.equals(this.s1BearerInfo, s1BearerNotificationS1UeInfo.s1BearerInfo) &&
        Objects.equals(this.tempUeId, s1BearerNotificationS1UeInfo.tempUeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, ecgi, s1BearerInfo, tempUeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S1BearerNotificationS1UeInfo {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    s1BearerInfo: ").append(toIndentedString(s1BearerInfo)).append("\n");
    sb.append("    tempUeId: ").append(toIndentedString(tempUeId)).append("\n");
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
