package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Plmn;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ecgi
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class Ecgi   {
  @JsonProperty("cellId")
  private String cellId = null;

  @JsonProperty("plmn")
  private Plmn plmn = null;

  public Ecgi cellId(String cellId) {
    this.cellId = cellId;
    return this;
  }

  /**
   * Get cellId
   * @return cellId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

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
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Plmn getPlmn() {
    return plmn;
  }

  public void setPlmn(Plmn plmn) {
    this.plmn = plmn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
