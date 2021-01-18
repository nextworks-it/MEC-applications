package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.CellChangeNotificationTempUeId;
import io.swagger.model.Ecgi;
import io.swagger.model.TimeStamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CellChangeNotification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class CellChangeNotification  implements OneOfInlineNotification {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  /**
   * Indicate the status of the UE handover procedure. Values are defined as following: <p>1 = IN_PREPARATION. <p>2 = IN_EXECUTION. <p>3 = COMPLETED. <p>4 = REJECTED. <p>5 = CANCELLED.
   */
  public enum HoStatusEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5);

    private Integer value;

    HoStatusEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HoStatusEnum fromValue(String text) {
      for (HoStatusEnum b : HoStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("hoStatus")
  private HoStatusEnum hoStatus = null;

  @JsonProperty("notificationType")
  private String notificationType = null;

  @JsonProperty("srcEcgi")
  private Ecgi srcEcgi = null;

  @JsonProperty("tempUeId")
  private CellChangeNotificationTempUeId tempUeId = null;

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  @JsonProperty("trgEcgi")
  @Valid
  private List<Ecgi> trgEcgi = new ArrayList<Ecgi>();

  public CellChangeNotification associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public CellChangeNotification addAssociateIdItem(AssociateId associateIdItem) {
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

  public CellChangeNotification hoStatus(HoStatusEnum hoStatus) {
    this.hoStatus = hoStatus;
    return this;
  }

  /**
   * Indicate the status of the UE handover procedure. Values are defined as following: <p>1 = IN_PREPARATION. <p>2 = IN_EXECUTION. <p>3 = COMPLETED. <p>4 = REJECTED. <p>5 = CANCELLED.
   * @return hoStatus
  **/
  @ApiModelProperty(required = true, value = "Indicate the status of the UE handover procedure. Values are defined as following: <p>1 = IN_PREPARATION. <p>2 = IN_EXECUTION. <p>3 = COMPLETED. <p>4 = REJECTED. <p>5 = CANCELLED.")
      @NotNull

    public HoStatusEnum getHoStatus() {
    return hoStatus;
  }

  public void setHoStatus(HoStatusEnum hoStatus) {
    this.hoStatus = hoStatus;
  }

  public CellChangeNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Shall be set to \"CellChangeNotification\".
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"CellChangeNotification\".")
      @NotNull

    public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public CellChangeNotification srcEcgi(Ecgi srcEcgi) {
    this.srcEcgi = srcEcgi;
    return this;
  }

  /**
   * Get srcEcgi
   * @return srcEcgi
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Ecgi getSrcEcgi() {
    return srcEcgi;
  }

  public void setSrcEcgi(Ecgi srcEcgi) {
    this.srcEcgi = srcEcgi;
  }

  public CellChangeNotification tempUeId(CellChangeNotificationTempUeId tempUeId) {
    this.tempUeId = tempUeId;
    return this;
  }

  /**
   * Get tempUeId
   * @return tempUeId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CellChangeNotificationTempUeId getTempUeId() {
    return tempUeId;
  }

  public void setTempUeId(CellChangeNotificationTempUeId tempUeId) {
    this.tempUeId = tempUeId;
  }

  public CellChangeNotification timeStamp(TimeStamp timeStamp) {
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

  public CellChangeNotification trgEcgi(List<Ecgi> trgEcgi) {
    this.trgEcgi = trgEcgi;
    return this;
  }

  public CellChangeNotification addTrgEcgiItem(Ecgi trgEcgiItem) {
    this.trgEcgi.add(trgEcgiItem);
    return this;
  }

  /**
   * E-UTRAN Cell Global Identifier of the target cell. NOTE: Cardinality N is valid only in case of statuses IN_PREPARATION, REJECTED and CANCELLED.
   * @return trgEcgi
  **/
  @ApiModelProperty(required = true, value = "E-UTRAN Cell Global Identifier of the target cell. NOTE: Cardinality N is valid only in case of statuses IN_PREPARATION, REJECTED and CANCELLED.")
      @NotNull
    @Valid
  @Size(min=1)   public List<Ecgi> getTrgEcgi() {
    return trgEcgi;
  }

  public void setTrgEcgi(List<Ecgi> trgEcgi) {
    this.trgEcgi = trgEcgi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellChangeNotification cellChangeNotification = (CellChangeNotification) o;
    return Objects.equals(this.associateId, cellChangeNotification.associateId) &&
        Objects.equals(this.hoStatus, cellChangeNotification.hoStatus) &&
        Objects.equals(this.notificationType, cellChangeNotification.notificationType) &&
        Objects.equals(this.srcEcgi, cellChangeNotification.srcEcgi) &&
        Objects.equals(this.tempUeId, cellChangeNotification.tempUeId) &&
        Objects.equals(this.timeStamp, cellChangeNotification.timeStamp) &&
        Objects.equals(this.trgEcgi, cellChangeNotification.trgEcgi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, hoStatus, notificationType, srcEcgi, tempUeId, timeStamp, trgEcgi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellChangeNotification {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    hoStatus: ").append(toIndentedString(hoStatus)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    srcEcgi: ").append(toIndentedString(srcEcgi)).append("\n");
    sb.append("    tempUeId: ").append(toIndentedString(tempUeId)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    trgEcgi: ").append(toIndentedString(trgEcgi)).append("\n");
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
