package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CaReconfSubscriptionLinks;
import io.swagger.model.S1BearerSubscriptionS1BearerSubscriptionCriteria;
import io.swagger.model.TimeStamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * S1BearerSubscription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class S1BearerSubscription  implements OneOfInlineSubscription {
  @JsonProperty("S1BearerSubscriptionCriteria")
  private S1BearerSubscriptionS1BearerSubscriptionCriteria s1BearerSubscriptionCriteria = null;

  @JsonProperty("_links")
  private CaReconfSubscriptionLinks _links = null;

  @JsonProperty("callbackReference")
  private String callbackReference = null;

  @JsonProperty("eventType")
  @Valid
  private List<Integer> eventType = new ArrayList<Integer>();

  @JsonProperty("expiryDeadline")
  private TimeStamp expiryDeadline = null;

  @JsonProperty("subscriptionType")
  private String subscriptionType = null;

  public S1BearerSubscription s1BearerSubscriptionCriteria(S1BearerSubscriptionS1BearerSubscriptionCriteria s1BearerSubscriptionCriteria) {
    this.s1BearerSubscriptionCriteria = s1BearerSubscriptionCriteria;
    return this;
  }

  /**
   * Get s1BearerSubscriptionCriteria
   * @return s1BearerSubscriptionCriteria
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public S1BearerSubscriptionS1BearerSubscriptionCriteria getS1BearerSubscriptionCriteria() {
    return s1BearerSubscriptionCriteria;
  }

  public void setS1BearerSubscriptionCriteria(S1BearerSubscriptionS1BearerSubscriptionCriteria s1BearerSubscriptionCriteria) {
    this.s1BearerSubscriptionCriteria = s1BearerSubscriptionCriteria;
  }

  public S1BearerSubscription _links(CaReconfSubscriptionLinks _links) {
    this._links = _links;
    return this;
  }

  /**
   * Get _links
   * @return _links
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CaReconfSubscriptionLinks getLinks() {
    return _links;
  }

  public void setLinks(CaReconfSubscriptionLinks _links) {
    this._links = _links;
  }

  public S1BearerSubscription callbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
    return this;
  }

  /**
   * URI selected by the service consumer, to receive notifications on the subscribed RNIS information. This shall be included in the request and response.
   * @return callbackReference
  **/
  @ApiModelProperty(required = true, value = "URI selected by the service consumer, to receive notifications on the subscribed RNIS information. This shall be included in the request and response.")
      @NotNull

    public String getCallbackReference() {
    return callbackReference;
  }

  public void setCallbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
  }

  public S1BearerSubscription eventType(List<Integer> eventType) {
    this.eventType = eventType;
    return this;
  }

  public S1BearerSubscription addEventTypeItem(Integer eventTypeItem) {
    this.eventType.add(eventTypeItem);
    return this;
  }

  /**
   * Description of the subscribed event. The event is included both in the request and in the response. \\nFor the eventType, the following values are currently defined: <p>0 = RESERVED. <p>1 = S1_BEARER_ESTABLISH. <p>2 = S1_BEARER_MODIFY. <p>3 = S1_BEARER_RELEASE.
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "Description of the subscribed event. The event is included both in the request and in the response. \\nFor the eventType, the following values are currently defined: <p>0 = RESERVED. <p>1 = S1_BEARER_ESTABLISH. <p>2 = S1_BEARER_MODIFY. <p>3 = S1_BEARER_RELEASE.")
      @NotNull

  @Size(min=1)   public List<Integer> getEventType() {
    return eventType;
  }

  public void setEventType(List<Integer> eventType) {
    this.eventType = eventType;
  }

  public S1BearerSubscription expiryDeadline(TimeStamp expiryDeadline) {
    this.expiryDeadline = expiryDeadline;
    return this;
  }

  /**
   * Get expiryDeadline
   * @return expiryDeadline
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TimeStamp getExpiryDeadline() {
    return expiryDeadline;
  }

  public void setExpiryDeadline(TimeStamp expiryDeadline) {
    this.expiryDeadline = expiryDeadline;
  }

  public S1BearerSubscription subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Shall be set to \"S1BearerSubscription\".
   * @return subscriptionType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"S1BearerSubscription\".")
      @NotNull

    public String getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S1BearerSubscription s1BearerSubscription = (S1BearerSubscription) o;
    return Objects.equals(this.s1BearerSubscriptionCriteria, s1BearerSubscription.s1BearerSubscriptionCriteria) &&
        Objects.equals(this._links, s1BearerSubscription._links) &&
        Objects.equals(this.callbackReference, s1BearerSubscription.callbackReference) &&
        Objects.equals(this.eventType, s1BearerSubscription.eventType) &&
        Objects.equals(this.expiryDeadline, s1BearerSubscription.expiryDeadline) &&
        Objects.equals(this.subscriptionType, s1BearerSubscription.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s1BearerSubscriptionCriteria, _links, callbackReference, eventType, expiryDeadline, subscriptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S1BearerSubscription {\n");
    
    sb.append("    s1BearerSubscriptionCriteria: ").append(toIndentedString(s1BearerSubscriptionCriteria)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    expiryDeadline: ").append(toIndentedString(expiryDeadline)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
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
