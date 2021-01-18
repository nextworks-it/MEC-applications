package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ExpiryNotificationLinks;
import io.swagger.model.TimeStamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExpiryNotification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class ExpiryNotification   {
  @JsonProperty("_links")
  private ExpiryNotificationLinks _links = null;

  @JsonProperty("expiryDeadline")
  private TimeStamp expiryDeadline = null;

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  public ExpiryNotification _links(ExpiryNotificationLinks _links) {
    this._links = _links;
    return this;
  }

  /**
   * Get _links
   * @return _links
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ExpiryNotificationLinks getLinks() {
    return _links;
  }

  public void setLinks(ExpiryNotificationLinks _links) {
    this._links = _links;
  }

  public ExpiryNotification expiryDeadline(TimeStamp expiryDeadline) {
    this.expiryDeadline = expiryDeadline;
    return this;
  }

  /**
   * Get expiryDeadline
   * @return expiryDeadline
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TimeStamp getExpiryDeadline() {
    return expiryDeadline;
  }

  public void setExpiryDeadline(TimeStamp expiryDeadline) {
    this.expiryDeadline = expiryDeadline;
  }

  public ExpiryNotification timeStamp(TimeStamp timeStamp) {
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
    ExpiryNotification expiryNotification = (ExpiryNotification) o;
    return Objects.equals(this._links, expiryNotification._links) &&
        Objects.equals(this.expiryDeadline, expiryNotification.expiryDeadline) &&
        Objects.equals(this.timeStamp, expiryNotification.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, expiryDeadline, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpiryNotification {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    expiryDeadline: ").append(toIndentedString(expiryDeadline)).append("\n");
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
