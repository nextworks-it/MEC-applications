package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.NRcgi;
import io.swagger.model.NrMeasRepUeNotificationNCell;
import io.swagger.model.NrMeasRepUeNotificationSCell;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NrMeasRepUeNotificationServCellMeasInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class NrMeasRepUeNotificationServCellMeasInfo   {
  @JsonProperty("nCell")
  private NrMeasRepUeNotificationNCell nCell = null;

  @JsonProperty("nrcgi")
  private NRcgi nrcgi = null;

  @JsonProperty("sCell")
  private NrMeasRepUeNotificationSCell sCell = null;

  public NrMeasRepUeNotificationServCellMeasInfo nCell(NrMeasRepUeNotificationNCell nCell) {
    this.nCell = nCell;
    return this;
  }

  /**
   * Get nCell
   * @return nCell
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NrMeasRepUeNotificationNCell getNCell() {
    return nCell;
  }

  public void setNCell(NrMeasRepUeNotificationNCell nCell) {
    this.nCell = nCell;
  }

  public NrMeasRepUeNotificationServCellMeasInfo nrcgi(NRcgi nrcgi) {
    this.nrcgi = nrcgi;
    return this;
  }

  /**
   * Get nrcgi
   * @return nrcgi
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NRcgi getNrcgi() {
    return nrcgi;
  }

  public void setNrcgi(NRcgi nrcgi) {
    this.nrcgi = nrcgi;
  }

  public NrMeasRepUeNotificationServCellMeasInfo sCell(NrMeasRepUeNotificationSCell sCell) {
    this.sCell = sCell;
    return this;
  }

  /**
   * Get sCell
   * @return sCell
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NrMeasRepUeNotificationSCell getSCell() {
    return sCell;
  }

  public void setSCell(NrMeasRepUeNotificationSCell sCell) {
    this.sCell = sCell;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NrMeasRepUeNotificationServCellMeasInfo nrMeasRepUeNotificationServCellMeasInfo = (NrMeasRepUeNotificationServCellMeasInfo) o;
    return Objects.equals(this.nCell, nrMeasRepUeNotificationServCellMeasInfo.nCell) &&
        Objects.equals(this.nrcgi, nrMeasRepUeNotificationServCellMeasInfo.nrcgi) &&
        Objects.equals(this.sCell, nrMeasRepUeNotificationServCellMeasInfo.sCell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nCell, nrcgi, sCell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NrMeasRepUeNotificationServCellMeasInfo {\n");
    
    sb.append("    nCell: ").append(toIndentedString(nCell)).append("\n");
    sb.append("    nrcgi: ").append(toIndentedString(nrcgi)).append("\n");
    sb.append("    sCell: ").append(toIndentedString(sCell)).append("\n");
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
