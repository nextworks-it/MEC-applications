package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.S1BearerInfoEnbInfo;
import io.swagger.model.S1BearerInfoSGwInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * S1BearerInfoS1BearerInfoDetailed
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class S1BearerInfoS1BearerInfoDetailed   {
  @JsonProperty("enbInfo")
  private S1BearerInfoEnbInfo enbInfo = null;

  @JsonProperty("erabId")
  private Integer erabId = null;

  @JsonProperty("sGwInfo")
  private S1BearerInfoSGwInfo sGwInfo = null;

  public S1BearerInfoS1BearerInfoDetailed enbInfo(S1BearerInfoEnbInfo enbInfo) {
    this.enbInfo = enbInfo;
    return this;
  }

  /**
   * Get enbInfo
   * @return enbInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public S1BearerInfoEnbInfo getEnbInfo() {
    return enbInfo;
  }

  public void setEnbInfo(S1BearerInfoEnbInfo enbInfo) {
    this.enbInfo = enbInfo;
  }

  public S1BearerInfoS1BearerInfoDetailed erabId(Integer erabId) {
    this.erabId = erabId;
    return this;
  }

  /**
   * The attribute that uniquely identifies a S1 bearer for a specific UE, as defined in ETSI TS 136 413 [i.3].
   * @return erabId
  **/
  @ApiModelProperty(value = "The attribute that uniquely identifies a S1 bearer for a specific UE, as defined in ETSI TS 136 413 [i.3].")
  
    public Integer getErabId() {
    return erabId;
  }

  public void setErabId(Integer erabId) {
    this.erabId = erabId;
  }

  public S1BearerInfoS1BearerInfoDetailed sGwInfo(S1BearerInfoSGwInfo sGwInfo) {
    this.sGwInfo = sGwInfo;
    return this;
  }

  /**
   * Get sGwInfo
   * @return sGwInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public S1BearerInfoSGwInfo getSGwInfo() {
    return sGwInfo;
  }

  public void setSGwInfo(S1BearerInfoSGwInfo sGwInfo) {
    this.sGwInfo = sGwInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S1BearerInfoS1BearerInfoDetailed s1BearerInfoS1BearerInfoDetailed = (S1BearerInfoS1BearerInfoDetailed) o;
    return Objects.equals(this.enbInfo, s1BearerInfoS1BearerInfoDetailed.enbInfo) &&
        Objects.equals(this.erabId, s1BearerInfoS1BearerInfoDetailed.erabId) &&
        Objects.equals(this.sGwInfo, s1BearerInfoS1BearerInfoDetailed.sGwInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enbInfo, erabId, sGwInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S1BearerInfoS1BearerInfoDetailed {\n");
    
    sb.append("    enbInfo: ").append(toIndentedString(enbInfo)).append("\n");
    sb.append("    erabId: ").append(toIndentedString(erabId)).append("\n");
    sb.append("    sGwInfo: ").append(toIndentedString(sGwInfo)).append("\n");
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
