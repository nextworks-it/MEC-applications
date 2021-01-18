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

import java.util.Objects;

/**
 * Ecgi
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-09T15:33:56.133+01:00[Europe/Rome]")
public class Ecgi {
  @SerializedName("cellId")
  private String cellId = null;

  @SerializedName("plmn")
  private Plmn plmn = null;

  public Ecgi cellId(String cellId) {
    this.cellId = cellId;
    return this;
  }

   /**
   * Get cellId
   * @return cellId
  **/
  @Schema(required = true, description = "")
  public String getCellId() {
    return cellId;
  }

  public void setCellId(String cellId) {
    this.cellId = cellId;
  }

  public Ecgi plmn(Plmn plmn) {
    this.plmn = plmn;
    return this;
  }

   /**
   * Get plmn
   * @return plmn
  **/
  @Schema(required = true, description = "")
  public Plmn getPlmn() {
    return plmn;
  }

  public void setPlmn(Plmn plmn) {
    this.plmn = plmn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ecgi ecgi = (Ecgi) o;
    return Objects.equals(this.cellId, ecgi.cellId) &&
        Objects.equals(this.plmn, ecgi.plmn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellId, plmn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ecgi {\n");
    
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
    sb.append("    plmn: ").append(toIndentedString(plmn)).append("\n");
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
