package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.Ecgi;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * L2MeasCellUEInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class L2MeasCellUEInfo   {
  @JsonProperty("associateId")
  private AssociateId associateId = null;

  @JsonProperty("dl_gbr_data_volume_ue")
  private Integer dlGbrDataVolumeUe = null;

  @JsonProperty("dl_gbr_delay_ue")
  private Integer dlGbrDelayUe = null;

  @JsonProperty("dl_gbr_pdr_ue")
  private Integer dlGbrPdrUe = null;

  @JsonProperty("dl_gbr_throughput_ue")
  private Integer dlGbrThroughputUe = null;

  @JsonProperty("dl_nongbr_data_volume_ue")
  private Integer dlNongbrDataVolumeUe = null;

  @JsonProperty("dl_nongbr_delay_ue")
  private Integer dlNongbrDelayUe = null;

  @JsonProperty("dl_nongbr_pdr_ue")
  private Integer dlNongbrPdrUe = null;

  @JsonProperty("dl_nongbr_throughput_ue")
  private Integer dlNongbrThroughputUe = null;

  @JsonProperty("ecgi")
  private Ecgi ecgi = null;

  @JsonProperty("ul_gbr_data_volume_ue")
  private Integer ulGbrDataVolumeUe = null;

  @JsonProperty("ul_gbr_delay_ue")
  private Integer ulGbrDelayUe = null;

  @JsonProperty("ul_gbr_pdr_ue")
  private Integer ulGbrPdrUe = null;

  @JsonProperty("ul_gbr_throughput_ue")
  private Integer ulGbrThroughputUe = null;

  @JsonProperty("ul_nongbr_data_volume_ue")
  private Integer ulNongbrDataVolumeUe = null;

  @JsonProperty("ul_nongbr_delay_ue")
  private Integer ulNongbrDelayUe = null;

  @JsonProperty("ul_nongbr_pdr_ue")
  private Integer ulNongbrPdrUe = null;

  @JsonProperty("ul_nongbr_throughput_ue")
  private Integer ulNongbrThroughputUe = null;

  public L2MeasCellUEInfo associateId(AssociateId associateId) {
    this.associateId = associateId;
    return this;
  }

  /**
   * Get associateId
   * @return associateId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AssociateId getAssociateId() {
    return associateId;
  }

  public void setAssociateId(AssociateId associateId) {
    this.associateId = associateId;
  }

  public L2MeasCellUEInfo dlGbrDataVolumeUe(Integer dlGbrDataVolumeUe) {
    this.dlGbrDataVolumeUe = dlGbrDataVolumeUe;
    return this;
  }

  /**
   * It indicates the data volume of the downlink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return dlGbrDataVolumeUe
  **/
  @ApiModelProperty(value = "It indicates the data volume of the downlink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getDlGbrDataVolumeUe() {
    return dlGbrDataVolumeUe;
  }

  public void setDlGbrDataVolumeUe(Integer dlGbrDataVolumeUe) {
    this.dlGbrDataVolumeUe = dlGbrDataVolumeUe;
  }

  public L2MeasCellUEInfo dlGbrDelayUe(Integer dlGbrDelayUe) {
    this.dlGbrDelayUe = dlGbrDelayUe;
    return this;
  }

  /**
   * It indicates the packet delay of the downlink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return dlGbrDelayUe
  **/
  @ApiModelProperty(value = "It indicates the packet delay of the downlink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getDlGbrDelayUe() {
    return dlGbrDelayUe;
  }

  public void setDlGbrDelayUe(Integer dlGbrDelayUe) {
    this.dlGbrDelayUe = dlGbrDelayUe;
  }

  public L2MeasCellUEInfo dlGbrPdrUe(Integer dlGbrPdrUe) {
    this.dlGbrPdrUe = dlGbrPdrUe;
    return this;
  }

  /**
   * It indicates the packet discard rate in percentage of the downlink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return dlGbrPdrUe
  **/
  @ApiModelProperty(value = "It indicates the packet discard rate in percentage of the downlink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getDlGbrPdrUe() {
    return dlGbrPdrUe;
  }

  public void setDlGbrPdrUe(Integer dlGbrPdrUe) {
    this.dlGbrPdrUe = dlGbrPdrUe;
  }

  public L2MeasCellUEInfo dlGbrThroughputUe(Integer dlGbrThroughputUe) {
    this.dlGbrThroughputUe = dlGbrThroughputUe;
    return this;
  }

  /**
   * It indicates the scheduled throughput of the downlink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return dlGbrThroughputUe
  **/
  @ApiModelProperty(value = "It indicates the scheduled throughput of the downlink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getDlGbrThroughputUe() {
    return dlGbrThroughputUe;
  }

  public void setDlGbrThroughputUe(Integer dlGbrThroughputUe) {
    this.dlGbrThroughputUe = dlGbrThroughputUe;
  }

  public L2MeasCellUEInfo dlNongbrDataVolumeUe(Integer dlNongbrDataVolumeUe) {
    this.dlNongbrDataVolumeUe = dlNongbrDataVolumeUe;
    return this;
  }

  /**
   * It indicates the data volume of the downlink non-GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return dlNongbrDataVolumeUe
  **/
  @ApiModelProperty(value = "It indicates the data volume of the downlink non-GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getDlNongbrDataVolumeUe() {
    return dlNongbrDataVolumeUe;
  }

  public void setDlNongbrDataVolumeUe(Integer dlNongbrDataVolumeUe) {
    this.dlNongbrDataVolumeUe = dlNongbrDataVolumeUe;
  }

  public L2MeasCellUEInfo dlNongbrDelayUe(Integer dlNongbrDelayUe) {
    this.dlNongbrDelayUe = dlNongbrDelayUe;
    return this;
  }

  /**
   * It indicates the packet delay of the downlink non-GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return dlNongbrDelayUe
  **/
  @ApiModelProperty(value = "It indicates the packet delay of the downlink non-GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getDlNongbrDelayUe() {
    return dlNongbrDelayUe;
  }

  public void setDlNongbrDelayUe(Integer dlNongbrDelayUe) {
    this.dlNongbrDelayUe = dlNongbrDelayUe;
  }

  public L2MeasCellUEInfo dlNongbrPdrUe(Integer dlNongbrPdrUe) {
    this.dlNongbrPdrUe = dlNongbrPdrUe;
    return this;
  }

  /**
   * It indicates the packet discard rate in percentage of the downlink nonGBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return dlNongbrPdrUe
  **/
  @ApiModelProperty(value = "It indicates the packet discard rate in percentage of the downlink nonGBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getDlNongbrPdrUe() {
    return dlNongbrPdrUe;
  }

  public void setDlNongbrPdrUe(Integer dlNongbrPdrUe) {
    this.dlNongbrPdrUe = dlNongbrPdrUe;
  }

  public L2MeasCellUEInfo dlNongbrThroughputUe(Integer dlNongbrThroughputUe) {
    this.dlNongbrThroughputUe = dlNongbrThroughputUe;
    return this;
  }

  /**
   * It indicates the scheduled throughput of the downlink nonGBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return dlNongbrThroughputUe
  **/
  @ApiModelProperty(value = "It indicates the scheduled throughput of the downlink nonGBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getDlNongbrThroughputUe() {
    return dlNongbrThroughputUe;
  }

  public void setDlNongbrThroughputUe(Integer dlNongbrThroughputUe) {
    this.dlNongbrThroughputUe = dlNongbrThroughputUe;
  }

  public L2MeasCellUEInfo ecgi(Ecgi ecgi) {
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

  public L2MeasCellUEInfo ulGbrDataVolumeUe(Integer ulGbrDataVolumeUe) {
    this.ulGbrDataVolumeUe = ulGbrDataVolumeUe;
    return this;
  }

  /**
   * It indicates the data volume of the uplink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return ulGbrDataVolumeUe
  **/
  @ApiModelProperty(value = "It indicates the data volume of the uplink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getUlGbrDataVolumeUe() {
    return ulGbrDataVolumeUe;
  }

  public void setUlGbrDataVolumeUe(Integer ulGbrDataVolumeUe) {
    this.ulGbrDataVolumeUe = ulGbrDataVolumeUe;
  }

  public L2MeasCellUEInfo ulGbrDelayUe(Integer ulGbrDelayUe) {
    this.ulGbrDelayUe = ulGbrDelayUe;
    return this;
  }

  /**
   * It indicates the packet delay of the uplink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return ulGbrDelayUe
  **/
  @ApiModelProperty(value = "It indicates the packet delay of the uplink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getUlGbrDelayUe() {
    return ulGbrDelayUe;
  }

  public void setUlGbrDelayUe(Integer ulGbrDelayUe) {
    this.ulGbrDelayUe = ulGbrDelayUe;
  }

  public L2MeasCellUEInfo ulGbrPdrUe(Integer ulGbrPdrUe) {
    this.ulGbrPdrUe = ulGbrPdrUe;
    return this;
  }

  /**
   * It indicates the packet discard rate in percentage of the uplink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return ulGbrPdrUe
  **/
  @ApiModelProperty(value = "It indicates the packet discard rate in percentage of the uplink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getUlGbrPdrUe() {
    return ulGbrPdrUe;
  }

  public void setUlGbrPdrUe(Integer ulGbrPdrUe) {
    this.ulGbrPdrUe = ulGbrPdrUe;
  }

  public L2MeasCellUEInfo ulGbrThroughputUe(Integer ulGbrThroughputUe) {
    this.ulGbrThroughputUe = ulGbrThroughputUe;
    return this;
  }

  /**
   * It indicates the scheduled throughput of the uplink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return ulGbrThroughputUe
  **/
  @ApiModelProperty(value = "It indicates the scheduled throughput of the uplink GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getUlGbrThroughputUe() {
    return ulGbrThroughputUe;
  }

  public void setUlGbrThroughputUe(Integer ulGbrThroughputUe) {
    this.ulGbrThroughputUe = ulGbrThroughputUe;
  }

  public L2MeasCellUEInfo ulNongbrDataVolumeUe(Integer ulNongbrDataVolumeUe) {
    this.ulNongbrDataVolumeUe = ulNongbrDataVolumeUe;
    return this;
  }

  /**
   * It indicates the data volume of the uplink non-GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return ulNongbrDataVolumeUe
  **/
  @ApiModelProperty(value = "It indicates the data volume of the uplink non-GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getUlNongbrDataVolumeUe() {
    return ulNongbrDataVolumeUe;
  }

  public void setUlNongbrDataVolumeUe(Integer ulNongbrDataVolumeUe) {
    this.ulNongbrDataVolumeUe = ulNongbrDataVolumeUe;
  }

  public L2MeasCellUEInfo ulNongbrDelayUe(Integer ulNongbrDelayUe) {
    this.ulNongbrDelayUe = ulNongbrDelayUe;
    return this;
  }

  /**
   * It indicates the packet delay of the uplink non-GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return ulNongbrDelayUe
  **/
  @ApiModelProperty(value = "It indicates the packet delay of the uplink non-GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getUlNongbrDelayUe() {
    return ulNongbrDelayUe;
  }

  public void setUlNongbrDelayUe(Integer ulNongbrDelayUe) {
    this.ulNongbrDelayUe = ulNongbrDelayUe;
  }

  public L2MeasCellUEInfo ulNongbrPdrUe(Integer ulNongbrPdrUe) {
    this.ulNongbrPdrUe = ulNongbrPdrUe;
    return this;
  }

  /**
   * It indicates the packet discard rate in percentage of the uplink nonGBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return ulNongbrPdrUe
  **/
  @ApiModelProperty(value = "It indicates the packet discard rate in percentage of the uplink nonGBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getUlNongbrPdrUe() {
    return ulNongbrPdrUe;
  }

  public void setUlNongbrPdrUe(Integer ulNongbrPdrUe) {
    this.ulNongbrPdrUe = ulNongbrPdrUe;
  }

  public L2MeasCellUEInfo ulNongbrThroughputUe(Integer ulNongbrThroughputUe) {
    this.ulNongbrThroughputUe = ulNongbrThroughputUe;
    return this;
  }

  /**
   * It indicates the scheduled throughput of the uplink non-GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].
   * @return ulNongbrThroughputUe
  **/
  @ApiModelProperty(value = "It indicates the scheduled throughput of the uplink non-GBR traffic of a UE, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getUlNongbrThroughputUe() {
    return ulNongbrThroughputUe;
  }

  public void setUlNongbrThroughputUe(Integer ulNongbrThroughputUe) {
    this.ulNongbrThroughputUe = ulNongbrThroughputUe;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L2MeasCellUEInfo l2MeasCellUEInfo = (L2MeasCellUEInfo) o;
    return Objects.equals(this.associateId, l2MeasCellUEInfo.associateId) &&
        Objects.equals(this.dlGbrDataVolumeUe, l2MeasCellUEInfo.dlGbrDataVolumeUe) &&
        Objects.equals(this.dlGbrDelayUe, l2MeasCellUEInfo.dlGbrDelayUe) &&
        Objects.equals(this.dlGbrPdrUe, l2MeasCellUEInfo.dlGbrPdrUe) &&
        Objects.equals(this.dlGbrThroughputUe, l2MeasCellUEInfo.dlGbrThroughputUe) &&
        Objects.equals(this.dlNongbrDataVolumeUe, l2MeasCellUEInfo.dlNongbrDataVolumeUe) &&
        Objects.equals(this.dlNongbrDelayUe, l2MeasCellUEInfo.dlNongbrDelayUe) &&
        Objects.equals(this.dlNongbrPdrUe, l2MeasCellUEInfo.dlNongbrPdrUe) &&
        Objects.equals(this.dlNongbrThroughputUe, l2MeasCellUEInfo.dlNongbrThroughputUe) &&
        Objects.equals(this.ecgi, l2MeasCellUEInfo.ecgi) &&
        Objects.equals(this.ulGbrDataVolumeUe, l2MeasCellUEInfo.ulGbrDataVolumeUe) &&
        Objects.equals(this.ulGbrDelayUe, l2MeasCellUEInfo.ulGbrDelayUe) &&
        Objects.equals(this.ulGbrPdrUe, l2MeasCellUEInfo.ulGbrPdrUe) &&
        Objects.equals(this.ulGbrThroughputUe, l2MeasCellUEInfo.ulGbrThroughputUe) &&
        Objects.equals(this.ulNongbrDataVolumeUe, l2MeasCellUEInfo.ulNongbrDataVolumeUe) &&
        Objects.equals(this.ulNongbrDelayUe, l2MeasCellUEInfo.ulNongbrDelayUe) &&
        Objects.equals(this.ulNongbrPdrUe, l2MeasCellUEInfo.ulNongbrPdrUe) &&
        Objects.equals(this.ulNongbrThroughputUe, l2MeasCellUEInfo.ulNongbrThroughputUe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, dlGbrDataVolumeUe, dlGbrDelayUe, dlGbrPdrUe, dlGbrThroughputUe, dlNongbrDataVolumeUe, dlNongbrDelayUe, dlNongbrPdrUe, dlNongbrThroughputUe, ecgi, ulGbrDataVolumeUe, ulGbrDelayUe, ulGbrPdrUe, ulGbrThroughputUe, ulNongbrDataVolumeUe, ulNongbrDelayUe, ulNongbrPdrUe, ulNongbrThroughputUe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L2MeasCellUEInfo {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    dlGbrDataVolumeUe: ").append(toIndentedString(dlGbrDataVolumeUe)).append("\n");
    sb.append("    dlGbrDelayUe: ").append(toIndentedString(dlGbrDelayUe)).append("\n");
    sb.append("    dlGbrPdrUe: ").append(toIndentedString(dlGbrPdrUe)).append("\n");
    sb.append("    dlGbrThroughputUe: ").append(toIndentedString(dlGbrThroughputUe)).append("\n");
    sb.append("    dlNongbrDataVolumeUe: ").append(toIndentedString(dlNongbrDataVolumeUe)).append("\n");
    sb.append("    dlNongbrDelayUe: ").append(toIndentedString(dlNongbrDelayUe)).append("\n");
    sb.append("    dlNongbrPdrUe: ").append(toIndentedString(dlNongbrPdrUe)).append("\n");
    sb.append("    dlNongbrThroughputUe: ").append(toIndentedString(dlNongbrThroughputUe)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    ulGbrDataVolumeUe: ").append(toIndentedString(ulGbrDataVolumeUe)).append("\n");
    sb.append("    ulGbrDelayUe: ").append(toIndentedString(ulGbrDelayUe)).append("\n");
    sb.append("    ulGbrPdrUe: ").append(toIndentedString(ulGbrPdrUe)).append("\n");
    sb.append("    ulGbrThroughputUe: ").append(toIndentedString(ulGbrThroughputUe)).append("\n");
    sb.append("    ulNongbrDataVolumeUe: ").append(toIndentedString(ulNongbrDataVolumeUe)).append("\n");
    sb.append("    ulNongbrDelayUe: ").append(toIndentedString(ulNongbrDelayUe)).append("\n");
    sb.append("    ulNongbrPdrUe: ").append(toIndentedString(ulNongbrPdrUe)).append("\n");
    sb.append("    ulNongbrThroughputUe: ").append(toIndentedString(ulNongbrThroughputUe)).append("\n");
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
