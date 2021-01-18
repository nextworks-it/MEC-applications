package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.Ecgi;
import io.swagger.model.RabRelNotificationErabReleaseInfo;
import io.swagger.model.TimeStamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RabRelNotification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabRelNotification  implements OneOfInlineNotification {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("ecgi")
  private Ecgi ecgi = null;

  @JsonProperty("erabReleaseInfo")
  private RabRelNotificationErabReleaseInfo erabReleaseInfo = null;

  @JsonProperty("notificationType")
  private String notificationType = null;

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  public RabRelNotification associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public RabRelNotification addAssociateIdItem(AssociateId associateIdItem) {
    if (this.associateId == null) {
      this.associateId = new ArrayList<AssociateId>();
    }
    this.associateId.add(associateIdItem);
    return this;
  }

  /**
   * 0 to N identifiers to bind the event for a specific UE or flow as defined below.
   * @return associateId
  **/
  @ApiModelProperty(value = "0 to N identifiers to bind the event for a specific UE or flow as defined below.")
      @Valid
    public List<AssociateId> getAssociateId() {
    return associateId;
  }

  public void setAssociateId(List<AssociateId> associateId) {
    this.associateId = associateId;
  }

  public RabRelNotification ecgi(Ecgi ecgi) {
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

  public RabRelNotification erabReleaseInfo(RabRelNotificationErabReleaseInfo erabReleaseInfo) {
    this.erabReleaseInfo = erabReleaseInfo;
    return this;
  }

  /**
   * Get erabReleaseInfo
   * @return erabReleaseInfo
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public RabRelNotificationErabReleaseInfo getErabReleaseInfo() {
    return erabReleaseInfo;
  }

  public void setErabReleaseInfo(RabRelNotificationErabReleaseInfo erabReleaseInfo) {
    this.erabReleaseInfo = erabReleaseInfo;
  }

  public RabRelNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Shall be set to \"RabRelNotification\".
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"RabRelNotification\".")
      @NotNull

    public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public RabRelNotification timeStamp(TimeStamp timeStamp) {
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
    RabRelNotification rabRelNotification = (RabRelNotification) o;
    return Objects.equals(this.associateId, rabRelNotification.associateId) &&
        Objects.equals(this.ecgi, rabRelNotification.ecgi) &&
        Objects.equals(this.erabReleaseInfo, rabRelNotification.erabReleaseInfo) &&
        Objects.equals(this.notificationType, rabRelNotification.notificationType) &&
        Objects.equals(this.timeStamp, rabRelNotification.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, ecgi, erabReleaseInfo, notificationType, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabRelNotification {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    erabReleaseInfo: ").append(toIndentedString(erabReleaseInfo)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
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
