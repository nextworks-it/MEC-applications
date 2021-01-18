package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasQuantityResultsNr
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasQuantityResultsNr   {
  @JsonProperty("rsrp")
  private Integer rsrp = null;

  @JsonProperty("rsrq")
  private Integer rsrq = null;

  @JsonProperty("sinr")
  private Integer sinr = null;

  public MeasQuantityResultsNr rsrp(Integer rsrp) {
    this.rsrp = rsrp;
    return this;
  }

  /**
   * Reference Signal Received Power as defined in ETSI TS 138 331 [i.13].
   * @return rsrp
  **/
  @ApiModelProperty(value = "Reference Signal Received Power as defined in ETSI TS 138 331 [i.13].")
  
    public Integer getRsrp() {
    return rsrp;
  }

  public void setRsrp(Integer rsrp) {
    this.rsrp = rsrp;
  }

  public MeasQuantityResultsNr rsrq(Integer rsrq) {
    this.rsrq = rsrq;
    return this;
  }

  /**
   * Reference Signal Received Quality as defined in ETSI TS 138 331 [i.13].
   * @return rsrq
  **/
  @ApiModelProperty(value = "Reference Signal Received Quality as defined in ETSI TS 138 331 [i.13].")
  
    public Integer getRsrq() {
    return rsrq;
  }

  public void setRsrq(Integer rsrq) {
    this.rsrq = rsrq;
  }

  public MeasQuantityResultsNr sinr(Integer sinr) {
    this.sinr = sinr;
    return this;
  }

  /**
   * Reference Signal to Interference & Noise Ratio as defined in ETSI TS 138 331 [i.13].
   * @return sinr
  **/
  @ApiModelProperty(value = "Reference Signal to Interference & Noise Ratio as defined in ETSI TS 138 331 [i.13].")
  
    public Integer getSinr() {
    return sinr;
  }

  public void setSinr(Integer sinr) {
    this.sinr = sinr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasQuantityResultsNr measQuantityResultsNr = (MeasQuantityResultsNr) o;
    return Objects.equals(this.rsrp, measQuantityResultsNr.rsrp) &&
        Objects.equals(this.rsrq, measQuantityResultsNr.rsrq) &&
        Objects.equals(this.sinr, measQuantityResultsNr.sinr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rsrp, rsrq, sinr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasQuantityResultsNr {\n");
    
    sb.append("    rsrp: ").append(toIndentedString(rsrp)).append("\n");
    sb.append("    rsrq: ").append(toIndentedString(rsrq)).append("\n");
    sb.append("    sinr: ").append(toIndentedString(sinr)).append("\n");
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
