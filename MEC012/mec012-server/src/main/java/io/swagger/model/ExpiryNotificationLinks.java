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
 * List of hyperlinks related to the resource.
 */
@ApiModel(description = "List of hyperlinks related to the resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class ExpiryNotificationLinks   {
  @JsonProperty("self")
  private String self = null;

  public ExpiryNotificationLinks self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Self referring URI. This shall be included in the response from the RNIS. The URI shall be unique within the RNI API as it acts as an ID for the subscription.
   * @return self
  **/
  @ApiModelProperty(required = true, value = "Self referring URI. This shall be included in the response from the RNIS. The URI shall be unique within the RNI API as it acts as an ID for the subscription.")
      @NotNull

    public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpiryNotificationLinks expiryNotificationLinks = (ExpiryNotificationLinks) o;
    return Objects.equals(this.self, expiryNotificationLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpiryNotificationLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
