package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.Ecgi;
import io.swagger.model.MeasRepUeNotificationCarrierAggregationMeasInfo;
import io.swagger.model.MeasRepUeNotificationEutranNeighbourCellMeasInfo;
import io.swagger.model.MeasRepUeNotificationNewRadioMeasInfo;
import io.swagger.model.MeasRepUeNotificationNewRadioMeasNeiInfo;
import io.swagger.model.TimeStamp;
import io.swagger.model.Trigger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasRepUeNotification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeNotification  implements OneOfInlineNotification {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("carrierAggregationMeasInfo")
  @Valid
  private List<MeasRepUeNotificationCarrierAggregationMeasInfo> carrierAggregationMeasInfo = null;

  @JsonProperty("ecgi")
  private Ecgi ecgi = null;

  @JsonProperty("eutranNeighbourCellMeasInfo")
  @Valid
  private List<MeasRepUeNotificationEutranNeighbourCellMeasInfo> eutranNeighbourCellMeasInfo = null;

  @JsonProperty("heightUe")
  private Integer heightUe = null;

  @JsonProperty("newRadioMeasInfo")
  @Valid
  private List<MeasRepUeNotificationNewRadioMeasInfo> newRadioMeasInfo = null;

  @JsonProperty("newRadioMeasNeiInfo")
  @Valid
  private List<MeasRepUeNotificationNewRadioMeasNeiInfo> newRadioMeasNeiInfo = null;

  @JsonProperty("notificationType")
  private String notificationType = null;

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

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  @JsonProperty("trigger")
  private Trigger trigger = null;

  public MeasRepUeNotification associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public MeasRepUeNotification addAssociateIdItem(AssociateId associateIdItem) {
    if (this.associateId == null) {
      this.associateId = new ArrayList<AssociateId>();
    }
    this.associateId.add(associateIdItem);
    return this;
  }

  /**
   * 0 to N identifiers to associate the event for a specific UE or flow.
   * @return associateId
  **/
  @ApiModelProperty(value = "0 to N identifiers to associate the event for a specific UE or flow.")
      @Valid
    public List<AssociateId> getAssociateId() {
    return associateId;
  }

  public void setAssociateId(List<AssociateId> associateId) {
    this.associateId = associateId;
  }

  public MeasRepUeNotification carrierAggregationMeasInfo(List<MeasRepUeNotificationCarrierAggregationMeasInfo> carrierAggregationMeasInfo) {
    this.carrierAggregationMeasInfo = carrierAggregationMeasInfo;
    return this;
  }

  public MeasRepUeNotification addCarrierAggregationMeasInfoItem(MeasRepUeNotificationCarrierAggregationMeasInfo carrierAggregationMeasInfoItem) {
    if (this.carrierAggregationMeasInfo == null) {
      this.carrierAggregationMeasInfo = new ArrayList<MeasRepUeNotificationCarrierAggregationMeasInfo>();
    }
    this.carrierAggregationMeasInfo.add(carrierAggregationMeasInfoItem);
    return this;
  }

  /**
   * This parameter can be repeated to contain information of all the carriers assign for Carrier Aggregation up to M.
   * @return carrierAggregationMeasInfo
  **/
  @ApiModelProperty(value = "This parameter can be repeated to contain information of all the carriers assign for Carrier Aggregation up to M.")
      @Valid
    public List<MeasRepUeNotificationCarrierAggregationMeasInfo> getCarrierAggregationMeasInfo() {
    return carrierAggregationMeasInfo;
  }

  public void setCarrierAggregationMeasInfo(List<MeasRepUeNotificationCarrierAggregationMeasInfo> carrierAggregationMeasInfo) {
    this.carrierAggregationMeasInfo = carrierAggregationMeasInfo;
  }

  public MeasRepUeNotification ecgi(Ecgi ecgi) {
    this.ecgi = ecgi;
    return this;
  }

  /**
   * Get ecgi
   * @return ecgi
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Ecgi getEcgi() {
    return ecgi;
  }

  public void setEcgi(Ecgi ecgi) {
    this.ecgi = ecgi;
  }

  public MeasRepUeNotification eutranNeighbourCellMeasInfo(List<MeasRepUeNotificationEutranNeighbourCellMeasInfo> eutranNeighbourCellMeasInfo) {
    this.eutranNeighbourCellMeasInfo = eutranNeighbourCellMeasInfo;
    return this;
  }

  public MeasRepUeNotification addEutranNeighbourCellMeasInfoItem(MeasRepUeNotificationEutranNeighbourCellMeasInfo eutranNeighbourCellMeasInfoItem) {
    if (this.eutranNeighbourCellMeasInfo == null) {
      this.eutranNeighbourCellMeasInfo = new ArrayList<MeasRepUeNotificationEutranNeighbourCellMeasInfo>();
    }
    this.eutranNeighbourCellMeasInfo.add(eutranNeighbourCellMeasInfoItem);
    return this;
  }

  /**
   * This parameter can be repeated to contain information of all the neighbouring cells up to N.
   * @return eutranNeighbourCellMeasInfo
  **/
  @ApiModelProperty(value = "This parameter can be repeated to contain information of all the neighbouring cells up to N.")
      @Valid
    public List<MeasRepUeNotificationEutranNeighbourCellMeasInfo> getEutranNeighbourCellMeasInfo() {
    return eutranNeighbourCellMeasInfo;
  }

  public void setEutranNeighbourCellMeasInfo(List<MeasRepUeNotificationEutranNeighbourCellMeasInfo> eutranNeighbourCellMeasInfo) {
    this.eutranNeighbourCellMeasInfo = eutranNeighbourCellMeasInfo;
  }

  public MeasRepUeNotification heightUe(Integer heightUe) {
    this.heightUe = heightUe;
    return this;
  }

  /**
   * Indicates height of the UE in meters relative to the sea level as defined in ETSI TS 136.331 [i.7].
   * @return heightUe
  **/
  @ApiModelProperty(value = "Indicates height of the UE in meters relative to the sea level as defined in ETSI TS 136.331 [i.7].")
  
    public Integer getHeightUe() {
    return heightUe;
  }

  public void setHeightUe(Integer heightUe) {
    this.heightUe = heightUe;
  }

  public MeasRepUeNotification newRadioMeasInfo(List<MeasRepUeNotificationNewRadioMeasInfo> newRadioMeasInfo) {
    this.newRadioMeasInfo = newRadioMeasInfo;
    return this;
  }

  public MeasRepUeNotification addNewRadioMeasInfoItem(MeasRepUeNotificationNewRadioMeasInfo newRadioMeasInfoItem) {
    if (this.newRadioMeasInfo == null) {
      this.newRadioMeasInfo = new ArrayList<MeasRepUeNotificationNewRadioMeasInfo>();
    }
    this.newRadioMeasInfo.add(newRadioMeasInfoItem);
    return this;
  }

  /**
   * 5G New Radio secondary serving cells measurement information.
   * @return newRadioMeasInfo
  **/
  @ApiModelProperty(value = "5G New Radio secondary serving cells measurement information.")
      @Valid
    public List<MeasRepUeNotificationNewRadioMeasInfo> getNewRadioMeasInfo() {
    return newRadioMeasInfo;
  }

  public void setNewRadioMeasInfo(List<MeasRepUeNotificationNewRadioMeasInfo> newRadioMeasInfo) {
    this.newRadioMeasInfo = newRadioMeasInfo;
  }

  public MeasRepUeNotification newRadioMeasNeiInfo(List<MeasRepUeNotificationNewRadioMeasNeiInfo> newRadioMeasNeiInfo) {
    this.newRadioMeasNeiInfo = newRadioMeasNeiInfo;
    return this;
  }

  public MeasRepUeNotification addNewRadioMeasNeiInfoItem(MeasRepUeNotificationNewRadioMeasNeiInfo newRadioMeasNeiInfoItem) {
    if (this.newRadioMeasNeiInfo == null) {
      this.newRadioMeasNeiInfo = new ArrayList<MeasRepUeNotificationNewRadioMeasNeiInfo>();
    }
    this.newRadioMeasNeiInfo.add(newRadioMeasNeiInfoItem);
    return this;
  }

  /**
   * Measurement quantities concerning the 5G NR neighbours.
   * @return newRadioMeasNeiInfo
  **/
  @ApiModelProperty(value = "Measurement quantities concerning the 5G NR neighbours.")
      @Valid
    public List<MeasRepUeNotificationNewRadioMeasNeiInfo> getNewRadioMeasNeiInfo() {
    return newRadioMeasNeiInfo;
  }

  public void setNewRadioMeasNeiInfo(List<MeasRepUeNotificationNewRadioMeasNeiInfo> newRadioMeasNeiInfo) {
    this.newRadioMeasNeiInfo = newRadioMeasNeiInfo;
  }

  public MeasRepUeNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Shall be set to \"MeasRepUeNotification\".
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"MeasRepUeNotification\".")
      @NotNull

    public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public MeasRepUeNotification rsrp(Integer rsrp) {
    this.rsrp = rsrp;
    return this;
  }

  /**
   * Reference Signal Received Power as defined in ETSI TS 136 214 [i.5].
   * @return rsrp
  **/
  @ApiModelProperty(required = true, value = "Reference Signal Received Power as defined in ETSI TS 136 214 [i.5].")
      @NotNull

    public Integer getRsrp() {
    return rsrp;
  }

  public void setRsrp(Integer rsrp) {
    this.rsrp = rsrp;
  }

  public MeasRepUeNotification rsrpEx(Integer rsrpEx) {
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

  public MeasRepUeNotification rsrq(Integer rsrq) {
    this.rsrq = rsrq;
    return this;
  }

  /**
   * Reference Signal Received Quality as defined in ETSI TS 136 214 [i.5].
   * @return rsrq
  **/
  @ApiModelProperty(required = true, value = "Reference Signal Received Quality as defined in ETSI TS 136 214 [i.5].")
      @NotNull

    public Integer getRsrq() {
    return rsrq;
  }

  public void setRsrq(Integer rsrq) {
    this.rsrq = rsrq;
  }

  public MeasRepUeNotification rsrqEx(Integer rsrqEx) {
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

  public MeasRepUeNotification sinr(Integer sinr) {
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

  public MeasRepUeNotification timeStamp(TimeStamp timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Get timeStamp
   * @return timeStamp
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TimeStamp getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(TimeStamp timeStamp) {
    this.timeStamp = timeStamp;
  }

  public MeasRepUeNotification trigger(Trigger trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * Get trigger
   * @return trigger
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Trigger getTrigger() {
    return trigger;
  }

  public void setTrigger(Trigger trigger) {
    this.trigger = trigger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasRepUeNotification measRepUeNotification = (MeasRepUeNotification) o;
    return Objects.equals(this.associateId, measRepUeNotification.associateId) &&
        Objects.equals(this.carrierAggregationMeasInfo, measRepUeNotification.carrierAggregationMeasInfo) &&
        Objects.equals(this.ecgi, measRepUeNotification.ecgi) &&
        Objects.equals(this.eutranNeighbourCellMeasInfo, measRepUeNotification.eutranNeighbourCellMeasInfo) &&
        Objects.equals(this.heightUe, measRepUeNotification.heightUe) &&
        Objects.equals(this.newRadioMeasInfo, measRepUeNotification.newRadioMeasInfo) &&
        Objects.equals(this.newRadioMeasNeiInfo, measRepUeNotification.newRadioMeasNeiInfo) &&
        Objects.equals(this.notificationType, measRepUeNotification.notificationType) &&
        Objects.equals(this.rsrp, measRepUeNotification.rsrp) &&
        Objects.equals(this.rsrpEx, measRepUeNotification.rsrpEx) &&
        Objects.equals(this.rsrq, measRepUeNotification.rsrq) &&
        Objects.equals(this.rsrqEx, measRepUeNotification.rsrqEx) &&
        Objects.equals(this.sinr, measRepUeNotification.sinr) &&
        Objects.equals(this.timeStamp, measRepUeNotification.timeStamp) &&
        Objects.equals(this.trigger, measRepUeNotification.trigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, carrierAggregationMeasInfo, ecgi, eutranNeighbourCellMeasInfo, heightUe, newRadioMeasInfo, newRadioMeasNeiInfo, notificationType, rsrp, rsrpEx, rsrq, rsrqEx, sinr, timeStamp, trigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeNotification {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    carrierAggregationMeasInfo: ").append(toIndentedString(carrierAggregationMeasInfo)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    eutranNeighbourCellMeasInfo: ").append(toIndentedString(eutranNeighbourCellMeasInfo)).append("\n");
    sb.append("    heightUe: ").append(toIndentedString(heightUe)).append("\n");
    sb.append("    newRadioMeasInfo: ").append(toIndentedString(newRadioMeasInfo)).append("\n");
    sb.append("    newRadioMeasNeiInfo: ").append(toIndentedString(newRadioMeasNeiInfo)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    rsrp: ").append(toIndentedString(rsrp)).append("\n");
    sb.append("    rsrpEx: ").append(toIndentedString(rsrpEx)).append("\n");
    sb.append("    rsrq: ").append(toIndentedString(rsrq)).append("\n");
    sb.append("    rsrqEx: ").append(toIndentedString(rsrqEx)).append("\n");
    sb.append("    sinr: ").append(toIndentedString(sinr)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
