package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasQuantityResultsNr;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultsPerCsiRsIndexListResultsPerCsiRsIndex
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class ResultsPerCsiRsIndexListResultsPerCsiRsIndex   {
  @JsonProperty("csiRsIndex")
  private Integer csiRsIndex = null;

  @JsonProperty("csiRsResults")
  private MeasQuantityResultsNr csiRsResults = null;

  public ResultsPerCsiRsIndexListResultsPerCsiRsIndex csiRsIndex(Integer csiRsIndex) {
    this.csiRsIndex = csiRsIndex;
    return this;
  }

  /**
   * Get csiRsIndex
   * @return csiRsIndex
  **/
  @ApiModelProperty(value = "")
  
    public Integer getCsiRsIndex() {
    return csiRsIndex;
  }

  public void setCsiRsIndex(Integer csiRsIndex) {
    this.csiRsIndex = csiRsIndex;
  }

  public ResultsPerCsiRsIndexListResultsPerCsiRsIndex csiRsResults(MeasQuantityResultsNr csiRsResults) {
    this.csiRsResults = csiRsResults;
    return this;
  }

  /**
   * Get csiRsResults
   * @return csiRsResults
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasQuantityResultsNr getCsiRsResults() {
    return csiRsResults;
  }

  public void setCsiRsResults(MeasQuantityResultsNr csiRsResults) {
    this.csiRsResults = csiRsResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsPerCsiRsIndexListResultsPerCsiRsIndex resultsPerCsiRsIndexListResultsPerCsiRsIndex = (ResultsPerCsiRsIndexListResultsPerCsiRsIndex) o;
    return Objects.equals(this.csiRsIndex, resultsPerCsiRsIndexListResultsPerCsiRsIndex.csiRsIndex) &&
        Objects.equals(this.csiRsResults, resultsPerCsiRsIndexListResultsPerCsiRsIndex.csiRsResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csiRsIndex, csiRsResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsPerCsiRsIndexListResultsPerCsiRsIndex {\n");
    
    sb.append("    csiRsIndex: ").append(toIndentedString(csiRsIndex)).append("\n");
    sb.append("    csiRsResults: ").append(toIndentedString(csiRsResults)).append("\n");
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
