package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CaReconfSubscriptionLinks;
import io.swagger.model.MeasRepUeSubscriptionFilterCriteriaAssocTri;
import io.swagger.model.TimeStamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasRepUeSubscription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeSubscription  implements OneOfInlineSubscription {
  @JsonProperty("_links")
  private CaReconfSubscriptionLinks _links = null;

  @JsonProperty("callbackReference")
  private String callbackReference = null;

  @JsonProperty("expiryDeadline")
  private TimeStamp expiryDeadline = null;

  @JsonProperty("filterCriteriaAssocTri")
  private MeasRepUeSubscriptionFilterCriteriaAssocTri filterCriteriaAssocTri = null;

  @JsonProperty("subscriptionType")
  private String subscriptionType = null;

  public MeasRepUeSubscription _links(CaReconfSubscriptionLinks _links) {
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

  public MeasRepUeSubscription callbackReference(String callbackReference) {
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

  public MeasRepUeSubscription expiryDeadline(TimeStamp expiryDeadline) {
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

  public MeasRepUeSubscription filterCriteriaAssocTri(MeasRepUeSubscriptionFilterCriteriaAssocTri filterCriteriaAssocTri) {
    this.filterCriteriaAssocTri = filterCriteriaAssocTri;
    return this;
  }

  /**
   * Get filterCriteriaAssocTri
   * @return filterCriteriaAssocTri
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public MeasRepUeSubscriptionFilterCriteriaAssocTri getFilterCriteriaAssocTri() {
    return filterCriteriaAssocTri;
  }

  public void setFilterCriteriaAssocTri(MeasRepUeSubscriptionFilterCriteriaAssocTri filterCriteriaAssocTri) {
    this.filterCriteriaAssocTri = filterCriteriaAssocTri;
  }

  public MeasRepUeSubscription subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Shall be set to \"MeasRepUeSubscription\".
   * @return subscriptionType
  **/
  @ApiModelProperty(required = true, value = "Shall be set to \"MeasRepUeSubscription\".")
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
    MeasRepUeSubscription measRepUeSubscription = (MeasRepUeSubscription) o;
    return Objects.equals(this._links, measRepUeSubscription._links) &&
        Objects.equals(this.callbackReference, measRepUeSubscription.callbackReference) &&
        Objects.equals(this.expiryDeadline, measRepUeSubscription.expiryDeadline) &&
        Objects.equals(this.filterCriteriaAssocTri, measRepUeSubscription.filterCriteriaAssocTri) &&
        Objects.equals(this.subscriptionType, measRepUeSubscription.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, callbackReference, expiryDeadline, filterCriteriaAssocTri, subscriptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeSubscription {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
    sb.append("    expiryDeadline: ").append(toIndentedString(expiryDeadline)).append("\n");
    sb.append("    filterCriteriaAssocTri: ").append(toIndentedString(filterCriteriaAssocTri)).append("\n");
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
