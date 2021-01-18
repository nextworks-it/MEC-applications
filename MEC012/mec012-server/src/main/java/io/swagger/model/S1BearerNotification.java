package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.S1BearerNotificationS1UeInfo;
import io.swagger.model.TimeStamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * S1BearerNotification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class S1BearerNotification  implements OneOfInlineNotification {
  @JsonProperty("notificationType")
  private String notificationType = null;

  @JsonProperty("s1Event")
  private Integer s1Event = null;

  @JsonProperty("s1UeInfo")
  private S1BearerNotificationS1UeInfo s1UeInfo = null;

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  public S1BearerNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Shall be set to \"S1BearerNotification\".
   * @return notificationType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"S1BearerNotification\".")
      @NotNull

    public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public S1BearerNotification s1Event(Integer s1Event) {
    this.s1Event = s1Event;
    return this;
  }

  /**
   * The subscribed event that triggered this notification in S1BearerSubscription.
   * @return s1Event
  **/
  @ApiModelProperty(required = true, value = "The subscribed event that triggered this notification in S1BearerSubscription.")
      @NotNull

    public Integer getS1Event() {
    return s1Event;
  }

  public void setS1Event(Integer s1Event) {
    this.s1Event = s1Event;
  }

  public S1BearerNotification s1UeInfo(S1BearerNotificationS1UeInfo s1UeInfo) {
    this.s1UeInfo = s1UeInfo;
    return this;
  }

  /**
   * Get s1UeInfo
   * @return s1UeInfo
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public S1BearerNotificationS1UeInfo getS1UeInfo() {
    return s1UeInfo;
  }

  public void setS1UeInfo(S1BearerNotificationS1UeInfo s1UeInfo) {
    this.s1UeInfo = s1UeInfo;
  }

  public S1BearerNotification timeStamp(TimeStamp timeStamp) {
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
    S1BearerNotification s1BearerNotification = (S1BearerNotification) o;
    return Objects.equals(this.notificationType, s1BearerNotification.notificationType) &&
        Objects.equals(this.s1Event, s1BearerNotification.s1Event) &&
        Objects.equals(this.s1UeInfo, s1BearerNotification.s1UeInfo) &&
        Objects.equals(this.timeStamp, s1BearerNotification.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationType, s1Event, s1UeInfo, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S1BearerNotification {\n");
    
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    s1Event: ").append(toIndentedString(s1Event)).append("\n");
    sb.append("    s1UeInfo: ").append(toIndentedString(s1UeInfo)).append("\n");
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
