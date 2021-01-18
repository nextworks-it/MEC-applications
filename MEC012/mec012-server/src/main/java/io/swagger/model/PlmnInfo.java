package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Plmn;
import io.swagger.model.TimeStamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PlmnInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class PlmnInfo   {
  @JsonProperty("appInstanceId")
  private String appInstanceId = null;

  @JsonProperty("plmn")
  @Valid
  private List<Plmn> plmn = new ArrayList<Plmn>();

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  public PlmnInfo appInstanceId(String appInstanceId) {
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

  public PlmnInfo plmn(List<Plmn> plmn) {
    this.plmn = plmn;
    return this;
  }

  public PlmnInfo addPlmnItem(Plmn plmnItem) {
    this.plmn.add(plmnItem);
    return this;
  }

  /**
   * Public Land Mobile Network Identity.
   * @return plmn
  **/
  @ApiModelProperty(required = true, value = "Public Land Mobile Network Identity.")
      @NotNull
    @Valid
  @Size(min=1)   public List<Plmn> getPlmn() {
    return plmn;
  }

  public void setPlmn(List<Plmn> plmn) {
    this.plmn = plmn;
  }

  public PlmnInfo timeStamp(TimeStamp timeStamp) {
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
    PlmnInfo plmnInfo = (PlmnInfo) o;
    return Objects.equals(this.appInstanceId, plmnInfo.appInstanceId) &&
        Objects.equals(this.plmn, plmnInfo.plmn) &&
        Objects.equals(this.timeStamp, plmnInfo.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInstanceId, plmn, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlmnInfo {\n");
    
    sb.append("    appInstanceId: ").append(toIndentedString(appInstanceId)).append("\n");
    sb.append("    plmn: ").append(toIndentedString(plmn)).append("\n");
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
