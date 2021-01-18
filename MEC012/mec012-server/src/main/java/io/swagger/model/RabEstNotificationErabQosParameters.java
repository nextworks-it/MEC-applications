package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RabEstNotificationErabQosParametersQosInformation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QoS parameters for the E-RAB as defined below.
 */
@ApiModel(description = "QoS parameters for the E-RAB as defined below.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabEstNotificationErabQosParameters   {
  @JsonProperty("qci")
  private Integer qci = null;

  @JsonProperty("qosInformation")
  private RabEstNotificationErabQosParametersQosInformation qosInformation = null;

  public RabEstNotificationErabQosParameters qci(Integer qci) {
    this.qci = qci;
    return this;
  }

  /**
   * QoS Class Identifier as defined in ETSI TS 123 401 [i.4].
   * @return qci
  **/
  @ApiModelProperty(required = true, value = "QoS Class Identifier as defined in ETSI TS 123 401 [i.4].")
      @NotNull

    public Integer getQci() {
    return qci;
  }

  public void setQci(Integer qci) {
    this.qci = qci;
  }

  public RabEstNotificationErabQosParameters qosInformation(RabEstNotificationErabQosParametersQosInformation qosInformation) {
    this.qosInformation = qosInformation;
    return this;
  }

  /**
   * Get qosInformation
   * @return qosInformation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public RabEstNotificationErabQosParametersQosInformation getQosInformation() {
    return qosInformation;
  }

  public void setQosInformation(RabEstNotificationErabQosParametersQosInformation qosInformation) {
    this.qosInformation = qosInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabEstNotificationErabQosParameters rabEstNotificationErabQosParameters = (RabEstNotificationErabQosParameters) o;
    return Objects.equals(this.qci, rabEstNotificationErabQosParameters.qci) &&
        Objects.equals(this.qosInformation, rabEstNotificationErabQosParameters.qosInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qci, qosInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabEstNotificationErabQosParameters {\n");
    
    sb.append("    qci: ").append(toIndentedString(qci)).append("\n");
    sb.append("    qosInformation: ").append(toIndentedString(qosInformation)).append("\n");
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
