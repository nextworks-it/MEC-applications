package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AssociateId;
import io.swagger.model.Ecgi;
import io.swagger.model.TimeStamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasTaNotification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasTaNotification  implements OneOfInlineNotification {
  @JsonProperty("associateId")
  @Valid
  private List<AssociateId> associateId = null;

  @JsonProperty("ecgi")
  private Ecgi ecgi = null;

  @JsonProperty("notificationType")
  private String notificationType = null;

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  @JsonProperty("timingAdvance")
  private Integer timingAdvance = null;

  public MeasTaNotification associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public MeasTaNotification addAssociateIdItem(AssociateId associateIdItem) {
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

  public MeasTaNotification ecgi(Ecgi ecgi) {
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

  public MeasTaNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Shall be set to \"MeasTaNotification\".
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"MeasTaNotification\".")
      @NotNull

    public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public MeasTaNotification timeStamp(TimeStamp timeStamp) {
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

  public MeasTaNotification timingAdvance(Integer timingAdvance) {
    this.timingAdvance = timingAdvance;
    return this;
  }

  /**
   * The timing advance as defined in ETSI TS 136 214 [i.5].
   * @return timingAdvance
  **/
  @ApiModelProperty(required = true, value = "The timing advance as defined in ETSI TS 136 214 [i.5].")
      @NotNull

    public Integer getTimingAdvance() {
    return timingAdvance;
  }

  public void setTimingAdvance(Integer timingAdvance) {
    this.timingAdvance = timingAdvance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasTaNotification measTaNotification = (MeasTaNotification) o;
    return Objects.equals(this.associateId, measTaNotification.associateId) &&
        Objects.equals(this.ecgi, measTaNotification.ecgi) &&
        Objects.equals(this.notificationType, measTaNotification.notificationType) &&
        Objects.equals(this.timeStamp, measTaNotification.timeStamp) &&
        Objects.equals(this.timingAdvance, measTaNotification.timingAdvance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, ecgi, notificationType, timeStamp, timingAdvance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasTaNotification {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    timingAdvance: ").append(toIndentedString(timingAdvance)).append("\n");
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
