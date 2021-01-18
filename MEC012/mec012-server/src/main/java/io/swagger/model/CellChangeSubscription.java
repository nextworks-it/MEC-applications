package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CaReconfSubscriptionLinks;
import io.swagger.model.CellChangeSubscriptionFilterCriteriaAssocHo;
import io.swagger.model.TimeStamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CellChangeSubscription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class CellChangeSubscription  implements OneOfInlineSubscription {
  @JsonProperty("links")
  private CaReconfSubscriptionLinks _links = null;

  @JsonProperty("callbackReference")
  private String callbackReference = null;

  @JsonProperty("expiryDeadline")
  private TimeStamp expiryDeadline = null;

  @JsonProperty("filterCriteriaAssocHo")
  private CellChangeSubscriptionFilterCriteriaAssocHo filterCriteriaAssocHo = null;

  @JsonProperty("subscriptionType")
  private String subscriptionType = null;

  public CellChangeSubscription _links(CaReconfSubscriptionLinks _links) {
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

  public CellChangeSubscription callbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
    return this;
  }

  /**
   * URI selected by the service consumerto receive notifications on the subscribed RNIS information. This shall be included both in the request and in response.
   * @return callbackReference
  **/
  @ApiModelProperty(required = true, value = "URI selected by the service consumerto receive notifications on the subscribed RNIS information. This shall be included both in the request and in response.")
      @NotNull

    public String getCallbackReference() {
    return callbackReference;
  }

  public void setCallbackReference(String callbackReference) {
    this.callbackReference = callbackReference;
  }

  public CellChangeSubscription expiryDeadline(TimeStamp expiryDeadline) {
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

  public CellChangeSubscription filterCriteriaAssocHo(CellChangeSubscriptionFilterCriteriaAssocHo filterCriteriaAssocHo) {
    this.filterCriteriaAssocHo = filterCriteriaAssocHo;
    return this;
  }

  /**
   * Get filterCriteriaAssocHo
   * @return filterCriteriaAssocHo
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public CellChangeSubscriptionFilterCriteriaAssocHo getFilterCriteriaAssocHo() {
    return filterCriteriaAssocHo;
  }

  public void setFilterCriteriaAssocHo(CellChangeSubscriptionFilterCriteriaAssocHo filterCriteriaAssocHo) {
    this.filterCriteriaAssocHo = filterCriteriaAssocHo;
  }

  public CellChangeSubscription subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Shall be set to \"CellChangeSubscription\".
   * @return subscriptionType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"CellChangeSubscription\".")
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
    CellChangeSubscription cellChangeSubscription = (CellChangeSubscription) o;
    return Objects.equals(this._links, cellChangeSubscription._links) &&
        Objects.equals(this.callbackReference, cellChangeSubscription.callbackReference) &&
        Objects.equals(this.expiryDeadline, cellChangeSubscription.expiryDeadline) &&
        Objects.equals(this.filterCriteriaAssocHo, cellChangeSubscription.filterCriteriaAssocHo) &&
        Objects.equals(this.subscriptionType, cellChangeSubscription.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, callbackReference, expiryDeadline, filterCriteriaAssocHo, subscriptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellChangeSubscription {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
    sb.append("    expiryDeadline: ").append(toIndentedString(expiryDeadline)).append("\n");
    sb.append("    filterCriteriaAssocHo: ").append(toIndentedString(filterCriteriaAssocHo)).append("\n");
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
