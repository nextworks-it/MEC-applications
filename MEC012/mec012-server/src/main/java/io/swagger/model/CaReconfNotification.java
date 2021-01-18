package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.CaReconfNotificationCarrierAggregationMeasInfo;
import io.swagger.model.CaReconfNotificationSecondaryCellAdd;
import io.swagger.model.Ecgi;
import io.swagger.model.TimeStamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaReconfNotification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class CaReconfNotification  implements OneOfInlineNotification {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("carrierAggregationMeasInfo")
  @Valid
  private List<CaReconfNotificationCarrierAggregationMeasInfo> carrierAggregationMeasInfo = null;

  @JsonProperty("ecgi")
  private Ecgi ecgi = null;

  @JsonProperty("notificationType")
  private String notificationType = null;

  @JsonProperty("secondaryCellAdd")
  @Valid
  private List<CaReconfNotificationSecondaryCellAdd> secondaryCellAdd = null;

  @JsonProperty("secondaryCellRemove")
  @Valid
  private List<CaReconfNotificationSecondaryCellAdd> secondaryCellRemove = null;

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  public CaReconfNotification associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public CaReconfNotification addAssociateIdItem(AssociateId associateIdItem) {
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

  public CaReconfNotification carrierAggregationMeasInfo(List<CaReconfNotificationCarrierAggregationMeasInfo> carrierAggregationMeasInfo) {
    this.carrierAggregationMeasInfo = carrierAggregationMeasInfo;
    return this;
  }

  public CaReconfNotification addCarrierAggregationMeasInfoItem(CaReconfNotificationCarrierAggregationMeasInfo carrierAggregationMeasInfoItem) {
    if (this.carrierAggregationMeasInfo == null) {
      this.carrierAggregationMeasInfo = new ArrayList<CaReconfNotificationCarrierAggregationMeasInfo>();
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
    public List<CaReconfNotificationCarrierAggregationMeasInfo> getCarrierAggregationMeasInfo() {
    return carrierAggregationMeasInfo;
  }

  public void setCarrierAggregationMeasInfo(List<CaReconfNotificationCarrierAggregationMeasInfo> carrierAggregationMeasInfo) {
    this.carrierAggregationMeasInfo = carrierAggregationMeasInfo;
  }

  public CaReconfNotification ecgi(Ecgi ecgi) {
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

  public CaReconfNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Shall be set to \"CaReConfNotification\".
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"CaReConfNotification\".")
      @NotNull

    public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public CaReconfNotification secondaryCellAdd(List<CaReconfNotificationSecondaryCellAdd> secondaryCellAdd) {
    this.secondaryCellAdd = secondaryCellAdd;
    return this;
  }

  public CaReconfNotification addSecondaryCellAddItem(CaReconfNotificationSecondaryCellAdd secondaryCellAddItem) {
    if (this.secondaryCellAdd == null) {
      this.secondaryCellAdd = new ArrayList<CaReconfNotificationSecondaryCellAdd>();
    }
    this.secondaryCellAdd.add(secondaryCellAddItem);
    return this;
  }

  /**
   * Get secondaryCellAdd
   * @return secondaryCellAdd
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<CaReconfNotificationSecondaryCellAdd> getSecondaryCellAdd() {
    return secondaryCellAdd;
  }

  public void setSecondaryCellAdd(List<CaReconfNotificationSecondaryCellAdd> secondaryCellAdd) {
    this.secondaryCellAdd = secondaryCellAdd;
  }

  public CaReconfNotification secondaryCellRemove(List<CaReconfNotificationSecondaryCellAdd> secondaryCellRemove) {
    this.secondaryCellRemove = secondaryCellRemove;
    return this;
  }

  public CaReconfNotification addSecondaryCellRemoveItem(CaReconfNotificationSecondaryCellAdd secondaryCellRemoveItem) {
    if (this.secondaryCellRemove == null) {
      this.secondaryCellRemove = new ArrayList<CaReconfNotificationSecondaryCellAdd>();
    }
    this.secondaryCellRemove.add(secondaryCellRemoveItem);
    return this;
  }

  /**
   * Get secondaryCellRemove
   * @return secondaryCellRemove
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<CaReconfNotificationSecondaryCellAdd> getSecondaryCellRemove() {
    return secondaryCellRemove;
  }

  public void setSecondaryCellRemove(List<CaReconfNotificationSecondaryCellAdd> secondaryCellRemove) {
    this.secondaryCellRemove = secondaryCellRemove;
  }

  public CaReconfNotification timeStamp(TimeStamp timeStamp) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaReconfNotification caReconfNotification = (CaReconfNotification) o;
    return Objects.equals(this.associateId, caReconfNotification.associateId) &&
        Objects.equals(this.carrierAggregationMeasInfo, caReconfNotification.carrierAggregationMeasInfo) &&
        Objects.equals(this.ecgi, caReconfNotification.ecgi) &&
        Objects.equals(this.notificationType, caReconfNotification.notificationType) &&
        Objects.equals(this.secondaryCellAdd, caReconfNotification.secondaryCellAdd) &&
        Objects.equals(this.secondaryCellRemove, caReconfNotification.secondaryCellRemove) &&
        Objects.equals(this.timeStamp, caReconfNotification.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, carrierAggregationMeasInfo, ecgi, notificationType, secondaryCellAdd, secondaryCellRemove, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaReconfNotification {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    carrierAggregationMeasInfo: ").append(toIndentedString(carrierAggregationMeasInfo)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    secondaryCellAdd: ").append(toIndentedString(secondaryCellAdd)).append("\n");
    sb.append("    secondaryCellRemove: ").append(toIndentedString(secondaryCellRemove)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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
