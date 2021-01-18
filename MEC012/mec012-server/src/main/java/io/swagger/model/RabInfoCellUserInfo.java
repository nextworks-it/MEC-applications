package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Ecgi;
import io.swagger.model.RabInfoUeInfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RabInfoCellUserInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabInfoCellUserInfo   {
  @JsonProperty("ecgi")
  private Ecgi ecgi = null;

  @JsonProperty("ueInfo")
  @Valid
  private List<RabInfoUeInfo> ueInfo = null;

  public RabInfoCellUserInfo ecgi(Ecgi ecgi) {
    this.ecgi = ecgi;
    return this;
  }

  /**
   * Get ecgi
   * @return ecgi
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Ecgi getEcgi() {
    return ecgi;
  }

  public void setEcgi(Ecgi ecgi) {
    this.ecgi = ecgi;
  }

  public RabInfoCellUserInfo ueInfo(List<RabInfoUeInfo> ueInfo) {
    this.ueInfo = ueInfo;
    return this;
  }

  public RabInfoCellUserInfo addUeInfoItem(RabInfoUeInfo ueInfoItem) {
    if (this.ueInfo == null) {
      this.ueInfo = new ArrayList<RabInfoUeInfo>();
    }
    this.ueInfo.add(ueInfoItem);
    return this;
  }

  /**
   * Information on UEs in the specific cell as defined below.
   * @return ueInfo
  **/
  @ApiModelProperty(value = "Information on UEs in the specific cell as defined below.")
      @Valid
  @Size(min=1)   public List<RabInfoUeInfo> getUeInfo() {
    return ueInfo;
  }

  public void setUeInfo(List<RabInfoUeInfo> ueInfo) {
    this.ueInfo = ueInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabInfoCellUserInfo rabInfoCellUserInfo = (RabInfoCellUserInfo) o;
    return Objects.equals(this.ecgi, rabInfoCellUserInfo.ecgi) &&
        Objects.equals(this.ueInfo, rabInfoCellUserInfo.ueInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecgi, ueInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabInfoCellUserInfo {\n");
    
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    ueInfo: ").append(toIndentedString(ueInfo)).append("\n");
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
