package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Ecgi;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of filtering criteria for the subscription. Any filtering criteria from below, which is included in the request, shall also be included in the response.
 */
@ApiModel(description = "List of filtering criteria for the subscription. Any filtering criteria from below, which is included in the request, shall also be included in the response.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")


public class RabEstSubscriptionFilterCriteriaQci   {
  @JsonProperty("appInstanceId")
  private String appInstanceId = null;

  @JsonProperty("ecgi")
  @Valid
  private List<Ecgi> ecgi = null;

  @JsonProperty("qci")
  private Integer qci = null;

  public RabEstSubscriptionFilterCriteriaQci appInstanceId(String appInstanceId) {
    this.appInstanceId = appInstanceId;
    return this;
  }

  /**
   * Unique identifier for the MEC application instance.
   * @return appInstanceId
  **/
  @ApiModelProperty(value = "Unique identifier for the MEC application instance.")
  
    public String getAppInstanceId() {
    return appInstanceId;
  }

  public void setAppInstanceId(String appInstanceId) {
    this.appInstanceId = appInstanceId;
  }

  public RabEstSubscriptionFilterCriteriaQci ecgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
    return this;
  }

  public RabEstSubscriptionFilterCriteriaQci addEcgiItem(Ecgi ecgiItem) {
    if (this.ecgi == null) {
      this.ecgi = new ArrayList<Ecgi>();
    }
    this.ecgi.add(ecgiItem);
    return this;
  }

  /**
   * E-UTRAN Cell Global Identifier.
   * @return ecgi
  **/
  @ApiModelProperty(value = "E-UTRAN Cell Global Identifier.")
      @Valid
    public List<Ecgi> getEcgi() {
    return ecgi;
  }

  public void setEcgi(List<Ecgi> ecgi) {
    this.ecgi = ecgi;
  }

  public RabEstSubscriptionFilterCriteriaQci qci(Integer qci) {
    this.qci = qci;
    return this;
  }

  /**
   * QoS Class Identifier as defined in ETSI TS 123 401 [i.4].
   * @return qci
  **/
  @ApiModelProperty(required = true, value = "QoS Class Identifier as defined in ETSI TS 123 401 [i.4].")
      @NotNull

    public Integer getQci() {
    return qci;
  }

  public void setQci(Integer qci) {
    this.qci = qci;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabEstSubscriptionFilterCriteriaQci rabEstSubscriptionFilterCriteriaQci = (RabEstSubscriptionFilterCriteriaQci) o;
    return Objects.equals(this.appInstanceId, rabEstSubscriptionFilterCriteriaQci.appInstanceId) &&
        Objects.equals(this.ecgi, rabEstSubscriptionFilterCriteriaQci.ecgi) &&
        Objects.equals(this.qci, rabEstSubscriptionFilterCriteriaQci.qci);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appInstanceId, ecgi, qci);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabEstSubscriptionFilterCriteriaQci {\n");
    
    sb.append("    appInstanceId: ").append(toIndentedString(appInstanceId)).append("\n");
    sb.append("    ecgi: ").append(toIndentedString(ecgi)).append("\n");
    sb.append("    qci: ").append(toIndentedString(qci)).append("\n");
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
