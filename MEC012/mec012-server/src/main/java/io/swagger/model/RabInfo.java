package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RabInfoCellUserInfo;
import io.swagger.model.TimeStamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RabInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabInfo   {
  @JsonProperty("appInstanceId")
  private String appInstanceId = null;

  @JsonProperty("cellUserInfo")
  @Valid
  private List<RabInfoCellUserInfo> cellUserInfo = null;

  @JsonProperty("requestId")
  private String requestId = null;

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  public RabInfo appInstanceId(String appInstanceId) {
    this.appInstanceId = appInstanceId;
    return this;
  }

  /**
   * Unique identifier for the MEC application instance.
   * @return appInstanceId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the MEC application instance.")
      @NotNull

    public String getAppInstanceId() {
    return appInstanceId;
  }

  public void setAppInstanceId(String appInstanceId) {
    this.appInstanceId = appInstanceId;
  }

  public RabInfo cellUserInfo(List<RabInfoCellUserInfo> cellUserInfo) {
    this.cellUserInfo = cellUserInfo;
    return this;
  }

  public RabInfo addCellUserInfoItem(RabInfoCellUserInfo cellUserInfoItem) {
    if (this.cellUserInfo == null) {
      this.cellUserInfo = new ArrayList<RabInfoCellUserInfo>();
    }
    this.cellUserInfo.add(cellUserInfoItem);
    return this;
  }

  /**
   * The information on users per cell as defined below.
   * @return cellUserInfo
  **/
  @ApiModelProperty(value = "The information on users per cell as defined below.")
      @Valid
    public List<RabInfoCellUserInfo> getCellUserInfo() {
    return cellUserInfo;
  }

  public void setCellUserInfo(List<RabInfoCellUserInfo> cellUserInfo) {
    this.cellUserInfo = cellUserInfo;
  }

  public RabInfo requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Unique identifier allocated by the service consumer for the RAB Information request.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier allocated by the service consumer for the RAB Information request.")
      @NotNull

    public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public RabInfo timeStamp(TimeStamp timeStamp) {
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
    RabInfo rabInfo = (RabInfo) o;
    return Objects.equals(this.appInstanceId, rabInfo.appInstanceId) &&
        Objects.equals(this.cellUserInfo, rabInfo.cellUserInfo) &&
        Objects.equals(this.requestId, rabInfo.requestId) &&
        Objects.equals(this.timeStamp, rabInfo.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInstanceId, cellUserInfo, requestId, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabInfo {\n");
    
    sb.append("    appInstanceId: ").append(toIndentedString(appInstanceId)).append("\n");
    sb.append("    cellUserInfo: ").append(toIndentedString(cellUserInfo)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
