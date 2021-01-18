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
 * CaReconfNotificationCarrierAggregationMeasInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class CaReconfNotificationCarrierAggregationMeasInfo   {
  @JsonProperty("cellIdNei")
  private String cellIdNei = null;

  @JsonProperty("cellIdSrv")
  private String cellIdSrv = null;

  @JsonProperty("rsrpNei")
  private Integer rsrpNei = null;

  @JsonProperty("rsrpSrv")
  private Integer rsrpSrv = null;

  @JsonProperty("rsrqNei")
  private Integer rsrqNei = null;

  @JsonProperty("rsrqSrv")
  private Integer rsrqSrv = null;

  public CaReconfNotificationCarrierAggregationMeasInfo cellIdNei(String cellIdNei) {
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

  public CaReconfNotificationCarrierAggregationMeasInfo cellIdSrv(String cellIdSrv) {
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

  public CaReconfNotificationCarrierAggregationMeasInfo rsrpNei(Integer rsrpNei) {
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

  public CaReconfNotificationCarrierAggregationMeasInfo rsrpSrv(Integer rsrpSrv) {
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

  public CaReconfNotificationCarrierAggregationMeasInfo rsrqNei(Integer rsrqNei) {
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

  public CaReconfNotificationCarrierAggregationMeasInfo rsrqSrv(Integer rsrqSrv) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaReconfNotificationCarrierAggregationMeasInfo caReconfNotificationCarrierAggregationMeasInfo = (CaReconfNotificationCarrierAggregationMeasInfo) o;
    return Objects.equals(this.cellIdNei, caReconfNotificationCarrierAggregationMeasInfo.cellIdNei) &&
        Objects.equals(this.cellIdSrv, caReconfNotificationCarrierAggregationMeasInfo.cellIdSrv) &&
        Objects.equals(this.rsrpNei, caReconfNotificationCarrierAggregationMeasInfo.rsrpNei) &&
        Objects.equals(this.rsrpSrv, caReconfNotificationCarrierAggregationMeasInfo.rsrpSrv) &&
        Objects.equals(this.rsrqNei, caReconfNotificationCarrierAggregationMeasInfo.rsrqNei) &&
        Objects.equals(this.rsrqSrv, caReconfNotificationCarrierAggregationMeasInfo.rsrqSrv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellIdNei, cellIdSrv, rsrpNei, rsrpSrv, rsrqNei, rsrqSrv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaReconfNotificationCarrierAggregationMeasInfo {\n");
    
    sb.append("    cellIdNei: ").append(toIndentedString(cellIdNei)).append("\n");
    sb.append("    cellIdSrv: ").append(toIndentedString(cellIdSrv)).append("\n");
    sb.append("    rsrpNei: ").append(toIndentedString(rsrpNei)).append("\n");
    sb.append("    rsrpSrv: ").append(toIndentedString(rsrpSrv)).append("\n");
    sb.append("    rsrqNei: ").append(toIndentedString(rsrqNei)).append("\n");
    sb.append("    rsrqSrv: ").append(toIndentedString(rsrqSrv)).append("\n");
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
