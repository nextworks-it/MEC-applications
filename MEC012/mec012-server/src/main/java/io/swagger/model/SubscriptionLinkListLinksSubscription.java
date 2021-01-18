package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionLinkListLinksSubscription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class SubscriptionLinkListLinksSubscription   {
  @JsonProperty("href")
  private String href = null;

  @JsonProperty("subscriptionType")
  private String subscriptionType = null;

  public SubscriptionLinkListLinksSubscription href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The URI referring to the subscription.
   * @return href
  **/
  @ApiModelProperty(value = "The URI referring to the subscription.")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public SubscriptionLinkListLinksSubscription subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Type of the subscription. The string shall be set according to the \"subscriptionType\" attribute of the associated subscription data type event defined in clause 6.3.
   * @return subscriptionType
  **/
  @ApiModelProperty(value = "Type of the subscription. The string shall be set according to the \"subscriptionType\" attribute of the associated subscription data type event defined in clause 6.3.")
  
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
    SubscriptionLinkListLinksSubscription subscriptionLinkListLinksSubscription = (SubscriptionLinkListLinksSubscription) o;
    return Objects.equals(this.href, subscriptionLinkListLinksSubscription.href) &&
        Objects.equals(this.subscriptionType, subscriptionLinkListLinksSubscription.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, subscriptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionLinkListLinksSubscription {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
