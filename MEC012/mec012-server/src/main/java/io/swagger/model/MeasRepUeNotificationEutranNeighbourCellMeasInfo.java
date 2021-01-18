package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Ecgi;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasRepUeNotificationEutranNeighbourCellMeasInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeNotificationEutranNeighbourCellMeasInfo   {
  @JsonProperty("ecgi")
  private Ecgi ecgi = null;

  @JsonProperty("rsrp")
  private Integer rsrp = null;

  @JsonProperty("rsrpEx")
  private Integer rsrpEx = null;

  @JsonProperty("rsrq")
  private Integer rsrq = null;

  @JsonProperty("rsrqEx")
  private Integer rsrqEx = null;

  @JsonProperty("sinr")
  private Integer sinr = null;

  public MeasRepUeNotificationEutranNeighbourCellMeasInfo ecgi(Ecgi ecgi) {
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

  public MeasRepUeNotificationEutranNeighbourCellMeasInfo rsrp(Integer rsrp) {
    this.rsrp = rsrp;
    return this;
  }

  /**
   * Reference Signal Received Power as defined in ETSI TS 136 214 [i.5].
   * @return rsrp
  **/
  @ApiModelProperty(value = "Reference Signal Received Power as defined in ETSI TS 136 214 [i.5].")
  
    public Integer getRsrp() {
    return rsrp;
  }

  public void setRsrp(Integer rsrp) {
    this.rsrp = rsrp;
  }

  public MeasRepUeNotificationEutranNeighbourCellMeasInfo rsrpEx(Integer rsrpEx) {
    this.rsrpEx = rsrpEx;
    return this;
  }

  /**
   * Extended Reference Signal Received Power, with value mapping defined in ETSI TS 136 133 [i.16].
   * @return rsrpEx
  **/
  @ApiModelProperty(value = "Extended Reference Signal Received Power, with value mapping defined in ETSI TS 136 133 [i.16].")
  
    public Integer getRsrpEx() {
    return rsrpEx;
  }

  public void setRsrpEx(Integer rsrpEx) {
    this.rsrpEx = rsrpEx;
  }

  public MeasRepUeNotificationEutranNeighbourCellMeasInfo rsrq(Integer rsrq) {
    this.rsrq = rsrq;
    return this;
  }

  /**
   * Reference Signal Received Quality as defined in ETSI TS 136 214 [i.5].
   * @return rsrq
  **/
  @ApiModelProperty(value = "Reference Signal Received Quality as defined in ETSI TS 136 214 [i.5].")
  
    public Integer getRsrq() {
    return rsrq;
  }

  public void setRsrq(Integer rsrq) {
    this.rsrq = rsrq;
  }

  public MeasRepUeNotificationEutranNeighbourCellMeasInfo rsrqEx(Integer rsrqEx) {
    this.rsrqEx = rsrqEx;
    return this;
  }

  /**
   * Extended Reference Signal Received Quality, with value mapping defined in ETSI TS 136 133 [i.16].
   * @return rsrqEx
  **/
  @ApiModelProperty(value = "Extended Reference Signal Received Quality, with value mapping defined in ETSI TS 136 133 [i.16].")
  
    public Integer getRsrqEx() {
    return rsrqEx;
  }

  public void setRsrqEx(Integer rsrqEx) {
    this.rsrqEx = rsrqEx;
  }

  public MeasRepUeNotificationEutranNeighbourCellMeasInfo sinr(Integer sinr) {
    this.sinr = sinr;
    return this;
  }

  /**
   * Reference Signal \"Signal to Interference plus Noise Ratio\", with value mapping defined in ETSI TS 136 133 [i.16].
   * @return sinr
  **/
  @ApiModelProperty(value = "Reference Signal \"Signal to Interference plus Noise Ratio\", with value mapping defined in ETSI TS 136 133 [i.16].")
  
    public Integer getSinr() {
    return sinr;
  }

  public void setSinr(Integer sinr) {
    this.sinr = sinr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasRepUeNotificationEutranNeighbourCellMeasInfo measRepUeNotificationEutranNeighbourCellMeasInfo = (MeasRepUeNotificationEutranNeighbourCellMeasInfo) o;
    return Objects.equals(this.ecgi, measRepUeNotificationEutranNeighbourCellMeasInfo.ecgi) &&
        Objects.equals(this.rsrp, measRepUeNotificationEutranNeighbourCellMeasInfo.rsrp) &&
        Objects.equals(this.rsrpEx, measRepUeNotificationEutranNeighbourCellMeasInfo.rsrpEx) &&
        Objects.equals(this.rsrq, measRepUeNotificationEutranNeighbourCellMeasInfo.rsrq) &&
        Objects.equals(this.rsrqEx, measRepUeNotificationEutranNeighbourCellMeasInfo.rsrqEx) &&
        Objects.equals(this.sinr, measRepUeNotificationEutranNeighbourCellMeasInfo.sinr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecgi, rsrp, rsrpEx, rsrq, rsrqEx, sinr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeNotificationEutranNeighbourCellMeasInfo {\n");
    
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    rsrp: ").append(toIndentedString(rsrp)).append("\n");
    sb.append("    rsrpEx: ").append(toIndentedString(rsrpEx)).append("\n");
    sb.append("    rsrq: ").append(toIndentedString(rsrq)).append("\n");
    sb.append("    rsrqEx: ").append(toIndentedString(rsrqEx)).append("\n");
    sb.append("    sinr: ").append(toIndentedString(sinr)).append("\n");
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
