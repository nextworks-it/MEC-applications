package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.L2MeasCellInfo;
import io.swagger.model.L2MeasCellUEInfo;
import io.swagger.model.TimeStamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * L2Meas
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class L2Meas   {
  @JsonProperty("cellInfo")
  @Valid
  private List<L2MeasCellInfo> cellInfo = null;

  @JsonProperty("cellUEInfo")
  @Valid
  private List<L2MeasCellUEInfo> cellUEInfo = null;

  @JsonProperty("timeStamp")
  private TimeStamp timeStamp = null;

  public L2Meas cellInfo(List<L2MeasCellInfo> cellInfo) {
    this.cellInfo = cellInfo;
    return this;
  }

  public L2Meas addCellInfoItem(L2MeasCellInfo cellInfoItem) {
    if (this.cellInfo == null) {
      this.cellInfo = new ArrayList<L2MeasCellInfo>();
    }
    this.cellInfo.add(cellInfoItem);
    return this;
  }

  /**
   * The per cell measurement information as defined below.
   * @return cellInfo
  **/
  @ApiModelProperty(value = "The per cell measurement information as defined below.")
      @Valid
    public List<L2MeasCellInfo> getCellInfo() {
    return cellInfo;
  }

  public void setCellInfo(List<L2MeasCellInfo> cellInfo) {
    this.cellInfo = cellInfo;
  }

  public L2Meas cellUEInfo(List<L2MeasCellUEInfo> cellUEInfo) {
    this.cellUEInfo = cellUEInfo;
    return this;
  }

  public L2Meas addCellUEInfoItem(L2MeasCellUEInfo cellUEInfoItem) {
    if (this.cellUEInfo == null) {
      this.cellUEInfo = new ArrayList<L2MeasCellUEInfo>();
    }
    this.cellUEInfo.add(cellUEInfoItem);
    return this;
  }

  /**
   * The per cell per UE layer 2 measurements information as defined below.
   * @return cellUEInfo
  **/
  @ApiModelProperty(value = "The per cell per UE layer 2 measurements information as defined below.")
      @Valid
    public List<L2MeasCellUEInfo> getCellUEInfo() {
    return cellUEInfo;
  }

  public void setCellUEInfo(List<L2MeasCellUEInfo> cellUEInfo) {
    this.cellUEInfo = cellUEInfo;
  }

  public L2Meas timeStamp(TimeStamp timeStamp) {
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
    L2Meas l2Meas = (L2Meas) o;
    return Objects.equals(this.cellInfo, l2Meas.cellInfo) &&
        Objects.equals(this.cellUEInfo, l2Meas.cellUEInfo) &&
        Objects.equals(this.timeStamp, l2Meas.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellInfo, cellUEInfo, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L2Meas {\n");
    
    sb.append("    cellInfo: ").append(toIndentedString(cellInfo)).append("\n");
    sb.append("    cellUEInfo: ").append(toIndentedString(cellUEInfo)).append("\n");
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
