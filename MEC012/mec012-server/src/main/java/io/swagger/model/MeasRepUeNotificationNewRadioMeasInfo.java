package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasRepUeNotificationNrBNCs;
import io.swagger.model.MeasRepUeNotificationNrSCs;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasRepUeNotificationNewRadioMeasInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeNotificationNewRadioMeasInfo   {
  @JsonProperty("nrBNCs")
  private MeasRepUeNotificationNrBNCs nrBNCs = null;

  @JsonProperty("nrCarrierFreq")
  private Integer nrCarrierFreq = null;

  @JsonProperty("nrSCs")
  private MeasRepUeNotificationNrSCs nrSCs = null;

  public MeasRepUeNotificationNewRadioMeasInfo nrBNCs(MeasRepUeNotificationNrBNCs nrBNCs) {
    this.nrBNCs = nrBNCs;
    return this;
  }

  /**
   * Get nrBNCs
   * @return nrBNCs
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasRepUeNotificationNrBNCs getNrBNCs() {
    return nrBNCs;
  }

  public void setNrBNCs(MeasRepUeNotificationNrBNCs nrBNCs) {
    this.nrBNCs = nrBNCs;
  }

  public MeasRepUeNotificationNewRadioMeasInfo nrCarrierFreq(Integer nrCarrierFreq) {
    this.nrCarrierFreq = nrCarrierFreq;
    return this;
  }

  /**
   * ARFCN applicable for a downlink, uplink or bi-directional (TDD) NR carrier frequency, as defined in ETSI TS 138.101 [i.15].
   * @return nrCarrierFreq
  **/
  @ApiModelProperty(value = "ARFCN applicable for a downlink, uplink or bi-directional (TDD) NR carrier frequency, as defined in ETSI TS 138.101 [i.15].")
  
    public Integer getNrCarrierFreq() {
    return nrCarrierFreq;
  }

  public void setNrCarrierFreq(Integer nrCarrierFreq) {
    this.nrCarrierFreq = nrCarrierFreq;
  }

  public MeasRepUeNotificationNewRadioMeasInfo nrSCs(MeasRepUeNotificationNrSCs nrSCs) {
    this.nrSCs = nrSCs;
    return this;
  }

  /**
   * Get nrSCs
   * @return nrSCs
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MeasRepUeNotificationNrSCs getNrSCs() {
    return nrSCs;
  }

  public void setNrSCs(MeasRepUeNotificationNrSCs nrSCs) {
    this.nrSCs = nrSCs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasRepUeNotificationNewRadioMeasInfo measRepUeNotificationNewRadioMeasInfo = (MeasRepUeNotificationNewRadioMeasInfo) o;
    return Objects.equals(this.nrBNCs, measRepUeNotificationNewRadioMeasInfo.nrBNCs) &&
        Objects.equals(this.nrCarrierFreq, measRepUeNotificationNewRadioMeasInfo.nrCarrierFreq) &&
        Objects.equals(this.nrSCs, measRepUeNotificationNewRadioMeasInfo.nrSCs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrBNCs, nrCarrierFreq, nrSCs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeNotificationNewRadioMeasInfo {\n");
    
    sb.append("    nrBNCs: ").append(toIndentedString(nrBNCs)).append("\n");
    sb.append("    nrCarrierFreq: ").append(toIndentedString(nrCarrierFreq)).append("\n");
    sb.append("    nrSCs: ").append(toIndentedString(nrSCs)).append("\n");
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
