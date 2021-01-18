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
 * L2MeasCellInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class L2MeasCellInfo   {
  @JsonProperty("dl_gbr_pdr_cell")
  private Integer dlGbrPdrCell = null;

  @JsonProperty("dl_gbr_prb_usage_cell")
  private Integer dlGbrPrbUsageCell = null;

  @JsonProperty("dl_nongbr_pdr_cell")
  private Integer dlNongbrPdrCell = null;

  @JsonProperty("dl_nongbr_prb_usage_cell")
  private Integer dlNongbrPrbUsageCell = null;

  @JsonProperty("dl_total_prb_usage_cell")
  private Integer dlTotalPrbUsageCell = null;

  @JsonProperty("ecgi")
  private Ecgi ecgi = null;

  @JsonProperty("number_of_active_ue_dl_gbr_cell")
  private Integer numberOfActiveUeDlGbrCell = null;

  @JsonProperty("number_of_active_ue_dl_nongbr_cell")
  private Integer numberOfActiveUeDlNongbrCell = null;

  @JsonProperty("number_of_active_ue_ul_gbr_cell")
  private Integer numberOfActiveUeUlGbrCell = null;

  @JsonProperty("number_of_active_ue_ul_nongbr_cell")
  private Integer numberOfActiveUeUlNongbrCell = null;

  @JsonProperty("received_dedicated_preambles_cell")
  private Integer receivedDedicatedPreamblesCell = null;

  @JsonProperty("received_randomly_selected_preambles_high_range_cell")
  private Integer receivedRandomlySelectedPreamblesHighRangeCell = null;

  @JsonProperty("received_randomly_selected_preambles_low_range_cell")
  private Integer receivedRandomlySelectedPreamblesLowRangeCell = null;

  @JsonProperty("ul_gbr_pdr_cell")
  private Integer ulGbrPdrCell = null;

  @JsonProperty("ul_gbr_prb_usage_cell")
  private Integer ulGbrPrbUsageCell = null;

  @JsonProperty("ul_nongbr_pdr_cell")
  private Integer ulNongbrPdrCell = null;

  @JsonProperty("ul_nongbr_prb_usage_cell")
  private Integer ulNongbrPrbUsageCell = null;

  @JsonProperty("ul_total_prb_usage_cell")
  private Integer ulTotalPrbUsageCell = null;

  public L2MeasCellInfo dlGbrPdrCell(Integer dlGbrPdrCell) {
    this.dlGbrPdrCell = dlGbrPdrCell;
    return this;
  }

  /**
   * It indicates the packet discard rate in percentage of the downlink GBR traffic in a cell, as defined in ETSI TS 136 314 [i.11].
   * @return dlGbrPdrCell
  **/
  @ApiModelProperty(value = "It indicates the packet discard rate in percentage of the downlink GBR traffic in a cell, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getDlGbrPdrCell() {
    return dlGbrPdrCell;
  }

  public void setDlGbrPdrCell(Integer dlGbrPdrCell) {
    this.dlGbrPdrCell = dlGbrPdrCell;
  }

  public L2MeasCellInfo dlGbrPrbUsageCell(Integer dlGbrPrbUsageCell) {
    this.dlGbrPrbUsageCell = dlGbrPrbUsageCell;
    return this;
  }

  /**
   * It indicates the PRB usage for downlink GBR traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].
   * @return dlGbrPrbUsageCell
  **/
  @ApiModelProperty(value = "It indicates the PRB usage for downlink GBR traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].")
  
    public Integer getDlGbrPrbUsageCell() {
    return dlGbrPrbUsageCell;
  }

  public void setDlGbrPrbUsageCell(Integer dlGbrPrbUsageCell) {
    this.dlGbrPrbUsageCell = dlGbrPrbUsageCell;
  }

  public L2MeasCellInfo dlNongbrPdrCell(Integer dlNongbrPdrCell) {
    this.dlNongbrPdrCell = dlNongbrPdrCell;
    return this;
  }

  /**
   * It indicates the packet discard rate in percentage of the downlink non-GBR traffic in a cell, as defined in ETSI TS 136 314 [i.11].
   * @return dlNongbrPdrCell
  **/
  @ApiModelProperty(value = "It indicates the packet discard rate in percentage of the downlink non-GBR traffic in a cell, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getDlNongbrPdrCell() {
    return dlNongbrPdrCell;
  }

  public void setDlNongbrPdrCell(Integer dlNongbrPdrCell) {
    this.dlNongbrPdrCell = dlNongbrPdrCell;
  }

  public L2MeasCellInfo dlNongbrPrbUsageCell(Integer dlNongbrPrbUsageCell) {
    this.dlNongbrPrbUsageCell = dlNongbrPrbUsageCell;
    return this;
  }

  /**
   * It indicates (in percentage) the PRB usage for downlink non-GBR traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].
   * @return dlNongbrPrbUsageCell
  **/
  @ApiModelProperty(value = "It indicates (in percentage) the PRB usage for downlink non-GBR traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].")
  
    public Integer getDlNongbrPrbUsageCell() {
    return dlNongbrPrbUsageCell;
  }

  public void setDlNongbrPrbUsageCell(Integer dlNongbrPrbUsageCell) {
    this.dlNongbrPrbUsageCell = dlNongbrPrbUsageCell;
  }

  public L2MeasCellInfo dlTotalPrbUsageCell(Integer dlTotalPrbUsageCell) {
    this.dlTotalPrbUsageCell = dlTotalPrbUsageCell;
    return this;
  }

  /**
   * It indicates (in percentage) the PRB usage for total downlink traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].
   * @return dlTotalPrbUsageCell
  **/
  @ApiModelProperty(value = "It indicates (in percentage) the PRB usage for total downlink traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].")
  
    public Integer getDlTotalPrbUsageCell() {
    return dlTotalPrbUsageCell;
  }

  public void setDlTotalPrbUsageCell(Integer dlTotalPrbUsageCell) {
    this.dlTotalPrbUsageCell = dlTotalPrbUsageCell;
  }

  public L2MeasCellInfo ecgi(Ecgi ecgi) {
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

  public L2MeasCellInfo numberOfActiveUeDlGbrCell(Integer numberOfActiveUeDlGbrCell) {
    this.numberOfActiveUeDlGbrCell = numberOfActiveUeDlGbrCell;
    return this;
  }

  /**
   * It indicates the number of active UEs with downlink GBR traffic, as defined in ETSI TS 136 314 [i.11].
   * @return numberOfActiveUeDlGbrCell
  **/
  @ApiModelProperty(value = "It indicates the number of active UEs with downlink GBR traffic, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getNumberOfActiveUeDlGbrCell() {
    return numberOfActiveUeDlGbrCell;
  }

  public void setNumberOfActiveUeDlGbrCell(Integer numberOfActiveUeDlGbrCell) {
    this.numberOfActiveUeDlGbrCell = numberOfActiveUeDlGbrCell;
  }

  public L2MeasCellInfo numberOfActiveUeDlNongbrCell(Integer numberOfActiveUeDlNongbrCell) {
    this.numberOfActiveUeDlNongbrCell = numberOfActiveUeDlNongbrCell;
    return this;
  }

  /**
   * It indicates the number of active UEs with downlink non-GBR traffic, as defined in ETSI TS 136 314 [i.11].
   * @return numberOfActiveUeDlNongbrCell
  **/
  @ApiModelProperty(value = "It indicates the number of active UEs with downlink non-GBR traffic, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getNumberOfActiveUeDlNongbrCell() {
    return numberOfActiveUeDlNongbrCell;
  }

  public void setNumberOfActiveUeDlNongbrCell(Integer numberOfActiveUeDlNongbrCell) {
    this.numberOfActiveUeDlNongbrCell = numberOfActiveUeDlNongbrCell;
  }

  public L2MeasCellInfo numberOfActiveUeUlGbrCell(Integer numberOfActiveUeUlGbrCell) {
    this.numberOfActiveUeUlGbrCell = numberOfActiveUeUlGbrCell;
    return this;
  }

  /**
   * It indicates the number of active UEs with uplink GBR traffic, as defined in ETSI TS 136 314 [i.11].
   * @return numberOfActiveUeUlGbrCell
  **/
  @ApiModelProperty(value = "It indicates the number of active UEs with uplink GBR traffic, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getNumberOfActiveUeUlGbrCell() {
    return numberOfActiveUeUlGbrCell;
  }

  public void setNumberOfActiveUeUlGbrCell(Integer numberOfActiveUeUlGbrCell) {
    this.numberOfActiveUeUlGbrCell = numberOfActiveUeUlGbrCell;
  }

  public L2MeasCellInfo numberOfActiveUeUlNongbrCell(Integer numberOfActiveUeUlNongbrCell) {
    this.numberOfActiveUeUlNongbrCell = numberOfActiveUeUlNongbrCell;
    return this;
  }

  /**
   * It indicates the number of active UEs with uplink non-GBR traffic, as defined in ETSI TS 136 314 [i.11].
   * @return numberOfActiveUeUlNongbrCell
  **/
  @ApiModelProperty(value = "It indicates the number of active UEs with uplink non-GBR traffic, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getNumberOfActiveUeUlNongbrCell() {
    return numberOfActiveUeUlNongbrCell;
  }

  public void setNumberOfActiveUeUlNongbrCell(Integer numberOfActiveUeUlNongbrCell) {
    this.numberOfActiveUeUlNongbrCell = numberOfActiveUeUlNongbrCell;
  }

  public L2MeasCellInfo receivedDedicatedPreamblesCell(Integer receivedDedicatedPreamblesCell) {
    this.receivedDedicatedPreamblesCell = receivedDedicatedPreamblesCell;
    return this;
  }

  /**
   * It indicates (in percentage) the received dedicated preamples, as defined in ETSI TS 136 314 [i.11].
   * @return receivedDedicatedPreamblesCell
  **/
  @ApiModelProperty(value = "It indicates (in percentage) the received dedicated preamples, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getReceivedDedicatedPreamblesCell() {
    return receivedDedicatedPreamblesCell;
  }

  public void setReceivedDedicatedPreamblesCell(Integer receivedDedicatedPreamblesCell) {
    this.receivedDedicatedPreamblesCell = receivedDedicatedPreamblesCell;
  }

  public L2MeasCellInfo receivedRandomlySelectedPreamblesHighRangeCell(Integer receivedRandomlySelectedPreamblesHighRangeCell) {
    this.receivedRandomlySelectedPreamblesHighRangeCell = receivedRandomlySelectedPreamblesHighRangeCell;
    return this;
  }

  /**
   * It indicates (in percentage) the received randomly selected preambles in the high range, as defined in ETSI TS 136 314 [i.11].
   * @return receivedRandomlySelectedPreamblesHighRangeCell
  **/
  @ApiModelProperty(value = "It indicates (in percentage) the received randomly selected preambles in the high range, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getReceivedRandomlySelectedPreamblesHighRangeCell() {
    return receivedRandomlySelectedPreamblesHighRangeCell;
  }

  public void setReceivedRandomlySelectedPreamblesHighRangeCell(Integer receivedRandomlySelectedPreamblesHighRangeCell) {
    this.receivedRandomlySelectedPreamblesHighRangeCell = receivedRandomlySelectedPreamblesHighRangeCell;
  }

  public L2MeasCellInfo receivedRandomlySelectedPreamblesLowRangeCell(Integer receivedRandomlySelectedPreamblesLowRangeCell) {
    this.receivedRandomlySelectedPreamblesLowRangeCell = receivedRandomlySelectedPreamblesLowRangeCell;
    return this;
  }

  /**
   * It indicates (in percentage) the received randomly selected preambles in the low range, as defined in ETSI TS 136 314 [i.11].
   * @return receivedRandomlySelectedPreamblesLowRangeCell
  **/
  @ApiModelProperty(value = "It indicates (in percentage) the received randomly selected preambles in the low range, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getReceivedRandomlySelectedPreamblesLowRangeCell() {
    return receivedRandomlySelectedPreamblesLowRangeCell;
  }

  public void setReceivedRandomlySelectedPreamblesLowRangeCell(Integer receivedRandomlySelectedPreamblesLowRangeCell) {
    this.receivedRandomlySelectedPreamblesLowRangeCell = receivedRandomlySelectedPreamblesLowRangeCell;
  }

  public L2MeasCellInfo ulGbrPdrCell(Integer ulGbrPdrCell) {
    this.ulGbrPdrCell = ulGbrPdrCell;
    return this;
  }

  /**
   * It indicates the packet discard rate in percentage of the uplink GBR traffic in a cell, as defined in ETSI TS 136 314 [i.11].
   * @return ulGbrPdrCell
  **/
  @ApiModelProperty(value = "It indicates the packet discard rate in percentage of the uplink GBR traffic in a cell, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getUlGbrPdrCell() {
    return ulGbrPdrCell;
  }

  public void setUlGbrPdrCell(Integer ulGbrPdrCell) {
    this.ulGbrPdrCell = ulGbrPdrCell;
  }

  public L2MeasCellInfo ulGbrPrbUsageCell(Integer ulGbrPrbUsageCell) {
    this.ulGbrPrbUsageCell = ulGbrPrbUsageCell;
    return this;
  }

  /**
   * It indicates (in percentage) the PRB usage for uplink GBR traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].
   * @return ulGbrPrbUsageCell
  **/
  @ApiModelProperty(value = "It indicates (in percentage) the PRB usage for uplink GBR traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].")
  
    public Integer getUlGbrPrbUsageCell() {
    return ulGbrPrbUsageCell;
  }

  public void setUlGbrPrbUsageCell(Integer ulGbrPrbUsageCell) {
    this.ulGbrPrbUsageCell = ulGbrPrbUsageCell;
  }

  public L2MeasCellInfo ulNongbrPdrCell(Integer ulNongbrPdrCell) {
    this.ulNongbrPdrCell = ulNongbrPdrCell;
    return this;
  }

  /**
   * It indicates the packet discard rate in percentage of the uplink non-GBR traffic in a cell, as defined in ETSI TS 136 314 [i.11].
   * @return ulNongbrPdrCell
  **/
  @ApiModelProperty(value = "It indicates the packet discard rate in percentage of the uplink non-GBR traffic in a cell, as defined in ETSI TS 136 314 [i.11].")
  
    public Integer getUlNongbrPdrCell() {
    return ulNongbrPdrCell;
  }

  public void setUlNongbrPdrCell(Integer ulNongbrPdrCell) {
    this.ulNongbrPdrCell = ulNongbrPdrCell;
  }

  public L2MeasCellInfo ulNongbrPrbUsageCell(Integer ulNongbrPrbUsageCell) {
    this.ulNongbrPrbUsageCell = ulNongbrPrbUsageCell;
    return this;
  }

  /**
   * It indicates (in percentage) the PRB usage for uplink non-GBR traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].
   * @return ulNongbrPrbUsageCell
  **/
  @ApiModelProperty(value = "It indicates (in percentage) the PRB usage for uplink non-GBR traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].")
  
    public Integer getUlNongbrPrbUsageCell() {
    return ulNongbrPrbUsageCell;
  }

  public void setUlNongbrPrbUsageCell(Integer ulNongbrPrbUsageCell) {
    this.ulNongbrPrbUsageCell = ulNongbrPrbUsageCell;
  }

  public L2MeasCellInfo ulTotalPrbUsageCell(Integer ulTotalPrbUsageCell) {
    this.ulTotalPrbUsageCell = ulTotalPrbUsageCell;
    return this;
  }

  /**
   * It indicates (in percentage) the PRB usage for total uplink traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].
   * @return ulTotalPrbUsageCell
  **/
  @ApiModelProperty(value = "It indicates (in percentage) the PRB usage for total uplink traffic, as defined in ETSI TS 136 314 [i.11] and ETSI TS 136 423 [i.12].")
  
    public Integer getUlTotalPrbUsageCell() {
    return ulTotalPrbUsageCell;
  }

  public void setUlTotalPrbUsageCell(Integer ulTotalPrbUsageCell) {
    this.ulTotalPrbUsageCell = ulTotalPrbUsageCell;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L2MeasCellInfo l2MeasCellInfo = (L2MeasCellInfo) o;
    return Objects.equals(this.dlGbrPdrCell, l2MeasCellInfo.dlGbrPdrCell) &&
        Objects.equals(this.dlGbrPrbUsageCell, l2MeasCellInfo.dlGbrPrbUsageCell) &&
        Objects.equals(this.dlNongbrPdrCell, l2MeasCellInfo.dlNongbrPdrCell) &&
        Objects.equals(this.dlNongbrPrbUsageCell, l2MeasCellInfo.dlNongbrPrbUsageCell) &&
        Objects.equals(this.dlTotalPrbUsageCell, l2MeasCellInfo.dlTotalPrbUsageCell) &&
        Objects.equals(this.ecgi, l2MeasCellInfo.ecgi) &&
        Objects.equals(this.numberOfActiveUeDlGbrCell, l2MeasCellInfo.numberOfActiveUeDlGbrCell) &&
        Objects.equals(this.numberOfActiveUeDlNongbrCell, l2MeasCellInfo.numberOfActiveUeDlNongbrCell) &&
        Objects.equals(this.numberOfActiveUeUlGbrCell, l2MeasCellInfo.numberOfActiveUeUlGbrCell) &&
        Objects.equals(this.numberOfActiveUeUlNongbrCell, l2MeasCellInfo.numberOfActiveUeUlNongbrCell) &&
        Objects.equals(this.receivedDedicatedPreamblesCell, l2MeasCellInfo.receivedDedicatedPreamblesCell) &&
        Objects.equals(this.receivedRandomlySelectedPreamblesHighRangeCell, l2MeasCellInfo.receivedRandomlySelectedPreamblesHighRangeCell) &&
        Objects.equals(this.receivedRandomlySelectedPreamblesLowRangeCell, l2MeasCellInfo.receivedRandomlySelectedPreamblesLowRangeCell) &&
        Objects.equals(this.ulGbrPdrCell, l2MeasCellInfo.ulGbrPdrCell) &&
        Objects.equals(this.ulGbrPrbUsageCell, l2MeasCellInfo.ulGbrPrbUsageCell) &&
        Objects.equals(this.ulNongbrPdrCell, l2MeasCellInfo.ulNongbrPdrCell) &&
        Objects.equals(this.ulNongbrPrbUsageCell, l2MeasCellInfo.ulNongbrPrbUsageCell) &&
        Objects.equals(this.ulTotalPrbUsageCell, l2MeasCellInfo.ulTotalPrbUsageCell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dlGbrPdrCell, dlGbrPrbUsageCell, dlNongbrPdrCell, dlNongbrPrbUsageCell, dlTotalPrbUsageCell, ecgi, numberOfActiveUeDlGbrCell, numberOfActiveUeDlNongbrCell, numberOfActiveUeUlGbrCell, numberOfActiveUeUlNongbrCell, receivedDedicatedPreamblesCell, receivedRandomlySelectedPreamblesHighRangeCell, receivedRandomlySelectedPreamblesLowRangeCell, ulGbrPdrCell, ulGbrPrbUsageCell, ulNongbrPdrCell, ulNongbrPrbUsageCell, ulTotalPrbUsageCell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L2MeasCellInfo {\n");
    
    sb.append("    dlGbrPdrCell: ").append(toIndentedString(dlGbrPdrCell)).append("\n");
    sb.append("    dlGbrPrbUsageCell: ").append(toIndentedString(dlGbrPrbUsageCell)).append("\n");
    sb.append("    dlNongbrPdrCell: ").append(toIndentedString(dlNongbrPdrCell)).append("\n");
    sb.append("    dlNongbrPrbUsageCell: ").append(toIndentedString(dlNongbrPrbUsageCell)).append("\n");
    sb.append("    dlTotalPrbUsageCell: ").append(toIndentedString(dlTotalPrbUsageCell)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    numberOfActiveUeDlGbrCell: ").append(toIndentedString(numberOfActiveUeDlGbrCell)).append("\n");
    sb.append("    numberOfActiveUeDlNongbrCell: ").append(toIndentedString(numberOfActiveUeDlNongbrCell)).append("\n");
    sb.append("    numberOfActiveUeUlGbrCell: ").append(toIndentedString(numberOfActiveUeUlGbrCell)).append("\n");
    sb.append("    numberOfActiveUeUlNongbrCell: ").append(toIndentedString(numberOfActiveUeUlNongbrCell)).append("\n");
    sb.append("    receivedDedicatedPreamblesCell: ").append(toIndentedString(receivedDedicatedPreamblesCell)).append("\n");
    sb.append("    receivedRandomlySelectedPreamblesHighRangeCell: ").append(toIndentedString(receivedRandomlySelectedPreamblesHighRangeCell)).append("\n");
    sb.append("    receivedRandomlySelectedPreamblesLowRangeCell: ").append(toIndentedString(receivedRandomlySelectedPreamblesLowRangeCell)).append("\n");
    sb.append("    ulGbrPdrCell: ").append(toIndentedString(ulGbrPdrCell)).append("\n");
    sb.append("    ulGbrPrbUsageCell: ").append(toIndentedString(ulGbrPrbUsageCell)).append("\n");
    sb.append("    ulNongbrPdrCell: ").append(toIndentedString(ulNongbrPdrCell)).append("\n");
    sb.append("    ulNongbrPrbUsageCell: ").append(toIndentedString(ulNongbrPrbUsageCell)).append("\n");
    sb.append("    ulTotalPrbUsageCell: ").append(toIndentedString(ulTotalPrbUsageCell)).append("\n");
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
