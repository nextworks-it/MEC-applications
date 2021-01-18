package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CaReconfSubscriptionLinks;
import io.swagger.model.RabModSubscriptionFilterCriteriaQci;
import io.swagger.model.TimeStamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RabModSubscription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabModSubscription  implements OneOfInlineSubscription {
  @JsonProperty("_links")
  private CaReconfSubscriptionLinks _links = null;

  @JsonProperty("callbackReference")
  private String callbackReference = null;

  @JsonProperty("expiryDeadline")
  private TimeStamp expiryDeadline = null;

  @JsonProperty("filterCriteriaQci")
  private RabModSubscriptionFilterCriteriaQci filterCriteriaQci = null;

  @JsonProperty("subscriptionType")
  private String subscriptionType = null;

  public RabModSubscription _links(CaReconfSubscriptionLinks _links) {
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

  public RabModSubscription callbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
    return this;
  }

  /**
   * URI selected by the service consumer to receive notifications on the subscribed RNIS information. This shall be included both in the request and in response.
   * @return callbackReference
  **/
  @ApiModelProperty(required = true, value = "URI selected by the service consumer to receive notifications on the subscribed RNIS information. This shall be included both in the request and in response.")
      @NotNull

    public String getCallbackReference() {
    return callbackReference;
  }

  public void setCallbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
  }

  public RabModSubscription expiryDeadline(TimeStamp expiryDeadline) {
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

  public RabModSubscription filterCriteriaQci(RabModSubscriptionFilterCriteriaQci filterCriteriaQci) {
    this.filterCriteriaQci = filterCriteriaQci;
    return this;
  }

  /**
   * Get filterCriteriaQci
   * @return filterCriteriaQci
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public RabModSubscriptionFilterCriteriaQci getFilterCriteriaQci() {
    return filterCriteriaQci;
  }

  public void setFilterCriteriaQci(RabModSubscriptionFilterCriteriaQci filterCriteriaQci) {
    this.filterCriteriaQci = filterCriteriaQci;
  }

  public RabModSubscription subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Shall be set to \"RabModSubscription\".
   * @return subscriptionType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"RabModSubscription\".")
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
    RabModSubscription rabModSubscription = (RabModSubscription) o;
    return Objects.equals(this._links, rabModSubscription._links) &&
        Objects.equals(this.callbackReference, rabModSubscription.callbackReference) &&
        Objects.equals(this.expiryDeadline, rabModSubscription.expiryDeadline) &&
        Objects.equals(this.filterCriteriaQci, rabModSubscription.filterCriteriaQci) &&
        Objects.equals(this.subscriptionType, rabModSubscription.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, callbackReference, expiryDeadline, filterCriteriaQci, subscriptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabModSubscription {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
    sb.append("    expiryDeadline: ").append(toIndentedString(expiryDeadline)).append("\n");
    sb.append("    filterCriteriaQci: ").append(toIndentedString(filterCriteriaQci)).append("\n");
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
