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
 * The QoS information for the E-RAB.
 */
@ApiModel(description = "The QoS information for the E-RAB.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabEstNotificationErabQosParametersQosInformation   {
  @JsonProperty("erabGbrDl")
  private Integer erabGbrDl = null;

  @JsonProperty("erabGbrUl")
  private Integer erabGbrUl = null;

  @JsonProperty("erabMbrDl")
  private Integer erabMbrDl = null;

  @JsonProperty("erabMbrUl")
  private Integer erabMbrUl = null;

  public RabEstNotificationErabQosParametersQosInformation erabGbrDl(Integer erabGbrDl) {
    this.erabGbrDl = erabGbrDl;
    return this;
  }

  /**
   * This attribute indicates the guaranteed downlink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.
   * @return erabGbrDl
  **/
  @ApiModelProperty(required = true, value = "This attribute indicates the guaranteed downlink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.")
      @NotNull

    public Integer getErabGbrDl() {
    return erabGbrDl;
  }

  public void setErabGbrDl(Integer erabGbrDl) {
    this.erabGbrDl = erabGbrDl;
  }

  public RabEstNotificationErabQosParametersQosInformation erabGbrUl(Integer erabGbrUl) {
    this.erabGbrUl = erabGbrUl;
    return this;
  }

  /**
   * This attribute indicates the guaranteed uplink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.
   * @return erabGbrUl
  **/
  @ApiModelProperty(required = true, value = "This attribute indicates the guaranteed uplink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.")
      @NotNull

    public Integer getErabGbrUl() {
    return erabGbrUl;
  }

  public void setErabGbrUl(Integer erabGbrUl) {
    this.erabGbrUl = erabGbrUl;
  }

  public RabEstNotificationErabQosParametersQosInformation erabMbrDl(Integer erabMbrDl) {
    this.erabMbrDl = erabMbrDl;
    return this;
  }

  /**
   * This attribute indicates the maximum downlink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.
   * @return erabMbrDl
  **/
  @ApiModelProperty(required = true, value = "This attribute indicates the maximum downlink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.")
      @NotNull

    public Integer getErabMbrDl() {
    return erabMbrDl;
  }

  public void setErabMbrDl(Integer erabMbrDl) {
    this.erabMbrDl = erabMbrDl;
  }

  public RabEstNotificationErabQosParametersQosInformation erabMbrUl(Integer erabMbrUl) {
    this.erabMbrUl = erabMbrUl;
    return this;
  }

  /**
   * This attribute indicates the maximum uplink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.
   * @return erabMbrUl
  **/
  @ApiModelProperty(required = true, value = "This attribute indicates the maximum uplink E-RAB Bit Rate as defined in ETSI TS 123 401 [i.4] for this bearer.")
      @NotNull

    public Integer getErabMbrUl() {
    return erabMbrUl;
  }

  public void setErabMbrUl(Integer erabMbrUl) {
    this.erabMbrUl = erabMbrUl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabEstNotificationErabQosParametersQosInformation rabEstNotificationErabQosParametersQosInformation = (RabEstNotificationErabQosParametersQosInformation) o;
    return Objects.equals(this.erabGbrDl, rabEstNotificationErabQosParametersQosInformation.erabGbrDl) &&
        Objects.equals(this.erabGbrUl, rabEstNotificationErabQosParametersQosInformation.erabGbrUl) &&
        Objects.equals(this.erabMbrDl, rabEstNotificationErabQosParametersQosInformation.erabMbrDl) &&
        Objects.equals(this.erabMbrUl, rabEstNotificationErabQosParametersQosInformation.erabMbrUl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(erabGbrDl, erabGbrUl, erabMbrDl, erabMbrUl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabEstNotificationErabQosParametersQosInformation {\n");
    
    sb.append("    erabGbrDl: ").append(toIndentedString(erabGbrDl)).append("\n");
    sb.append("    erabGbrUl: ").append(toIndentedString(erabGbrUl)).append("\n");
    sb.append("    erabMbrDl: ").append(toIndentedString(erabMbrDl)).append("\n");
    sb.append("    erabMbrUl: ").append(toIndentedString(erabMbrUl)).append("\n");
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
