package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ResultsPerCsiRsIndexListResultsPerCsiRsIndex;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultsPerCsiRsIndexList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class ResultsPerCsiRsIndexList   {
  @JsonProperty("resultsPerCsiRsIndex")
  @Valid
  private List<ResultsPerCsiRsIndexListResultsPerCsiRsIndex> resultsPerCsiRsIndex = null;

  public ResultsPerCsiRsIndexList resultsPerCsiRsIndex(List<ResultsPerCsiRsIndexListResultsPerCsiRsIndex> resultsPerCsiRsIndex) {
    this.resultsPerCsiRsIndex = resultsPerCsiRsIndex;
    return this;
  }

  public ResultsPerCsiRsIndexList addResultsPerCsiRsIndexItem(ResultsPerCsiRsIndexListResultsPerCsiRsIndex resultsPerCsiRsIndexItem) {
    if (this.resultsPerCsiRsIndex == null) {
      this.resultsPerCsiRsIndex = new ArrayList<ResultsPerCsiRsIndexListResultsPerCsiRsIndex>();
    }
    this.resultsPerCsiRsIndex.add(resultsPerCsiRsIndexItem);
    return this;
  }

  /**
   * Get resultsPerCsiRsIndex
   * @return resultsPerCsiRsIndex
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ResultsPerCsiRsIndexListResultsPerCsiRsIndex> getResultsPerCsiRsIndex() {
    return resultsPerCsiRsIndex;
  }

  public void setResultsPerCsiRsIndex(List<ResultsPerCsiRsIndexListResultsPerCsiRsIndex> resultsPerCsiRsIndex) {
    this.resultsPerCsiRsIndex = resultsPerCsiRsIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsPerCsiRsIndexList resultsPerCsiRsIndexList = (ResultsPerCsiRsIndexList) o;
    return Objects.equals(this.resultsPerCsiRsIndex, resultsPerCsiRsIndexList.resultsPerCsiRsIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultsPerCsiRsIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsPerCsiRsIndexList {\n");
    
    sb.append("    resultsPerCsiRsIndex: ").append(toIndentedString(resultsPerCsiRsIndex)).append("\n");
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
