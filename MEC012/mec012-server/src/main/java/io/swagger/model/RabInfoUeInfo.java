package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.RabInfoErabInfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RabInfoUeInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabInfoUeInfo   {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("erabInfo")
  @Valid
  private List<RabInfoErabInfo> erabInfo = null;

  public RabInfoUeInfo associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public RabInfoUeInfo addAssociateIdItem(AssociateId associateIdItem) {
    if (this.associateId == null) {
      this.associateId = new ArrayList<AssociateId>();
    }
    this.associateId.add(associateIdItem);
    return this;
  }

  /**
   * 0 to N identifiers to associate the event for a specific UE or flow.
   * @return associateId
  **/
  @ApiModelProperty(value = "0 to N identifiers to associate the event for a specific UE or flow.")
      @Valid
    public List<AssociateId> getAssociateId() {
    return associateId;
  }

  public void setAssociateId(List<AssociateId> associateId) {
    this.associateId = associateId;
  }

  public RabInfoUeInfo erabInfo(List<RabInfoErabInfo> erabInfo) {
    this.erabInfo = erabInfo;
    return this;
  }

  public RabInfoUeInfo addErabInfoItem(RabInfoErabInfo erabInfoItem) {
    if (this.erabInfo == null) {
      this.erabInfo = new ArrayList<RabInfoErabInfo>();
    }
    this.erabInfo.add(erabInfoItem);
    return this;
  }

  /**
   * Information on E-RAB as defined below.
   * @return erabInfo
  **/
  @ApiModelProperty(value = "Information on E-RAB as defined below.")
      @Valid
  @Size(min=1)   public List<RabInfoErabInfo> getErabInfo() {
    return erabInfo;
  }

  public void setErabInfo(List<RabInfoErabInfo> erabInfo) {
    this.erabInfo = erabInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabInfoUeInfo rabInfoUeInfo = (RabInfoUeInfo) o;
    return Objects.equals(this.associateId, rabInfoUeInfo.associateId) &&
        Objects.equals(this.erabInfo, rabInfoUeInfo.erabInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, erabInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabInfoUeInfo {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    erabInfo: ").append(toIndentedString(erabInfo)).append("\n");
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
