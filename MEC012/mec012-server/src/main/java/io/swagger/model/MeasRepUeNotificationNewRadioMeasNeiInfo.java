package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasRepUeNotificationNrNCellInfo;
import io.swagger.model.RsIndexResults;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasRepUeNotificationNewRadioMeasNeiInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeNotificationNewRadioMeasNeiInfo   {
  @JsonProperty("nrNCellInfo")
  @Valid
  private List<MeasRepUeNotificationNrNCellInfo> nrNCellInfo = null;

  @JsonProperty("nrNCellRsrp")
  private Integer nrNCellRsrp = null;

  @JsonProperty("nrNCellRsrq")
  private Integer nrNCellRsrq = null;

  @JsonProperty("nrNCellRssi")
  private Integer nrNCellRssi = null;

  @JsonProperty("rsIndexResults")
  private RsIndexResults rsIndexResults = null;

  public MeasRepUeNotificationNewRadioMeasNeiInfo nrNCellInfo(List<MeasRepUeNotificationNrNCellInfo> nrNCellInfo) {
    this.nrNCellInfo = nrNCellInfo;
    return this;
  }

  public MeasRepUeNotificationNewRadioMeasNeiInfo addNrNCellInfoItem(MeasRepUeNotificationNrNCellInfo nrNCellInfoItem) {
    if (this.nrNCellInfo == null) {
      this.nrNCellInfo = new ArrayList<MeasRepUeNotificationNrNCellInfo>();
    }
    this.nrNCellInfo.add(nrNCellInfoItem);
    return this;
  }

  /**
   * 5G NR neighbour cell info.
   * @return nrNCellInfo
  **/
  @ApiModelProperty(value = "5G NR neighbour cell info.")
      @Valid
  @Size(min=1)   public List<MeasRepUeNotificationNrNCellInfo> getNrNCellInfo() {
    return nrNCellInfo;
  }

  public void setNrNCellInfo(List<MeasRepUeNotificationNrNCellInfo> nrNCellInfo) {
    this.nrNCellInfo = nrNCellInfo;
  }

  public MeasRepUeNotificationNewRadioMeasNeiInfo nrNCellRsrp(Integer nrNCellRsrp) {
    this.nrNCellRsrp = nrNCellRsrp;
    return this;
  }

  /**
   * Reference Signal Received Power measurement according to mapping table in ETSI TS 138.133 [i.14].
   * @return nrNCellRsrp
  **/
  @ApiModelProperty(value = "Reference Signal Received Power measurement according to mapping table in ETSI TS 138.133 [i.14].")
  
    public Integer getNrNCellRsrp() {
    return nrNCellRsrp;
  }

  public void setNrNCellRsrp(Integer nrNCellRsrp) {
    this.nrNCellRsrp = nrNCellRsrp;
  }

  public MeasRepUeNotificationNewRadioMeasNeiInfo nrNCellRsrq(Integer nrNCellRsrq) {
    this.nrNCellRsrq = nrNCellRsrq;
    return this;
  }

  /**
   * Reference Signal Received Quality measurement according to mapping table in ETSI TS 138.133 [i.14].
   * @return nrNCellRsrq
  **/
  @ApiModelProperty(value = "Reference Signal Received Quality measurement according to mapping table in ETSI TS 138.133 [i.14].")
  
    public Integer getNrNCellRsrq() {
    return nrNCellRsrq;
  }

  public void setNrNCellRsrq(Integer nrNCellRsrq) {
    this.nrNCellRsrq = nrNCellRsrq;
  }

  public MeasRepUeNotificationNewRadioMeasNeiInfo nrNCellRssi(Integer nrNCellRssi) {
    this.nrNCellRssi = nrNCellRssi;
    return this;
  }

  /**
   * Reference signal SINR measurement according to mapping table in ETSI TS 138.133 [i.14].
   * @return nrNCellRssi
  **/
  @ApiModelProperty(value = "Reference signal SINR measurement according to mapping table in ETSI TS 138.133 [i.14].")
  
    public Integer getNrNCellRssi() {
    return nrNCellRssi;
  }

  public void setNrNCellRssi(Integer nrNCellRssi) {
    this.nrNCellRssi = nrNCellRssi;
  }

  public MeasRepUeNotificationNewRadioMeasNeiInfo rsIndexResults(RsIndexResults rsIndexResults) {
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
    MeasRepUeNotificationNewRadioMeasNeiInfo measRepUeNotificationNewRadioMeasNeiInfo = (MeasRepUeNotificationNewRadioMeasNeiInfo) o;
    return Objects.equals(this.nrNCellInfo, measRepUeNotificationNewRadioMeasNeiInfo.nrNCellInfo) &&
        Objects.equals(this.nrNCellRsrp, measRepUeNotificationNewRadioMeasNeiInfo.nrNCellRsrp) &&
        Objects.equals(this.nrNCellRsrq, measRepUeNotificationNewRadioMeasNeiInfo.nrNCellRsrq) &&
        Objects.equals(this.nrNCellRssi, measRepUeNotificationNewRadioMeasNeiInfo.nrNCellRssi) &&
        Objects.equals(this.rsIndexResults, measRepUeNotificationNewRadioMeasNeiInfo.rsIndexResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrNCellInfo, nrNCellRsrp, nrNCellRsrq, nrNCellRssi, rsIndexResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeNotificationNewRadioMeasNeiInfo {\n");
    
    sb.append("    nrNCellInfo: ").append(toIndentedString(nrNCellInfo)).append("\n");
    sb.append("    nrNCellRsrp: ").append(toIndentedString(nrNCellRsrp)).append("\n");
    sb.append("    nrNCellRsrq: ").append(toIndentedString(nrNCellRsrq)).append("\n");
    sb.append("    nrNCellRssi: ").append(toIndentedString(nrNCellRssi)).append("\n");
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
