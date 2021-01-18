package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssociateId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class AssociateId   {
  /**
   * Numeric value (0-255) corresponding to specified type of identifier as following: <p>0 = reserved. <p>1 = UE_IPv4_ADDRESS. <p>2 = UE_IPV6_ADDRESS. <p>3 = NATED_IP_ADDRESS. <p>4 = GTP_TEID.
   */
  public enum TypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("value")
  private String value = null;

  public AssociateId type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Numeric value (0-255) corresponding to specified type of identifier as following: <p>0 = reserved. <p>1 = UE_IPv4_ADDRESS. <p>2 = UE_IPV6_ADDRESS. <p>3 = NATED_IP_ADDRESS. <p>4 = GTP_TEID.
   * @return type
  **/
  @ApiModelProperty(value = "Numeric value (0-255) corresponding to specified type of identifier as following: <p>0 = reserved. <p>1 = UE_IPv4_ADDRESS. <p>2 = UE_IPV6_ADDRESS. <p>3 = NATED_IP_ADDRESS. <p>4 = GTP_TEID.")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AssociateId value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value for the identifier.
   * @return value
  **/
  @ApiModelProperty(value = "Value for the identifier.")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateId associateId = (AssociateId) o;
    return Objects.equals(this.type, associateId.type) &&
        Objects.equals(this.value, associateId.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateId {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
