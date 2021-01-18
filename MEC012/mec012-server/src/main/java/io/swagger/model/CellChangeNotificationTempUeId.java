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
 * The temporary identifier allocated for the specific UE as defined below.
 */
@ApiModel(description = "The temporary identifier allocated for the specific UE as defined below.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class CellChangeNotificationTempUeId   {
  @JsonProperty("mmec")
  private String mmec = null;

  @JsonProperty("mtmsi")
  private String mtmsi = null;

  public CellChangeNotificationTempUeId mmec(String mmec) {
    this.mmec = mmec;
    return this;
  }

  /**
   * MMEC as defined in ETSI TS 136 413 [i.3].
   * @return mmec
  **/
  @ApiModelProperty(required = true, value = "MMEC as defined in ETSI TS 136 413 [i.3].")
      @NotNull

    public String getMmec() {
    return mmec;
  }

  public void setMmec(String mmec) {
    this.mmec = mmec;
  }

  public CellChangeNotificationTempUeId mtmsi(String mtmsi) {
    this.mtmsi = mtmsi;
    return this;
  }

  /**
   * M-TMSI as defined in ETSI TS 136 413 [i.3].
   * @return mtmsi
  **/
  @ApiModelProperty(required = true, value = "M-TMSI as defined in ETSI TS 136 413 [i.3].")
      @NotNull

    public String getMtmsi() {
    return mtmsi;
  }

  public void setMtmsi(String mtmsi) {
    this.mtmsi = mtmsi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellChangeNotificationTempUeId cellChangeNotificationTempUeId = (CellChangeNotificationTempUeId) o;
    return Objects.equals(this.mmec, cellChangeNotificationTempUeId.mmec) &&
        Objects.equals(this.mtmsi, cellChangeNotificationTempUeId.mtmsi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mmec, mtmsi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellChangeNotificationTempUeId {\n");
    
    sb.append("    mmec: ").append(toIndentedString(mmec)).append("\n");
    sb.append("    mtmsi: ").append(toIndentedString(mtmsi)).append("\n");
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
