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
 * MeasRepUeNotificationNrSCsNrSCellInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeNotificationNrSCsNrSCellInfo   {
  @JsonProperty("nrSCellGId")
  private String nrSCellGId = null;

  @JsonProperty("nrSCellPlmn")
  @Valid
  private List<Plmn> nrSCellPlmn = null;

  public MeasRepUeNotificationNrSCsNrSCellInfo nrSCellGId(String nrSCellGId) {
    this.nrSCellGId = nrSCellGId;
    return this;
  }

  /**
   * Get nrSCellGId
   * @return nrSCellGId
  **/
  @ApiModelProperty(value = "")
  
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
  @ApiModelProperty(value = "Public land mobile network identities.")
      @Valid
  @Size(min=1)   public List<Plmn> getNrSCellPlmn() {
    return nrSCellPlmn;
  }

  public void setNrSCellPlmn(List<Plmn> nrSCellPlmn) {
    this.nrSCellPlmn = nrSCellPlmn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
