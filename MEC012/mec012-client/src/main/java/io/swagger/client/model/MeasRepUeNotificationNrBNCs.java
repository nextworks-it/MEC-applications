/*
 * ETSI GS MEC 012 - Radio Network Information API
 * The ETSI MEC ISG MEC012 Radio Network Information API described using OpenAPI.
 *
 * OpenAPI spec version: 2.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Measurement quantities concerning the best neighbours of the secondary serving cells
 */
@Schema(description = "Measurement quantities concerning the best neighbours of the secondary serving cells")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-09T15:33:56.133+01:00[Europe/Rome]")
public class MeasRepUeNotificationNrBNCs {
  @SerializedName("nrBNCellInfo")
  private List<MeasRepUeNotificationNrBNCsNrBNCellInfo> nrBNCellInfo = new ArrayList<MeasRepUeNotificationNrBNCsNrBNCellInfo>();

  @SerializedName("nrBNCellRsrp")
  private Integer nrBNCellRsrp = null;

  @SerializedName("nrBNCellRsrq")
  private Integer nrBNCellRsrq = null;

  @SerializedName("nrBNCellRssi")
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
  @Schema(required = true, description = "Best neighbours of the secondary serving cell(s) info")
  public List<MeasRepUeNotificationNrBNCsNrBNCellInfo> getNrBNCellInfo() {
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
  @Schema(description = "Reference Signal Received Power measurement according to mapping table in ETSI TS 138.133 [i.14].")
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
  @Schema(description = "Reference Signal Received Quality measurement according to mapping table in ETSI TS 138.133 [i.14].")
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
  @Schema(description = "Reference signal SINR measurement according to mapping table in ETSI TS 138.133 [i.14].")
  public Integer getNrBNCellRssi() {
    return nrBNCellRssi;
  }

  public void setNrBNCellRssi(Integer nrBNCellRssi) {
    this.nrBNCellRssi = nrBNCellRssi;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
