package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.NrMeasRepUeNotificationEutraNeighCellMeasInfo;
import io.swagger.model.NrMeasRepUeNotificationNrNeighCellMeasInfo;
import io.swagger.model.NrMeasRepUeNotificationServCellMeasInfo;
import io.swagger.model.TimeStamp;
import io.swagger.model.TriggerNr;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NrMeasRepUeNotification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class NrMeasRepUeNotification  implements OneOfInlineNotification {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("eutraNeighCellMeasInfo")
  @Valid
  private List<NrMeasRepUeNotificationEutraNeighCellMeasInfo> eutraNeighCellMeasInfo = null;

  @JsonProperty("notificationType")
  private String notificationType = null;

  @JsonProperty("nrNeighCellMeasInfo")
  @Valid
  private List<NrMeasRepUeNotificationNrNeighCellMeasInfo> nrNeighCellMeasInfo = null;

  @JsonProperty("servCellMeasInfo")
  @Valid
  private List<NrMeasRepUeNotificationServCellMeasInfo> servCellMeasInfo = null;

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  @JsonProperty("triggerNr")
  private TriggerNr triggerNr = null;

  public NrMeasRepUeNotification associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public NrMeasRepUeNotification addAssociateIdItem(AssociateId associateIdItem) {
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

  public NrMeasRepUeNotification eutraNeighCellMeasInfo(List<NrMeasRepUeNotificationEutraNeighCellMeasInfo> eutraNeighCellMeasInfo) {
    this.eutraNeighCellMeasInfo = eutraNeighCellMeasInfo;
    return this;
  }

  public NrMeasRepUeNotification addEutraNeighCellMeasInfoItem(NrMeasRepUeNotificationEutraNeighCellMeasInfo eutraNeighCellMeasInfoItem) {
    if (this.eutraNeighCellMeasInfo == null) {
      this.eutraNeighCellMeasInfo = new ArrayList<NrMeasRepUeNotificationEutraNeighCellMeasInfo>();
    }
    this.eutraNeighCellMeasInfo.add(eutraNeighCellMeasInfoItem);
    return this;
  }

  /**
   * This parameter can be repeated to contain measurement information of all the neighbouring cells up to N. It shall not be included if nrNeighCellMeasInfo is included.
   * @return eutraNeighCellMeasInfo
  **/
  @ApiModelProperty(value = "This parameter can be repeated to contain measurement information of all the neighbouring cells up to N. It shall not be included if nrNeighCellMeasInfo is included.")
      @Valid
    public List<NrMeasRepUeNotificationEutraNeighCellMeasInfo> getEutraNeighCellMeasInfo() {
    return eutraNeighCellMeasInfo;
  }

  public void setEutraNeighCellMeasInfo(List<NrMeasRepUeNotificationEutraNeighCellMeasInfo> eutraNeighCellMeasInfo) {
    this.eutraNeighCellMeasInfo = eutraNeighCellMeasInfo;
  }

  public NrMeasRepUeNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Shall be set to \"NrMeasRepUeNotification\".
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"NrMeasRepUeNotification\".")
      @NotNull

    public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public NrMeasRepUeNotification nrNeighCellMeasInfo(List<NrMeasRepUeNotificationNrNeighCellMeasInfo> nrNeighCellMeasInfo) {
    this.nrNeighCellMeasInfo = nrNeighCellMeasInfo;
    return this;
  }

  public NrMeasRepUeNotification addNrNeighCellMeasInfoItem(NrMeasRepUeNotificationNrNeighCellMeasInfo nrNeighCellMeasInfoItem) {
    if (this.nrNeighCellMeasInfo == null) {
      this.nrNeighCellMeasInfo = new ArrayList<NrMeasRepUeNotificationNrNeighCellMeasInfo>();
    }
    this.nrNeighCellMeasInfo.add(nrNeighCellMeasInfoItem);
    return this;
  }

  /**
   * This parameter can be repeated to contain measurement information of all the neighbouring cells up to N. It shall not be included if eutraNeighCellMeasInfo is included.
   * @return nrNeighCellMeasInfo
  **/
  @ApiModelProperty(value = "This parameter can be repeated to contain measurement information of all the neighbouring cells up to N. It shall not be included if eutraNeighCellMeasInfo is included.")
      @Valid
    public List<NrMeasRepUeNotificationNrNeighCellMeasInfo> getNrNeighCellMeasInfo() {
    return nrNeighCellMeasInfo;
  }

  public void setNrNeighCellMeasInfo(List<NrMeasRepUeNotificationNrNeighCellMeasInfo> nrNeighCellMeasInfo) {
    this.nrNeighCellMeasInfo = nrNeighCellMeasInfo;
  }

  public NrMeasRepUeNotification servCellMeasInfo(List<NrMeasRepUeNotificationServCellMeasInfo> servCellMeasInfo) {
    this.servCellMeasInfo = servCellMeasInfo;
    return this;
  }

  public NrMeasRepUeNotification addServCellMeasInfoItem(NrMeasRepUeNotificationServCellMeasInfo servCellMeasInfoItem) {
    if (this.servCellMeasInfo == null) {
      this.servCellMeasInfo = new ArrayList<NrMeasRepUeNotificationServCellMeasInfo>();
    }
    this.servCellMeasInfo.add(servCellMeasInfoItem);
    return this;
  }

  /**
   * This parameter can be repeated to contain information of all the serving cells up to N.
   * @return servCellMeasInfo
  **/
  @ApiModelProperty(value = "This parameter can be repeated to contain information of all the serving cells up to N.")
      @Valid
    public List<NrMeasRepUeNotificationServCellMeasInfo> getServCellMeasInfo() {
    return servCellMeasInfo;
  }

  public void setServCellMeasInfo(List<NrMeasRepUeNotificationServCellMeasInfo> servCellMeasInfo) {
    this.servCellMeasInfo = servCellMeasInfo;
  }

  public NrMeasRepUeNotification timeStamp(TimeStamp timeStamp) {
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

  public NrMeasRepUeNotification triggerNr(TriggerNr triggerNr) {
    this.triggerNr = triggerNr;
    return this;
  }

  /**
   * Get triggerNr
   * @return triggerNr
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TriggerNr getTriggerNr() {
    return triggerNr;
  }

  public void setTriggerNr(TriggerNr triggerNr) {
    this.triggerNr = triggerNr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NrMeasRepUeNotification nrMeasRepUeNotification = (NrMeasRepUeNotification) o;
    return Objects.equals(this.associateId, nrMeasRepUeNotification.associateId) &&
        Objects.equals(this.eutraNeighCellMeasInfo, nrMeasRepUeNotification.eutraNeighCellMeasInfo) &&
        Objects.equals(this.notificationType, nrMeasRepUeNotification.notificationType) &&
        Objects.equals(this.nrNeighCellMeasInfo, nrMeasRepUeNotification.nrNeighCellMeasInfo) &&
        Objects.equals(this.servCellMeasInfo, nrMeasRepUeNotification.servCellMeasInfo) &&
        Objects.equals(this.timeStamp, nrMeasRepUeNotification.timeStamp) &&
        Objects.equals(this.triggerNr, nrMeasRepUeNotification.triggerNr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, eutraNeighCellMeasInfo, notificationType, nrNeighCellMeasInfo, servCellMeasInfo, timeStamp, triggerNr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NrMeasRepUeNotification {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    eutraNeighCellMeasInfo: ").append(toIndentedString(eutraNeighCellMeasInfo)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    nrNeighCellMeasInfo: ").append(toIndentedString(nrNeighCellMeasInfo)).append("\n");
    sb.append("    servCellMeasInfo: ").append(toIndentedString(servCellMeasInfo)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    triggerNr: ").append(toIndentedString(triggerNr)).append("\n");
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
