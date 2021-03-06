package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.Ecgi;
import io.swagger.model.RabModNotificationErabQosParameters;
import io.swagger.model.TimeStamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RabModNotification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabModNotification  implements OneOfInlineNotification {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("ecgi")
  private Ecgi ecgi = null;

  @JsonProperty("erabId")
  private Integer erabId = null;

  @JsonProperty("erabQosParameters")
  private RabModNotificationErabQosParameters erabQosParameters = null;

  @JsonProperty("notificationType")
  private String notificationType = null;

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  public RabModNotification associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public RabModNotification addAssociateIdItem(AssociateId associateIdItem) {
    if (this.associateId == null) {
      this.associateId = new ArrayList<AssociateId>();
    }
    this.associateId.add(associateIdItem);
    return this;
  }

  /**
   * 0 to N identifiers to bind the event for a specific UE or flow. 
   * @return associateId
  **/
  @ApiModelProperty(value = "0 to N identifiers to bind the event for a specific UE or flow. ")
      @Valid
    public List<AssociateId> getAssociateId() {
    return associateId;
  }

  public void setAssociateId(List<AssociateId> associateId) {
    this.associateId = associateId;
  }

  public RabModNotification ecgi(Ecgi ecgi) {
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

  public RabModNotification erabId(Integer erabId) {
    this.erabId = erabId;
    return this;
  }

  /**
   * The attribute that uniquely identifies a Radio Access bearer for specific UE as defined in ETSI TS 136 413 [i.3].
   * @return erabId
  **/
  @ApiModelProperty(required = true, value = "The attribute that uniquely identifies a Radio Access bearer for specific UE as defined in ETSI TS 136 413 [i.3].")
      @NotNull

    public Integer getErabId() {
    return erabId;
  }

  public void setErabId(Integer erabId) {
    this.erabId = erabId;
  }

  public RabModNotification erabQosParameters(RabModNotificationErabQosParameters erabQosParameters) {
    this.erabQosParameters = erabQosParameters;
    return this;
  }

  /**
   * Get erabQosParameters
   * @return erabQosParameters
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public RabModNotificationErabQosParameters getErabQosParameters() {
    return erabQosParameters;
  }

  public void setErabQosParameters(RabModNotificationErabQosParameters erabQosParameters) {
    this.erabQosParameters = erabQosParameters;
  }

  public RabModNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Shall be set to \"RabModNotification\".
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"RabModNotification\".")
      @NotNull

    public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public RabModNotification timeStamp(TimeStamp timeStamp) {
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
    RabModNotification rabModNotification = (RabModNotification) o;
    return Objects.equals(this.associateId, rabModNotification.associateId) &&
        Objects.equals(this.ecgi, rabModNotification.ecgi) &&
        Objects.equals(this.erabId, rabModNotification.erabId) &&
        Objects.equals(this.erabQosParameters, rabModNotification.erabQosParameters) &&
        Objects.equals(this.notificationType, rabModNotification.notificationType) &&
        Objects.equals(this.timeStamp, rabModNotification.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, ecgi, erabId, erabQosParameters, notificationType, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabModNotification {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    erabId: ").append(toIndentedString(erabId)).append("\n");
    sb.append("    erabQosParameters: ").append(toIndentedString(erabQosParameters)).append("\n");
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
