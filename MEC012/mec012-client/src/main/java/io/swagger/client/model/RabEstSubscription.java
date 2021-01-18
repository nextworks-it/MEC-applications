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
 * RabEstSubscription
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-09T15:33:56.133+01:00[Europe/Rome]")
public class RabEstSubscription implements OneOfInlineSubscription {
  @SerializedName("_links")
  private CaReconfSubscriptionLinks _links = null;

  @SerializedName("callbackReference")
  private String callbackReference = null;

  @SerializedName("expiryDeadline")
  private TimeStamp expiryDeadline = null;

  @SerializedName("filterCriteriaQci")
  private RabEstSubscriptionFilterCriteriaQci filterCriteriaQci = null;

  @SerializedName("subscriptionType")
  private String subscriptionType = null;

  public RabEstSubscription _links(CaReconfSubscriptionLinks _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public CaReconfSubscriptionLinks getLinks() {
    return _links;
  }

  public void setLinks(CaReconfSubscriptionLinks _links) {
    this._links = _links;
  }

  public RabEstSubscription callbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
    return this;
  }

   /**
   * URI selected by the service consumer to receive notifications on the subscribed RNIS information. This shall be included both in the request and in response.
   * @return callbackReference
  **/
  @Schema(required = true, description = "URI selected by the service consumer to receive notifications on the subscribed RNIS information. This shall be included both in the request and in response.")
  public String getCallbackReference() {
    return callbackReference;
  }

  public void setCallbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
  }

  public RabEstSubscription expiryDeadline(TimeStamp expiryDeadline) {
    this.expiryDeadline = expiryDeadline;
    return this;
  }

   /**
   * Get expiryDeadline
   * @return expiryDeadline
  **/
  @Schema(description = "")
  public TimeStamp getExpiryDeadline() {
    return expiryDeadline;
  }

  public void setExpiryDeadline(TimeStamp expiryDeadline) {
    this.expiryDeadline = expiryDeadline;
  }

  public RabEstSubscription filterCriteriaQci(RabEstSubscriptionFilterCriteriaQci filterCriteriaQci) {
    this.filterCriteriaQci = filterCriteriaQci;
    return this;
  }

   /**
   * Get filterCriteriaQci
   * @return filterCriteriaQci
  **/
  @Schema(required = true, description = "")
  public RabEstSubscriptionFilterCriteriaQci getFilterCriteriaQci() {
    return filterCriteriaQci;
  }

  public void setFilterCriteriaQci(RabEstSubscriptionFilterCriteriaQci filterCriteriaQci) {
    this.filterCriteriaQci = filterCriteriaQci;
  }

  public RabEstSubscription subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * Shall be set to \&quot;RabEstSubscription\&quot;.
   * @return subscriptionType
  **/
  @Schema(required = true, description = "Shall be set to \"RabEstSubscription\".")
  public String getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabEstSubscription rabEstSubscription = (RabEstSubscription) o;
    return Objects.equals(this._links, rabEstSubscription._links) &&
        Objects.equals(this.callbackReference, rabEstSubscription.callbackReference) &&
        Objects.equals(this.expiryDeadline, rabEstSubscription.expiryDeadline) &&
        Objects.equals(this.filterCriteriaQci, rabEstSubscription.filterCriteriaQci) &&
        Objects.equals(this.subscriptionType, rabEstSubscription.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, callbackReference, expiryDeadline, filterCriteriaQci, subscriptionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabEstSubscription {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
