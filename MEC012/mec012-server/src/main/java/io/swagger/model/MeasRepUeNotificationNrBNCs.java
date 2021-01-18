package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasRepUeNotificationNrBNCsNrBNCellInfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Measurement quantities concerning the best neighbours of the secondary serving cells
 */
@ApiModel(description = "Measurement quantities concerning the best neighbours of the secondary serving cells")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeNotificationNrBNCs   {
  @JsonProperty("nrBNCellInfo")
  @Valid
  private List<MeasRepUeNotificationNrBNCsNrBNCellInfo> nrBNCellInfo = new ArrayList<MeasRepUeNotificationNrBNCsNrBNCellInfo>();

  @JsonProperty("nrBNCellRsrp")
  private Integer nrBNCellRsrp = null;

  @JsonProperty("nrBNCellRsrq")
  private Integer nrBNCellRsrq = null;

  @JsonProperty("nrBNCellRssi")
  private Integer nrBNCellRssi = null;

  public MeasRepUeNotificationNrBNCs nrBNCellInfo(List<MeasRepUeNotificationNrBNCsNrBNCellInfo> nrBNCellInfo) {
    this.nrBNCellInfo = nrBNCellInfo;
    return this;
  }

  public MeasRepUeNotificationNrBNCs addNrBNCellInfoItem(MeasRepUeNotificationNrBNCsNrBNCellInfo nrBNCellInfoItem) {
    this.nrBNCellInfo.add(nrBNCellInfoItem);
    return this;
  }

  /**
   * Best neighbours of the secondary serving cell(s) info
   * @return nrBNCellInfo
  **/
  @ApiModelProperty(required = true, value = "Best neighbours of the secondary serving cell(s) info")
      @NotNull
    @Valid
  @Size(min=1)   public List<MeasRepUeNotificationNrBNCsNrBNCellInfo> getNrBNCellInfo() {
    return nrBNCellInfo;
  }

  public void setNrBNCellInfo(List<MeasRepUeNotificationNrBNCsNrBNCellInfo> nrBNCellInfo) {
    this.nrBNCellInfo = nrBNCellInfo;
  }

  public MeasRepUeNotificationNrBNCs nrBNCellRsrp(Integer nrBNCellRsrp) {
    this.nrBNCellRsrp = nrBNCellRsrp;
    return this;
  }

  /**
   * Reference Signal Received Power measurement according to mapping table in ETSI TS 138.133 [i.14].
   * @return nrBNCellRsrp
  **/
  @ApiModelProperty(value = "Reference Signal Received Power measurement according to mapping table in ETSI TS 138.133 [i.14].")
  
    public Integer getNrBNCellRsrp() {
    return nrBNCellRsrp;
  }

  public void setNrBNCellRsrp(Integer nrBNCellRsrp) {
    this.nrBNCellRsrp = nrBNCellRsrp;
  }

  public MeasRepUeNotificationNrBNCs nrBNCellRsrq(Integer nrBNCellRsrq) {
    this.nrBNCellRsrq = nrBNCellRsrq;
    return this;
  }

  /**
   * Reference Signal Received Quality measurement according to mapping table in ETSI TS 138.133 [i.14].
   * @return nrBNCellRsrq
  **/
  @ApiModelProperty(value = "Reference Signal Received Quality measurement according to mapping table in ETSI TS 138.133 [i.14].")
  
    public Integer getNrBNCellRsrq() {
    return nrBNCellRsrq;
  }

  public void setNrBNCellRsrq(Integer nrBNCellRsrq) {
    this.nrBNCellRsrq = nrBNCellRsrq;
  }

  public MeasRepUeNotificationNrBNCs nrBNCellRssi(Integer nrBNCellRssi) {
    this.nrBNCellRssi = nrBNCellRssi;
    return this;
  }

  /**
   * Reference signal SINR measurement according to mapping table in ETSI TS 138.133 [i.14].
   * @return nrBNCellRssi
  **/
  @ApiModelProperty(value = "Reference signal SINR measurement according to mapping table in ETSI TS 138.133 [i.14].")
  
    public Integer getNrBNCellRssi() {
    return nrBNCellRssi;
  }

  public void setNrBNCellRssi(Integer nrBNCellRssi) {
    this.nrBNCellRssi = nrBNCellRssi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasRepUeNotificationNrBNCs measRepUeNotificationNrBNCs = (MeasRepUeNotificationNrBNCs) o;
    return Objects.equals(this.nrBNCellInfo, measRepUeNotificationNrBNCs.nrBNCellInfo) &&
        Objects.equals(this.nrBNCellRsrp, measRepUeNotificationNrBNCs.nrBNCellRsrp) &&
        Objects.equals(this.nrBNCellRsrq, measRepUeNotificationNrBNCs.nrBNCellRsrq) &&
        Objects.equals(this.nrBNCellRssi, measRepUeNotificationNrBNCs.nrBNCellRssi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrBNCellInfo, nrBNCellRsrp, nrBNCellRsrq, nrBNCellRssi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeNotificationNrBNCs {\n");
    
    sb.append("    nrBNCellInfo: ").append(toIndentedString(nrBNCellInfo)).append("\n");
    sb.append("    nrBNCellRsrp: ").append(toIndentedString(nrBNCellRsrp)).append("\n");
    sb.append("    nrBNCellRsrq: ").append(toIndentedString(nrBNCellRsrq)).append("\n");
    sb.append("    nrBNCellRssi: ").append(toIndentedString(nrBNCellRssi)).append("\n");
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
