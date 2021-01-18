package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasRepUeNotificationNrSCsNrSCellInfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Measurement quantities concerning the secondary serving cells.
 */
@ApiModel(description = "Measurement quantities concerning the secondary serving cells.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeNotificationNrSCs   {
  @JsonProperty("nrSCellInfo")
  @Valid
  private List<MeasRepUeNotificationNrSCsNrSCellInfo> nrSCellInfo = new ArrayList<MeasRepUeNotificationNrSCsNrSCellInfo>();

  @JsonProperty("nrSCellRsrp")
  private Integer nrSCellRsrp = null;

  @JsonProperty("nrSCellRsrq")
  private Integer nrSCellRsrq = null;

  @JsonProperty("nrSCellRssi")
  private Integer nrSCellRssi = null;

  public MeasRepUeNotificationNrSCs nrSCellInfo(List<MeasRepUeNotificationNrSCsNrSCellInfo> nrSCellInfo) {
    this.nrSCellInfo = nrSCellInfo;
    return this;
  }

  public MeasRepUeNotificationNrSCs addNrSCellInfoItem(MeasRepUeNotificationNrSCsNrSCellInfo nrSCellInfoItem) {
    this.nrSCellInfo.add(nrSCellInfoItem);
    return this;
  }

  /**
   * Secondary serving cell(s) info.
   * @return nrSCellInfo
  **/
  @ApiModelProperty(required = true, value = "Secondary serving cell(s) info.")
      @NotNull
    @Valid
  @Size(min=1)   public List<MeasRepUeNotificationNrSCsNrSCellInfo> getNrSCellInfo() {
    return nrSCellInfo;
  }

  public void setNrSCellInfo(List<MeasRepUeNotificationNrSCsNrSCellInfo> nrSCellInfo) {
    this.nrSCellInfo = nrSCellInfo;
  }

  public MeasRepUeNotificationNrSCs nrSCellRsrp(Integer nrSCellRsrp) {
    this.nrSCellRsrp = nrSCellRsrp;
    return this;
  }

  /**
   * Reference Signal Received Power measurement according to mapping table in ETSI TS 138.133 [i.14].
   * @return nrSCellRsrp
  **/
  @ApiModelProperty(value = "Reference Signal Received Power measurement according to mapping table in ETSI TS 138.133 [i.14].")
  
    public Integer getNrSCellRsrp() {
    return nrSCellRsrp;
  }

  public void setNrSCellRsrp(Integer nrSCellRsrp) {
    this.nrSCellRsrp = nrSCellRsrp;
  }

  public MeasRepUeNotificationNrSCs nrSCellRsrq(Integer nrSCellRsrq) {
    this.nrSCellRsrq = nrSCellRsrq;
    return this;
  }

  /**
   * Reference Signal Received Quality measurement according to mapping table in ETSI TS 138.133 [i.14].
   * @return nrSCellRsrq
  **/
  @ApiModelProperty(value = "Reference Signal Received Quality measurement according to mapping table in ETSI TS 138.133 [i.14].")
  
    public Integer getNrSCellRsrq() {
    return nrSCellRsrq;
  }

  public void setNrSCellRsrq(Integer nrSCellRsrq) {
    this.nrSCellRsrq = nrSCellRsrq;
  }

  public MeasRepUeNotificationNrSCs nrSCellRssi(Integer nrSCellRssi) {
    this.nrSCellRssi = nrSCellRssi;
    return this;
  }

  /**
   * Reference signal SINR measurement according to mapping table in ETSI TS 138.133 [i.14].
   * @return nrSCellRssi
  **/
  @ApiModelProperty(value = "Reference signal SINR measurement according to mapping table in ETSI TS 138.133 [i.14].")
  
    public Integer getNrSCellRssi() {
    return nrSCellRssi;
  }

  public void setNrSCellRssi(Integer nrSCellRssi) {
    this.nrSCellRssi = nrSCellRssi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasRepUeNotificationNrSCs measRepUeNotificationNrSCs = (MeasRepUeNotificationNrSCs) o;
    return Objects.equals(this.nrSCellInfo, measRepUeNotificationNrSCs.nrSCellInfo) &&
        Objects.equals(this.nrSCellRsrp, measRepUeNotificationNrSCs.nrSCellRsrp) &&
        Objects.equals(this.nrSCellRsrq, measRepUeNotificationNrSCs.nrSCellRsrq) &&
        Objects.equals(this.nrSCellRssi, measRepUeNotificationNrSCs.nrSCellRssi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrSCellInfo, nrSCellRsrp, nrSCellRsrq, nrSCellRssi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeNotificationNrSCs {\n");
    
    sb.append("    nrSCellInfo: ").append(toIndentedString(nrSCellInfo)).append("\n");
    sb.append("    nrSCellRsrp: ").append(toIndentedString(nrSCellRsrp)).append("\n");
    sb.append("    nrSCellRsrq: ").append(toIndentedString(nrSCellRsrq)).append("\n");
    sb.append("    nrSCellRssi: ").append(toIndentedString(nrSCellRssi)).append("\n");
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
