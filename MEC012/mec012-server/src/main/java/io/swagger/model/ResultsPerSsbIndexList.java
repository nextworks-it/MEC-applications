package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ResultsPerSsbIndexListResultsPerSsbIndex;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultsPerSsbIndexList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class ResultsPerSsbIndexList   {
  @JsonProperty("resultsPerSsbIndex")
  @Valid
  private List<ResultsPerSsbIndexListResultsPerSsbIndex> resultsPerSsbIndex = null;

  public ResultsPerSsbIndexList resultsPerSsbIndex(List<ResultsPerSsbIndexListResultsPerSsbIndex> resultsPerSsbIndex) {
    this.resultsPerSsbIndex = resultsPerSsbIndex;
    return this;
  }

  public ResultsPerSsbIndexList addResultsPerSsbIndexItem(ResultsPerSsbIndexListResultsPerSsbIndex resultsPerSsbIndexItem) {
    if (this.resultsPerSsbIndex == null) {
      this.resultsPerSsbIndex = new ArrayList<ResultsPerSsbIndexListResultsPerSsbIndex>();
    }
    this.resultsPerSsbIndex.add(resultsPerSsbIndexItem);
    return this;
  }

  /**
   * Get resultsPerSsbIndex
   * @return resultsPerSsbIndex
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ResultsPerSsbIndexListResultsPerSsbIndex> getResultsPerSsbIndex() {
    return resultsPerSsbIndex;
  }

  public void setResultsPerSsbIndex(List<ResultsPerSsbIndexListResultsPerSsbIndex> resultsPerSsbIndex) {
    this.resultsPerSsbIndex = resultsPerSsbIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsPerSsbIndexList resultsPerSsbIndexList = (ResultsPerSsbIndexList) o;
    return Objects.equals(this.resultsPerSsbIndex, resultsPerSsbIndexList.resultsPerSsbIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultsPerSsbIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsPerSsbIndexList {\n");
    
    sb.append("    resultsPerSsbIndex: ").append(toIndentedString(resultsPerSsbIndex)).append("\n");
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
