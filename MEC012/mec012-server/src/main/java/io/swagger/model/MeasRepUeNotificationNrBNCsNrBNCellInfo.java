package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Plmn;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasRepUeNotificationNrBNCsNrBNCellInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeNotificationNrBNCsNrBNCellInfo   {
  @JsonProperty("nrBNCellGId")
  private String nrBNCellGId = null;

  @JsonProperty("nrBNCellPlmn")
  @Valid
  private List<Plmn> nrBNCellPlmn = null;

  public MeasRepUeNotificationNrBNCsNrBNCellInfo nrBNCellGId(String nrBNCellGId) {
    this.nrBNCellGId = nrBNCellGId;
    return this;
  }

  /**
   * Get nrBNCellGId
   * @return nrBNCellGId
  **/
  @ApiModelProperty(value = "")
  
    public String getNrBNCellGId() {
    return nrBNCellGId;
  }

  public void setNrBNCellGId(String nrBNCellGId) {
    this.nrBNCellGId = nrBNCellGId;
  }

  public MeasRepUeNotificationNrBNCsNrBNCellInfo nrBNCellPlmn(List<Plmn> nrBNCellPlmn) {
    this.nrBNCellPlmn = nrBNCellPlmn;
    return this;
  }

  public MeasRepUeNotificationNrBNCsNrBNCellInfo addNrBNCellPlmnItem(Plmn nrBNCellPlmnItem) {
    if (this.nrBNCellPlmn == null) {
      this.nrBNCellPlmn = new ArrayList<Plmn>();
    }
    this.nrBNCellPlmn.add(nrBNCellPlmnItem);
    return this;
  }

  /**
   * Public land mobile network identities
   * @return nrBNCellPlmn
  **/
  @ApiModelProperty(value = "Public land mobile network identities")
      @Valid
  @Size(min=1)   public List<Plmn> getNrBNCellPlmn() {
    return nrBNCellPlmn;
  }

  public void setNrBNCellPlmn(List<Plmn> nrBNCellPlmn) {
    this.nrBNCellPlmn = nrBNCellPlmn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasRepUeNotificationNrBNCsNrBNCellInfo measRepUeNotificationNrBNCsNrBNCellInfo = (MeasRepUeNotificationNrBNCsNrBNCellInfo) o;
    return Objects.equals(this.nrBNCellGId, measRepUeNotificationNrBNCsNrBNCellInfo.nrBNCellGId) &&
        Objects.equals(this.nrBNCellPlmn, measRepUeNotificationNrBNCsNrBNCellInfo.nrBNCellPlmn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrBNCellGId, nrBNCellPlmn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeNotificationNrBNCsNrBNCellInfo {\n");
    
    sb.append("    nrBNCellGId: ").append(toIndentedString(nrBNCellGId)).append("\n");
    sb.append("    nrBNCellPlmn: ").append(toIndentedString(nrBNCellPlmn)).append("\n");
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
