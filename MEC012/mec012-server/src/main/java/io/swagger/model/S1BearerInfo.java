package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.S1BearerInfoS1UeInfo;
import io.swagger.model.TimeStamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * S1BearerInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class S1BearerInfo   {
  @JsonProperty("s1UeInfo")
  @Valid
  private List<S1BearerInfoS1UeInfo> s1UeInfo = new ArrayList<S1BearerInfoS1UeInfo>();

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  public S1BearerInfo s1UeInfo(List<S1BearerInfoS1UeInfo> s1UeInfo) {
    this.s1UeInfo = s1UeInfo;
    return this;
  }

  public S1BearerInfo addS1UeInfoItem(S1BearerInfoS1UeInfo s1UeInfoItem) {
    this.s1UeInfo.add(s1UeInfoItem);
    return this;
  }

  /**
   * Information on a specific UE as defined below.
   * @return s1UeInfo
  **/
  @ApiModelProperty(required = true, value = "Information on a specific UE as defined below.")
      @NotNull
    @Valid
  @Size(min=1)   public List<S1BearerInfoS1UeInfo> getS1UeInfo() {
    return s1UeInfo;
  }

  public void setS1UeInfo(List<S1BearerInfoS1UeInfo> s1UeInfo) {
    this.s1UeInfo = s1UeInfo;
  }

  public S1BearerInfo timeStamp(TimeStamp timeStamp) {
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
    S1BearerInfo s1BearerInfo = (S1BearerInfo) o;
    return Objects.equals(this.s1UeInfo, s1BearerInfo.s1UeInfo) &&
        Objects.equals(this.timeStamp, s1BearerInfo.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s1UeInfo, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S1BearerInfo {\n");
    
    sb.append("    s1UeInfo: ").append(toIndentedString(s1UeInfo)).append("\n");
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
