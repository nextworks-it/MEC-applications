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
 * MeasRepUeNotificationNrSCsNrSCellInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-09T15:33:56.133+01:00[Europe/Rome]")
public class MeasRepUeNotificationNrSCsNrSCellInfo {
  @SerializedName("nrSCellGId")
  private String nrSCellGId = null;

  @SerializedName("nrSCellPlmn")
  private List<Plmn> nrSCellPlmn = null;

  public MeasRepUeNotificationNrSCsNrSCellInfo nrSCellGId(String nrSCellGId) {
    this.nrSCellGId = nrSCellGId;
    return this;
  }

   /**
   * Get nrSCellGId
   * @return nrSCellGId
  **/
  @Schema(description = "")
  public String getNrSCellGId() {
    return nrSCellGId;
  }

  public void setNrSCellGId(String nrSCellGId) {
    this.nrSCellGId = nrSCellGId;
  }

  public MeasRepUeNotificationNrSCsNrSCellInfo nrSCellPlmn(List<Plmn> nrSCellPlmn) {
    this.nrSCellPlmn = nrSCellPlmn;
    return this;
  }

  public MeasRepUeNotificationNrSCsNrSCellInfo addNrSCellPlmnItem(Plmn nrSCellPlmnItem) {
    if (this.nrSCellPlmn == null) {
      this.nrSCellPlmn = new ArrayList<Plmn>();
    }
    this.nrSCellPlmn.add(nrSCellPlmnItem);
    return this;
  }

   /**
   * Public land mobile network identities.
   * @return nrSCellPlmn
  **/
  @Schema(description = "Public land mobile network identities.")
  public List<Plmn> getNrSCellPlmn() {
    return nrSCellPlmn;
  }

  public void setNrSCellPlmn(List<Plmn> nrSCellPlmn) {
    this.nrSCellPlmn = nrSCellPlmn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasRepUeNotificationNrSCsNrSCellInfo measRepUeNotificationNrSCsNrSCellInfo = (MeasRepUeNotificationNrSCsNrSCellInfo) o;
    return Objects.equals(this.nrSCellGId, measRepUeNotificationNrSCsNrSCellInfo.nrSCellGId) &&
        Objects.equals(this.nrSCellPlmn, measRepUeNotificationNrSCsNrSCellInfo.nrSCellPlmn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrSCellGId, nrSCellPlmn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeNotificationNrSCsNrSCellInfo {\n");
    
    sb.append("    nrSCellGId: ").append(toIndentedString(nrSCellGId)).append("\n");
    sb.append("    nrSCellPlmn: ").append(toIndentedString(nrSCellPlmn)).append("\n");
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
