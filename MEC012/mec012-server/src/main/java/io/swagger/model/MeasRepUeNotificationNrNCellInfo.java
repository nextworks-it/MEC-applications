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
 * MeasRepUeNotificationNrNCellInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class MeasRepUeNotificationNrNCellInfo   {
  @JsonProperty("nrNCellGId")
  private String nrNCellGId = null;

  @JsonProperty("nrNCellPlmn")
  @Valid
  private List<Plmn> nrNCellPlmn = null;

  public MeasRepUeNotificationNrNCellInfo nrNCellGId(String nrNCellGId) {
    this.nrNCellGId = nrNCellGId;
    return this;
  }

  /**
   * Get nrNCellGId
   * @return nrNCellGId
  **/
  @ApiModelProperty(value = "")
  
    public String getNrNCellGId() {
    return nrNCellGId;
  }

  public void setNrNCellGId(String nrNCellGId) {
    this.nrNCellGId = nrNCellGId;
  }

  public MeasRepUeNotificationNrNCellInfo nrNCellPlmn(List<Plmn> nrNCellPlmn) {
    this.nrNCellPlmn = nrNCellPlmn;
    return this;
  }

  public MeasRepUeNotificationNrNCellInfo addNrNCellPlmnItem(Plmn nrNCellPlmnItem) {
    if (this.nrNCellPlmn == null) {
      this.nrNCellPlmn = new ArrayList<Plmn>();
    }
    this.nrNCellPlmn.add(nrNCellPlmnItem);
    return this;
  }

  /**
   * Public land mobile network identities.
   * @return nrNCellPlmn
  **/
  @ApiModelProperty(value = "Public land mobile network identities.")
      @Valid
  @Size(min=1)   public List<Plmn> getNrNCellPlmn() {
    return nrNCellPlmn;
  }

  public void setNrNCellPlmn(List<Plmn> nrNCellPlmn) {
    this.nrNCellPlmn = nrNCellPlmn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasRepUeNotificationNrNCellInfo measRepUeNotificationNrNCellInfo = (MeasRepUeNotificationNrNCellInfo) o;
    return Objects.equals(this.nrNCellGId, measRepUeNotificationNrNCellInfo.nrNCellGId) &&
        Objects.equals(this.nrNCellPlmn, measRepUeNotificationNrNCellInfo.nrNCellPlmn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nrNCellGId, nrNCellPlmn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasRepUeNotificationNrNCellInfo {\n");
    
    sb.append("    nrNCellGId: ").append(toIndentedString(nrNCellGId)).append("\n");
    sb.append("    nrNCellPlmn: ").append(toIndentedString(nrNCellPlmn)).append("\n");
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
