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
 * The release information for the E-RAB as defined below.
 */
@ApiModel(description = "The release information for the E-RAB as defined below.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabRelNotificationErabReleaseInfo   {
  @JsonProperty("erabId")
  private Integer erabId = null;

  public RabRelNotificationErabReleaseInfo erabId(Integer erabId) {
    this.erabId = erabId;
    return this;
  }

  /**
   * The attribute that uniquely identifies a Radio Access bearer for specific UE as defined in ETSI TS 136 413 [i.3].
   * @return erabId
  **/
  @ApiModelProperty(required = true, value = "The attribute that uniquely identifies a Radio Access bearer for specific UE as defined in ETSI TS 136 413 [i.3].")
      @NotNull

    public Integer getErabId() {
    return erabId;
  }

  public void setErabId(Integer erabId) {
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
    RabRelNotificationErabReleaseInfo rabRelNotificationErabReleaseInfo = (RabRelNotificationErabReleaseInfo) o;
    return Objects.equals(this.erabId, rabRelNotificationErabReleaseInfo.erabId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(erabId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabRelNotificationErabReleaseInfo {\n");
    
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
