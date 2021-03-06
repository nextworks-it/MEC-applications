package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasQuantityResultsNr;
import io.swagger.model.RsIndexResults;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NrMeasRepUeNotificationNrNeighCellMeasInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class NrMeasRepUeNotificationNrNeighCellMeasInfo   {
  @JsonProperty("measQuantityResultsCsiRsCell")
  private MeasQuantityResultsNr measQuantityResultsCsiRsCell = null;

  @JsonProperty("measQuantityResultsSsbCell")
  private MeasQuantityResultsNr measQuantityResultsSsbCell = null;

  @JsonProperty("nrcgi")
  private String nrcgi = null;

  @JsonProperty("rsIndexResults")
  private RsIndexResults rsIndexResults = null;

  public NrMeasRepUeNotificationNrNeighCellMeasInfo measQuantityResultsCsiRsCell(MeasQuantityResultsNr measQuantityResultsCsiRsCell) {
    this.measQuantityResultsCsiRsCell = measQuantityResultsCsiRsCell;
    return this;
  }

  /**
   * Get measQuantityResultsCsiRsCell
   * @return measQuantityResultsCsiRsCell
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasQuantityResultsNr getMeasQuantityResultsCsiRsCell() {
    return measQuantityResultsCsiRsCell;
  }

  public void setMeasQuantityResultsCsiRsCell(MeasQuantityResultsNr measQuantityResultsCsiRsCell) {
    this.measQuantityResultsCsiRsCell = measQuantityResultsCsiRsCell;
  }

  public NrMeasRepUeNotificationNrNeighCellMeasInfo measQuantityResultsSsbCell(MeasQuantityResultsNr measQuantityResultsSsbCell) {
    this.measQuantityResultsSsbCell = measQuantityResultsSsbCell;
    return this;
  }

  /**
   * Get measQuantityResultsSsbCell
   * @return measQuantityResultsSsbCell
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasQuantityResultsNr getMeasQuantityResultsSsbCell() {
    return measQuantityResultsSsbCell;
  }

  public void setMeasQuantityResultsSsbCell(MeasQuantityResultsNr measQuantityResultsSsbCell) {
    this.measQuantityResultsSsbCell = measQuantityResultsSsbCell;
  }

  public NrMeasRepUeNotificationNrNeighCellMeasInfo nrcgi(String nrcgi) {
    this.nrcgi = nrcgi;
    return this;
  }

  /**
   * Get nrcgi
   * @return nrcgi
  **/
  @ApiModelProperty(value = "")
  
    public String getNrcgi() {
    return nrcgi;
  }

  public void setNrcgi(String nrcgi) {
    this.nrcgi = nrcgi;
  }

  public NrMeasRepUeNotificationNrNeighCellMeasInfo rsIndexResults(RsIndexResults rsIndexResults) {
    this.rsIndexResults = rsIndexResults;
    return this;
  }

  /**
   * Get rsIndexResults
   * @return rsIndexResults
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public RsIndexResults getRsIndexResults() {
    return rsIndexResults;
  }

  public void setRsIndexResults(RsIndexResults rsIndexResults) {
    this.rsIndexResults = rsIndexResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NrMeasRepUeNotificationNrNeighCellMeasInfo nrMeasRepUeNotificationNrNeighCellMeasInfo = (NrMeasRepUeNotificationNrNeighCellMeasInfo) o;
    return Objects.equals(this.measQuantityResultsCsiRsCell, nrMeasRepUeNotificationNrNeighCellMeasInfo.measQuantityResultsCsiRsCell) &&
        Objects.equals(this.measQuantityResultsSsbCell, nrMeasRepUeNotificationNrNeighCellMeasInfo.measQuantityResultsSsbCell) &&
        Objects.equals(this.nrcgi, nrMeasRepUeNotificationNrNeighCellMeasInfo.nrcgi) &&
        Objects.equals(this.rsIndexResults, nrMeasRepUeNotificationNrNeighCellMeasInfo.rsIndexResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measQuantityResultsCsiRsCell, measQuantityResultsSsbCell, nrcgi, rsIndexResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NrMeasRepUeNotificationNrNeighCellMeasInfo {\n");
    
    sb.append("    measQuantityResultsCsiRsCell: ").append(toIndentedString(measQuantityResultsCsiRsCell)).append("\n");
    sb.append("    measQuantityResultsSsbCell: ").append(toIndentedString(measQuantityResultsSsbCell)).append("\n");
    sb.append("    nrcgi: ").append(toIndentedString(nrcgi)).append("\n");
    sb.append("    rsIndexResults: ").append(toIndentedString(rsIndexResults)).append("\n");
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
