package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RabEstNotificationErabQosParameters;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RabInfoErabInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabInfoErabInfo   {
  @JsonProperty("erabId")
  private Integer erabId = null;

  @JsonProperty("erabQosParameters")
  private RabEstNotificationErabQosParameters erabQosParameters = null;

  public RabInfoErabInfo erabId(Integer erabId) {
    this.erabId = erabId;
    return this;
  }

  /**
   * The attribute that uniquely identifies a Radio Access bearer for specific UE as defined in ETSI TS 136 413 [i.3].
   * @return erabId
  **/
  @ApiModelProperty(value = "The attribute that uniquely identifies a Radio Access bearer for specific UE as defined in ETSI TS 136 413 [i.3].")
  
    public Integer getErabId() {
    return erabId;
  }

  public void setErabId(Integer erabId) {
    this.erabId = erabId;
  }

  public RabInfoErabInfo erabQosParameters(RabEstNotificationErabQosParameters erabQosParameters) {
    this.erabQosParameters = erabQosParameters;
    return this;
  }

  /**
   * Get erabQosParameters
   * @return erabQosParameters
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public RabEstNotificationErabQosParameters getErabQosParameters() {
    return erabQosParameters;
  }

  public void setErabQosParameters(RabEstNotificationErabQosParameters erabQosParameters) {
    this.erabQosParameters = erabQosParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabInfoErabInfo rabInfoErabInfo = (RabInfoErabInfo) o;
    return Objects.equals(this.erabId, rabInfoErabInfo.erabId) &&
        Objects.equals(this.erabQosParameters, rabInfoErabInfo.erabQosParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(erabId, erabQosParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabInfoErabInfo {\n");
    
    sb.append("    erabId: ").append(toIndentedString(erabId)).append("\n");
    sb.append("    erabQosParameters: ").append(toIndentedString(erabQosParameters)).append("\n");
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
