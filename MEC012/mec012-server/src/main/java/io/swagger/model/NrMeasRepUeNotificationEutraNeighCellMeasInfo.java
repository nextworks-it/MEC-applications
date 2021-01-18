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
 * NrMeasRepUeNotificationEutraNeighCellMeasInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class NrMeasRepUeNotificationEutraNeighCellMeasInfo   {
  @JsonProperty("ecgi")
  private Ecgi ecgi = null;

  @JsonProperty("rsrp")
  private Integer rsrp = null;

  @JsonProperty("rsrq")
  private Integer rsrq = null;

  @JsonProperty("sinr")
  private Integer sinr = null;

  public NrMeasRepUeNotificationEutraNeighCellMeasInfo ecgi(Ecgi ecgi) {
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

  public NrMeasRepUeNotificationEutraNeighCellMeasInfo rsrp(Integer rsrp) {
    this.rsrp = rsrp;
    return this;
  }

  /**
   * Reference Signal Received Power as defined in ETSI TS 138 331 [i.13].
   * @return rsrp
  **/
  @ApiModelProperty(value = "Reference Signal Received Power as defined in ETSI TS 138 331 [i.13].")
  
    public Integer getRsrp() {
    return rsrp;
  }

  public void setRsrp(Integer rsrp) {
    this.rsrp = rsrp;
  }

  public NrMeasRepUeNotificationEutraNeighCellMeasInfo rsrq(Integer rsrq) {
    this.rsrq = rsrq;
    return this;
  }

  /**
   * Reference Signal Received Quality as defined in ETSI TS 138 331 [i.13].
   * @return rsrq
  **/
  @ApiModelProperty(value = "Reference Signal Received Quality as defined in ETSI TS 138 331 [i.13].")
  
    public Integer getRsrq() {
    return rsrq;
  }

  public void setRsrq(Integer rsrq) {
    this.rsrq = rsrq;
  }

  public NrMeasRepUeNotificationEutraNeighCellMeasInfo sinr(Integer sinr) {
    this.sinr = sinr;
    return this;
  }

  /**
   * Reference Signal plus Interference Noise Ratio as defined in ETSI TS 138 331 [i.13].
   * @return sinr
  **/
  @ApiModelProperty(value = "Reference Signal plus Interference Noise Ratio as defined in ETSI TS 138 331 [i.13].")
  
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
    NrMeasRepUeNotificationEutraNeighCellMeasInfo nrMeasRepUeNotificationEutraNeighCellMeasInfo = (NrMeasRepUeNotificationEutraNeighCellMeasInfo) o;
    return Objects.equals(this.ecgi, nrMeasRepUeNotificationEutraNeighCellMeasInfo.ecgi) &&
        Objects.equals(this.rsrp, nrMeasRepUeNotificationEutraNeighCellMeasInfo.rsrp) &&
        Objects.equals(this.rsrq, nrMeasRepUeNotificationEutraNeighCellMeasInfo.rsrq) &&
        Objects.equals(this.sinr, nrMeasRepUeNotificationEutraNeighCellMeasInfo.sinr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecgi, rsrp, rsrq, sinr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NrMeasRepUeNotificationEutraNeighCellMeasInfo {\n");
    
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    rsrp: ").append(toIndentedString(rsrp)).append("\n");
    sb.append("    rsrq: ").append(toIndentedString(rsrq)).append("\n");
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
