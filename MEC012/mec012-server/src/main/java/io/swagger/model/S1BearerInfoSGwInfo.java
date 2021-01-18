package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * S1 bearer information on GW side as defined below.
 */
@ApiModel(description = "S1 bearer information on GW side as defined below.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class S1BearerInfoSGwInfo   {
  @JsonProperty("ipAddress")
  private String ipAddress = null;

  @JsonProperty("tunnelId")
  private String tunnelId = null;

  public S1BearerInfoSGwInfo ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * SGW transport layer address of this S1 bearer.
   * @return ipAddress
  **/
  @ApiModelProperty(required = true, value = "SGW transport layer address of this S1 bearer.")
      @NotNull

    public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public S1BearerInfoSGwInfo tunnelId(String tunnelId) {
    this.tunnelId = tunnelId;
    return this;
  }

  /**
   * SGW GTP-U TEID of this S1 bearer.
   * @return tunnelId
  **/
  @ApiModelProperty(required = true, value = "SGW GTP-U TEID of this S1 bearer.")
      @NotNull

    public String getTunnelId() {
    return tunnelId;
  }

  public void setTunnelId(String tunnelId) {
    this.tunnelId = tunnelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S1BearerInfoSGwInfo s1BearerInfoSGwInfo = (S1BearerInfoSGwInfo) o;
    return Objects.equals(this.ipAddress, s1BearerInfoSGwInfo.ipAddress) &&
        Objects.equals(this.tunnelId, s1BearerInfoSGwInfo.tunnelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, tunnelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S1BearerInfoSGwInfo {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    tunnelId: ").append(toIndentedString(tunnelId)).append("\n");
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
