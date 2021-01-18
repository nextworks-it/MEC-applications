package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CaReconfSubscriptionFilterCriteriaAssoc;
import io.swagger.model.CaReconfSubscriptionLinks;
import io.swagger.model.TimeStamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaReconfSubscription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class CaReconfSubscription  implements OneOfInlineSubscription {
  @JsonProperty("_links")
  private CaReconfSubscriptionLinks _links = null;

  @JsonProperty("callbackReference")
  private String callbackReference = null;

  @JsonProperty("expiryDeadline")
  private TimeStamp expiryDeadline = null;

  @JsonProperty("filterCriteriaAssoc")
  private CaReconfSubscriptionFilterCriteriaAssoc filterCriteriaAssoc = null;

  @JsonProperty("subscriptionType")
  private String subscriptionType = null;

  public CaReconfSubscription _links(CaReconfSubscriptionLinks _links) {
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

  public CaReconfSubscription callbackReference(String callbackReference) {
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

  public CaReconfSubscription expiryDeadline(TimeStamp expiryDeadline) {
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

  public CaReconfSubscription filterCriteriaAssoc(CaReconfSubscriptionFilterCriteriaAssoc filterCriteriaAssoc) {
    this.filterCriteriaAssoc = filterCriteriaAssoc;
    return this;
  }

  /**
   * Get filterCriteriaAssoc
   * @return filterCriteriaAssoc
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public CaReconfSubscriptionFilterCriteriaAssoc getFilterCriteriaAssoc() {
    return filterCriteriaAssoc;
  }

  public void setFilterCriteriaAssoc(CaReconfSubscriptionFilterCriteriaAssoc filterCriteriaAssoc) {
    this.filterCriteriaAssoc = filterCriteriaAssoc;
  }

  public CaReconfSubscription subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Shall be set to \"CaReconfSubscription\".
   * @return subscriptionType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"CaReconfSubscription\".")
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
    CaReconfSubscription caReconfSubscription = (CaReconfSubscription) o;
    return Objects.equals(this._links, caReconfSubscription._links) &&
        Objects.equals(this.callbackReference, caReconfSubscription.callbackReference) &&
        Objects.equals(this.expiryDeadline, caReconfSubscription.expiryDeadline) &&
        Objects.equals(this.filterCriteriaAssoc, caReconfSubscription.filterCriteriaAssoc) &&
        Objects.equals(this.subscriptionType, caReconfSubscription.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, callbackReference, expiryDeadline, filterCriteriaAssoc, subscriptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaReconfSubscription {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
    sb.append("    expiryDeadline: ").append(toIndentedString(expiryDeadline)).append("\n");
    sb.append("    filterCriteriaAssoc: ").append(toIndentedString(filterCriteriaAssoc)).append("\n");
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
