package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ResultsPerCsiRsIndexList;
import io.swagger.model.ResultsPerSsbIndexList;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RsIndexResults
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RsIndexResults   {
  @JsonProperty("resultsCsiRsIndexes")
  private ResultsPerCsiRsIndexList resultsCsiRsIndexes = null;

  @JsonProperty("resultsSsbIndexes")
  private ResultsPerSsbIndexList resultsSsbIndexes = null;

  public RsIndexResults resultsCsiRsIndexes(ResultsPerCsiRsIndexList resultsCsiRsIndexes) {
    this.resultsCsiRsIndexes = resultsCsiRsIndexes;
    return this;
  }

  /**
   * Get resultsCsiRsIndexes
   * @return resultsCsiRsIndexes
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ResultsPerCsiRsIndexList getResultsCsiRsIndexes() {
    return resultsCsiRsIndexes;
  }

  public void setResultsCsiRsIndexes(ResultsPerCsiRsIndexList resultsCsiRsIndexes) {
    this.resultsCsiRsIndexes = resultsCsiRsIndexes;
  }

  public RsIndexResults resultsSsbIndexes(ResultsPerSsbIndexList resultsSsbIndexes) {
    this.resultsSsbIndexes = resultsSsbIndexes;
    return this;
  }

  /**
   * Get resultsSsbIndexes
   * @return resultsSsbIndexes
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ResultsPerSsbIndexList getResultsSsbIndexes() {
    return resultsSsbIndexes;
  }

  public void setResultsSsbIndexes(ResultsPerSsbIndexList resultsSsbIndexes) {
    this.resultsSsbIndexes = resultsSsbIndexes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RsIndexResults rsIndexResults = (RsIndexResults) o;
    return Objects.equals(this.resultsCsiRsIndexes, rsIndexResults.resultsCsiRsIndexes) &&
        Objects.equals(this.resultsSsbIndexes, rsIndexResults.resultsSsbIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultsCsiRsIndexes, resultsSsbIndexes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RsIndexResults {\n");
    
    sb.append("    resultsCsiRsIndexes: ").append(toIndentedString(resultsCsiRsIndexes)).append("\n");
    sb.append("    resultsSsbIndexes: ").append(toIndentedString(resultsSsbIndexes)).append("\n");
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
