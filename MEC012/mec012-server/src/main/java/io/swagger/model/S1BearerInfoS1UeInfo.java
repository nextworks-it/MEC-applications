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
 * S1BearerInfoS1UeInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class S1BearerInfoS1UeInfo   {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("ecgi")
  @Valid
  private List<Ecgi> ecgi = null;

  @JsonProperty("s1BearerInfoDetailed")
  @Valid
  private List<S1BearerInfoS1BearerInfoDetailed> s1BearerInfoDetailed = null;

  @JsonProperty("tempUeId")
  private CellChangeNotificationTempUeId tempUeId = null;

  public S1BearerInfoS1UeInfo associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public S1BearerInfoS1UeInfo addAssociateIdItem(AssociateId associateIdItem) {
    if (this.associateId == null) {
      this.associateId = new ArrayList<AssociateId>();
    }
    this.associateId.add(associateIdItem);
    return this;
  }

  /**
   * 1 to N identifiers to associate the information for a specific UE or flow.
   * @return associateId
  **/
  @ApiModelProperty(value = "1 to N identifiers to associate the information for a specific UE or flow.")
      @Valid
  @Size(min=1)   public List<AssociateId> getAssociateId() {
    return associateId;
  }

  public void setAssociateId(List<AssociateId> associateId) {
    this.associateId = associateId;
  }

  public S1BearerInfoS1UeInfo ecgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
    return this;
  }

  public S1BearerInfoS1UeInfo addEcgiItem(Ecgi ecgiItem) {
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
  @Size(min=1)   public List<Ecgi> getEcgi() {
    return ecgi;
  }

  public void setEcgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
  }

  public S1BearerInfoS1UeInfo s1BearerInfoDetailed(List<S1BearerInfoS1BearerInfoDetailed> s1BearerInfoDetailed) {
    this.s1BearerInfoDetailed = s1BearerInfoDetailed;
    return this;
  }

  public S1BearerInfoS1UeInfo addS1BearerInfoDetailedItem(S1BearerInfoS1BearerInfoDetailed s1BearerInfoDetailedItem) {
    if (this.s1BearerInfoDetailed == null) {
      this.s1BearerInfoDetailed = new ArrayList<S1BearerInfoS1BearerInfoDetailed>();
    }
    this.s1BearerInfoDetailed.add(s1BearerInfoDetailedItem);
    return this;
  }

  /**
   * S1 bearer information as defined below.
   * @return s1BearerInfoDetailed
  **/
  @ApiModelProperty(value = "S1 bearer information as defined below.")
      @Valid
  @Size(min=1)   public List<S1BearerInfoS1BearerInfoDetailed> getS1BearerInfoDetailed() {
    return s1BearerInfoDetailed;
  }

  public void setS1BearerInfoDetailed(List<S1BearerInfoS1BearerInfoDetailed> s1BearerInfoDetailed) {
    this.s1BearerInfoDetailed = s1BearerInfoDetailed;
  }

  public S1BearerInfoS1UeInfo tempUeId(CellChangeNotificationTempUeId tempUeId) {
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
    S1BearerInfoS1UeInfo s1BearerInfoS1UeInfo = (S1BearerInfoS1UeInfo) o;
    return Objects.equals(this.associateId, s1BearerInfoS1UeInfo.associateId) &&
        Objects.equals(this.ecgi, s1BearerInfoS1UeInfo.ecgi) &&
        Objects.equals(this.s1BearerInfoDetailed, s1BearerInfoS1UeInfo.s1BearerInfoDetailed) &&
        Objects.equals(this.tempUeId, s1BearerInfoS1UeInfo.tempUeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, ecgi, s1BearerInfoDetailed, tempUeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S1BearerInfoS1UeInfo {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    s1BearerInfoDetailed: ").append(toIndentedString(s1BearerInfoDetailed)).append("\n");
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
