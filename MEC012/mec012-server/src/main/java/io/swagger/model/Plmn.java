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
 * Plmn
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class Plmn   {
  @JsonProperty("mcc")
  private String mcc = null;

  @JsonProperty("mnc")
  private String mnc = null;

  public Plmn mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

  /**
   * The Mobile Country Code part of PLMN Identity as defined in ETSI TS 136 413 [i.3].
   * @return mcc
  **/
  @ApiModelProperty(required = true, value = "The Mobile Country Code part of PLMN Identity as defined in ETSI TS 136 413 [i.3].")
      @NotNull

    public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  public Plmn mnc(String mnc) {
    this.mnc = mnc;
    return this;
  }

  /**
   * The Mobile Network Code part of PLMN Identity as defined in ETSI TS 136 413 [i.3].
   * @return mnc
  **/
  @ApiModelProperty(required = true, value = "The Mobile Network Code part of PLMN Identity as defined in ETSI TS 136 413 [i.3].")
      @NotNull

    public String getMnc() {
    return mnc;
  }

  public void setMnc(String mnc) {
    this.mnc = mnc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmn plmn = (Plmn) o;
    return Objects.equals(this.mcc, plmn.mcc) &&
        Objects.equals(this.mnc, plmn.mnc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, mnc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmn {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
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
