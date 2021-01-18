package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LinkType;
import io.swagger.model.SubscriptionLinkListLinksSubscription;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of hyperlinks related to the resource.
 */
@ApiModel(description = "List of hyperlinks related to the resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class SubscriptionLinkListLinks   {
  @JsonProperty("self")
  private LinkType self = null;

  @JsonProperty("subscription")
  @Valid
  private List<SubscriptionLinkListLinksSubscription> subscription = null;

  public SubscriptionLinkListLinks self(LinkType self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public LinkType getSelf() {
    return self;
  }

  public void setSelf(LinkType self) {
    this.self = self;
  }

  public SubscriptionLinkListLinks subscription(List<SubscriptionLinkListLinksSubscription> subscription) {
    this.subscription = subscription;
    return this;
  }

  public SubscriptionLinkListLinks addSubscriptionItem(SubscriptionLinkListLinksSubscription subscriptionItem) {
    if (this.subscription == null) {
      this.subscription = new ArrayList<SubscriptionLinkListLinksSubscription>();
    }
    this.subscription.add(subscriptionItem);
    return this;
  }

  /**
   * A link to a subscription.
   * @return subscription
  **/
  @ApiModelProperty(value = "A link to a subscription.")
      @Valid
    public List<SubscriptionLinkListLinksSubscription> getSubscription() {
    return subscription;
  }

  public void setSubscription(List<SubscriptionLinkListLinksSubscription> subscription) {
    this.subscription = subscription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionLinkListLinks subscriptionLinkListLinks = (SubscriptionLinkListLinks) o;
    return Objects.equals(this.self, subscriptionLinkListLinks.self) &&
        Objects.equals(this.subscription, subscriptionLinkListLinks.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionLinkListLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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
