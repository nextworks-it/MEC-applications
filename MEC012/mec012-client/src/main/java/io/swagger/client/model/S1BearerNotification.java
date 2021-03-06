/*
 * ETSI GS MEC 012 - Radio Network Information API
 * The ETSI MEC ISG MEC012 Radio Network Information API described using OpenAPI.
 *
 * OpenAPI spec version: 2.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * S1BearerNotification
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-09T15:33:56.133+01:00[Europe/Rome]")
public class S1BearerNotification implements OneOfInlineNotification {
  @SerializedName("notificationType")
  private String notificationType = null;

  @SerializedName("s1Event")
  private Integer s1Event = null;

  @SerializedName("s1UeInfo")
  private S1BearerNotificationS1UeInfo s1UeInfo = null;

  @SerializedName("timeStamp")
  private TimeStamp timeStamp = null;

  public S1BearerNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Shall be set to \&quot;S1BearerNotification\&quot;.
   * @return notificationType
  **/
  @Schema(required = true, description = "Shall be set to \"S1BearerNotification\".")
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
  @Schema(required = true, description = "The subscribed event that triggered this notification in S1BearerSubscription.")
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
  @Schema(required = true, description = "")
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
  @Schema(description = "")
  public TimeStamp getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(TimeStamp timeStamp) {
    this.timeStamp = timeStamp;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
