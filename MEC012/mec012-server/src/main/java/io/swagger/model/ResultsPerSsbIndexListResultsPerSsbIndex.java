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
 * ResultsPerSsbIndexListResultsPerSsbIndex
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class ResultsPerSsbIndexListResultsPerSsbIndex   {
  @JsonProperty("ssbIndex")
  private Integer ssbIndex = null;

  @JsonProperty("ssbResults")
  private MeasQuantityResultsNr ssbResults = null;

  public ResultsPerSsbIndexListResultsPerSsbIndex ssbIndex(Integer ssbIndex) {
    this.ssbIndex = ssbIndex;
    return this;
  }

  /**
   * Get ssbIndex
   * @return ssbIndex
  **/
  @ApiModelProperty(value = "")
  
    public Integer getSsbIndex() {
    return ssbIndex;
  }

  public void setSsbIndex(Integer ssbIndex) {
    this.ssbIndex = ssbIndex;
  }

  public ResultsPerSsbIndexListResultsPerSsbIndex ssbResults(MeasQuantityResultsNr ssbResults) {
    this.ssbResults = ssbResults;
    return this;
  }

  /**
   * Get ssbResults
   * @return ssbResults
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasQuantityResultsNr getSsbResults() {
    return ssbResults;
  }

  public void setSsbResults(MeasQuantityResultsNr ssbResults) {
    this.ssbResults = ssbResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsPerSsbIndexListResultsPerSsbIndex resultsPerSsbIndexListResultsPerSsbIndex = (ResultsPerSsbIndexListResultsPerSsbIndex) o;
    return Objects.equals(this.ssbIndex, resultsPerSsbIndexListResultsPerSsbIndex.ssbIndex) &&
        Objects.equals(this.ssbResults, resultsPerSsbIndexListResultsPerSsbIndex.ssbResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssbIndex, ssbResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsPerSsbIndexListResultsPerSsbIndex {\n");
    
    sb.append("    ssbIndex: ").append(toIndentedString(ssbIndex)).append("\n");
    sb.append("    ssbResults: ").append(toIndentedString(ssbResults)).append("\n");
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
