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
 * MeasRepUeNotificationCarrierAggregationMeasInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeNotificationCarrierAggregationMeasInfo   {
  @JsonProperty("cellIdNei")
  private String cellIdNei = null;

  @JsonProperty("cellIdSrv")
  private String cellIdSrv = null;

  @JsonProperty("rsrpNei")
  private Integer rsrpNei = null;

  @JsonProperty("rsrpNeiEx")
  private Integer rsrpNeiEx = null;

  @JsonProperty("rsrpSrv")
  private Integer rsrpSrv = null;

  @JsonProperty("rsrpSrvEx")
  private Integer rsrpSrvEx = null;

  @JsonProperty("rsrqNei")
  private Integer rsrqNei = null;

  @JsonProperty("rsrqNeiEx")
  private Integer rsrqNeiEx = null;

  @JsonProperty("rsrqSrv")
  private Integer rsrqSrv = null;

  @JsonProperty("rsrqSrvEx")
  private Integer rsrqSrvEx = null;

  @JsonProperty("sinrNei")
  private Integer sinrNei = null;

  @JsonProperty("sinrSrv")
  private Integer sinrSrv = null;

  public MeasRepUeNotificationCarrierAggregationMeasInfo cellIdNei(String cellIdNei) {
    this.cellIdNei = cellIdNei;
    return this;
  }

  /**
   * Get cellIdNei
   * @return cellIdNei
  **/
  @ApiModelProperty(value = "")
  
    public String getCellIdNei() {
    return cellIdNei;
  }

  public void setCellIdNei(String cellIdNei) {
    this.cellIdNei = cellIdNei;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo cellIdSrv(String cellIdSrv) {
    this.cellIdSrv = cellIdSrv;
    return this;
  }

  /**
   * Get cellIdSrv
   * @return cellIdSrv
  **/
  @ApiModelProperty(value = "")
  
    public String getCellIdSrv() {
    return cellIdSrv;
  }

  public void setCellIdSrv(String cellIdSrv) {
    this.cellIdSrv = cellIdSrv;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo rsrpNei(Integer rsrpNei) {
    this.rsrpNei = rsrpNei;
    return this;
  }

  /**
   * Reference Signal Received Power as defined in ETSI TS 136 214 [i.5].
   * @return rsrpNei
  **/
  @ApiModelProperty(value = "Reference Signal Received Power as defined in ETSI TS 136 214 [i.5].")
  
    public Integer getRsrpNei() {
    return rsrpNei;
  }

  public void setRsrpNei(Integer rsrpNei) {
    this.rsrpNei = rsrpNei;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo rsrpNeiEx(Integer rsrpNeiEx) {
    this.rsrpNeiEx = rsrpNeiEx;
    return this;
  }

  /**
   * Extended Reference Signal Received Power, with value mapping defined in ETSI TS 136 133 [i.16].
   * @return rsrpNeiEx
  **/
  @ApiModelProperty(value = "Extended Reference Signal Received Power, with value mapping defined in ETSI TS 136 133 [i.16].")
  
    public Integer getRsrpNeiEx() {
    return rsrpNeiEx;
  }

  public void setRsrpNeiEx(Integer rsrpNeiEx) {
    this.rsrpNeiEx = rsrpNeiEx;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo rsrpSrv(Integer rsrpSrv) {
    this.rsrpSrv = rsrpSrv;
    return this;
  }

  /**
   * Reference Signal Received Power as defined in ETSI TS 136 214 [i.5].
   * @return rsrpSrv
  **/
  @ApiModelProperty(value = "Reference Signal Received Power as defined in ETSI TS 136 214 [i.5].")
  
    public Integer getRsrpSrv() {
    return rsrpSrv;
  }

  public void setRsrpSrv(Integer rsrpSrv) {
    this.rsrpSrv = rsrpSrv;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo rsrpSrvEx(Integer rsrpSrvEx) {
    this.rsrpSrvEx = rsrpSrvEx;
    return this;
  }

  /**
   * Extended Reference Signal Received Power, with value mapping defined in ETSI TS 136 133 [i.16].
   * @return rsrpSrvEx
  **/
  @ApiModelProperty(value = "Extended Reference Signal Received Power, with value mapping defined in ETSI TS 136 133 [i.16].")
  
    public Integer getRsrpSrvEx() {
    return rsrpSrvEx;
  }

  public void setRsrpSrvEx(Integer rsrpSrvEx) {
    this.rsrpSrvEx = rsrpSrvEx;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo rsrqNei(Integer rsrqNei) {
    this.rsrqNei = rsrqNei;
    return this;
  }

  /**
   * Reference Signal Received Quality as defined in ETSI TS 136 214 [i.5].
   * @return rsrqNei
  **/
  @ApiModelProperty(value = "Reference Signal Received Quality as defined in ETSI TS 136 214 [i.5].")
  
    public Integer getRsrqNei() {
    return rsrqNei;
  }

  public void setRsrqNei(Integer rsrqNei) {
    this.rsrqNei = rsrqNei;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo rsrqNeiEx(Integer rsrqNeiEx) {
    this.rsrqNeiEx = rsrqNeiEx;
    return this;
  }

  /**
   * Extended Reference Signal Received Quality, with value mapping defined in ETSI TS 136 133 [i.16].
   * @return rsrqNeiEx
  **/
  @ApiModelProperty(value = "Extended Reference Signal Received Quality, with value mapping defined in ETSI TS 136 133 [i.16].")
  
    public Integer getRsrqNeiEx() {
    return rsrqNeiEx;
  }

  public void setRsrqNeiEx(Integer rsrqNeiEx) {
    this.rsrqNeiEx = rsrqNeiEx;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo rsrqSrv(Integer rsrqSrv) {
    this.rsrqSrv = rsrqSrv;
    return this;
  }

  /**
   * Reference Signal Received Quality as defined in ETSI TS 136 214 [i.5].
   * @return rsrqSrv
  **/
  @ApiModelProperty(value = "Reference Signal Received Quality as defined in ETSI TS 136 214 [i.5].")
  
    public Integer getRsrqSrv() {
    return rsrqSrv;
  }

  public void setRsrqSrv(Integer rsrqSrv) {
    this.rsrqSrv = rsrqSrv;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo rsrqSrvEx(Integer rsrqSrvEx) {
    this.rsrqSrvEx = rsrqSrvEx;
    return this;
  }

  /**
   * Extended Reference Signal Received Quality, with value mapping defined in ETSI TS 136 133 [i.16].
   * @return rsrqSrvEx
  **/
  @ApiModelProperty(value = "Extended Reference Signal Received Quality, with value mapping defined in ETSI TS 136 133 [i.16].")
  
    public Integer getRsrqSrvEx() {
    return rsrqSrvEx;
  }

  public void setRsrqSrvEx(Integer rsrqSrvEx) {
    this.rsrqSrvEx = rsrqSrvEx;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo sinrNei(Integer sinrNei) {
    this.sinrNei = sinrNei;
    return this;
  }

  /**
   * Reference Signal \"Signal to Interference plus Noise Ratio\", with value mapping defined in ETSI TS 136 133 [i.16].
   * @return sinrNei
  **/
  @ApiModelProperty(value = "Reference Signal \"Signal to Interference plus Noise Ratio\", with value mapping defined in ETSI TS 136 133 [i.16].")
  
    public Integer getSinrNei() {
    return sinrNei;
  }

  public void setSinrNei(Integer sinrNei) {
    this.sinrNei = sinrNei;
  }

  public MeasRepUeNotificationCarrierAggregationMeasInfo sinrSrv(Integer sinrSrv) {
    this.sinrSrv = sinrSrv;
    return this;
  }

  /**
   * Reference Signal \"Signal to Interference plus Noise Ratio\", with value mapping defined in ETSI TS 136 133 [i.16].
   * @return sinrSrv
  **/
  @ApiModelProperty(value = "Reference Signal \"Signal to Interference plus Noise Ratio\", with value mapping defined in ETSI TS 136 133 [i.16].")
  
    public Integer getSinrSrv() {
    return sinrSrv;
  }

  public void setSinrSrv(Integer sinrSrv) {
    this.sinrSrv = sinrSrv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasRepUeNotificationCarrierAggregationMeasInfo measRepUeNotificationCarrierAggregationMeasInfo = (MeasRepUeNotificationCarrierAggregationMeasInfo) o;
    return Objects.equals(this.cellIdNei, measRepUeNotificationCarrierAggregationMeasInfo.cellIdNei) &&
        Objects.equals(this.cellIdSrv, measRepUeNotificationCarrierAggregationMeasInfo.cellIdSrv) &&
        Objects.equals(this.rsrpNei, measRepUeNotificationCarrierAggregationMeasInfo.rsrpNei) &&
        Objects.equals(this.rsrpNeiEx, measRepUeNotificationCarrierAggregationMeasInfo.rsrpNeiEx) &&
        Objects.equals(this.rsrpSrv, measRepUeNotificationCarrierAggregationMeasInfo.rsrpSrv) &&
        Objects.equals(this.rsrpSrvEx, measRepUeNotificationCarrierAggregationMeasInfo.rsrpSrvEx) &&
        Objects.equals(this.rsrqNei, measRepUeNotificationCarrierAggregationMeasInfo.rsrqNei) &&
        Objects.equals(this.rsrqNeiEx, measRepUeNotificationCarrierAggregationMeasInfo.rsrqNeiEx) &&
        Objects.equals(this.rsrqSrv, measRepUeNotificationCarrierAggregationMeasInfo.rsrqSrv) &&
        Objects.equals(this.rsrqSrvEx, measRepUeNotificationCarrierAggregationMeasInfo.rsrqSrvEx) &&
        Objects.equals(this.sinrNei, measRepUeNotificationCarrierAggregationMeasInfo.sinrNei) &&
        Objects.equals(this.sinrSrv, measRepUeNotificationCarrierAggregationMeasInfo.sinrSrv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellIdNei, cellIdSrv, rsrpNei, rsrpNeiEx, rsrpSrv, rsrpSrvEx, rsrqNei, rsrqNeiEx, rsrqSrv, rsrqSrvEx, sinrNei, sinrSrv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeNotificationCarrierAggregationMeasInfo {\n");
    
    sb.append("    cellIdNei: ").append(toIndentedString(cellIdNei)).append("\n");
    sb.append("    cellIdSrv: ").append(toIndentedString(cellIdSrv)).append("\n");
    sb.append("    rsrpNei: ").append(toIndentedString(rsrpNei)).append("\n");
    sb.append("    rsrpNeiEx: ").append(toIndentedString(rsrpNeiEx)).append("\n");
    sb.append("    rsrpSrv: ").append(toIndentedString(rsrpSrv)).append("\n");
    sb.append("    rsrpSrvEx: ").append(toIndentedString(rsrpSrvEx)).append("\n");
    sb.append("    rsrqNei: ").append(toIndentedString(rsrqNei)).append("\n");
    sb.append("    rsrqNeiEx: ").append(toIndentedString(rsrqNeiEx)).append("\n");
    sb.append("    rsrqSrv: ").append(toIndentedString(rsrqSrv)).append("\n");
    sb.append("    rsrqSrvEx: ").append(toIndentedString(rsrqSrvEx)).append("\n");
    sb.append("    sinrNei: ").append(toIndentedString(sinrNei)).append("\n");
    sb.append("    sinrSrv: ").append(toIndentedString(sinrSrv)).append("\n");
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
