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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CellChangeNotification
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-09T15:33:56.133+01:00[Europe/Rome]")
public class CellChangeNotification implements OneOfInlineNotification {
  @SerializedName("associateId")
  private List<AssociateId> associateId = null;

  /**
   * Indicate the status of the UE handover procedure. Values are defined as following: &lt;p&gt;1 &#x3D; IN_PREPARATION. &lt;p&gt;2 &#x3D; IN_EXECUTION. &lt;p&gt;3 &#x3D; COMPLETED. &lt;p&gt;4 &#x3D; REJECTED. &lt;p&gt;5 &#x3D; CANCELLED.
   */
  @JsonAdapter(HoStatusEnum.Adapter.class)
  public enum HoStatusEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4),
    NUMBER_5(5);

    private Integer value;

    HoStatusEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HoStatusEnum fromValue(String text) {
      for (HoStatusEnum b : HoStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HoStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HoStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HoStatusEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return HoStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("hoStatus")
  private HoStatusEnum hoStatus = null;

  @SerializedName("notificationType")
  private String notificationType = null;

  @SerializedName("srcEcgi")
  private Ecgi srcEcgi = null;

  @SerializedName("tempUeId")
  private CellChangeNotificationTempUeId tempUeId = null;

  @SerializedName("timeStamp")
  private TimeStamp timeStamp = null;

  @SerializedName("trgEcgi")
  private List<Ecgi> trgEcgi = new ArrayList<Ecgi>();

  public CellChangeNotification associateId(List<AssociateId> associateId) {
    this.associateId = associateId;
    return this;
  }

  public CellChangeNotification addAssociateIdItem(AssociateId associateIdItem) {
    if (this.associateId == null) {
      this.associateId = new ArrayList<AssociateId>();
    }
    this.associateId.add(associateIdItem);
    return this;
  }

   /**
   * 0 to N identifiers to associate the event for a specific UE or flow.
   * @return associateId
  **/
  @Schema(description = "0 to N identifiers to associate the event for a specific UE or flow.")
  public List<AssociateId> getAssociateId() {
    return associateId;
  }

  public void setAssociateId(List<AssociateId> associateId) {
    this.associateId = associateId;
  }

  public CellChangeNotification hoStatus(HoStatusEnum hoStatus) {
    this.hoStatus = hoStatus;
    return this;
  }

   /**
   * Indicate the status of the UE handover procedure. Values are defined as following: &lt;p&gt;1 &#x3D; IN_PREPARATION. &lt;p&gt;2 &#x3D; IN_EXECUTION. &lt;p&gt;3 &#x3D; COMPLETED. &lt;p&gt;4 &#x3D; REJECTED. &lt;p&gt;5 &#x3D; CANCELLED.
   * @return hoStatus
  **/
  @Schema(required = true, description = "Indicate the status of the UE handover procedure. Values are defined as following: <p>1 = IN_PREPARATION. <p>2 = IN_EXECUTION. <p>3 = COMPLETED. <p>4 = REJECTED. <p>5 = CANCELLED.")
  public HoStatusEnum getHoStatus() {
    return hoStatus;
  }

  public void setHoStatus(HoStatusEnum hoStatus) {
    this.hoStatus = hoStatus;
  }

  public CellChangeNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Shall be set to \&quot;CellChangeNotification\&quot;.
   * @return notificationType
  **/
  @Schema(required = true, description = "Shall be set to \"CellChangeNotification\".")
  public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public CellChangeNotification srcEcgi(Ecgi srcEcgi) {
    this.srcEcgi = srcEcgi;
    return this;
  }

   /**
   * Get srcEcgi
   * @return srcEcgi
  **/
  @Schema(required = true, description = "")
  public Ecgi getSrcEcgi() {
    return srcEcgi;
  }

  public void setSrcEcgi(Ecgi srcEcgi) {
    this.srcEcgi = srcEcgi;
  }

  public CellChangeNotification tempUeId(CellChangeNotificationTempUeId tempUeId) {
    this.tempUeId = tempUeId;
    return this;
  }

   /**
   * Get tempUeId
   * @return tempUeId
  **/
  @Schema(description = "")
  public CellChangeNotificationTempUeId getTempUeId() {
    return tempUeId;
  }

  public void setTempUeId(CellChangeNotificationTempUeId tempUeId) {
    this.tempUeId = tempUeId;
  }

  public CellChangeNotification timeStamp(TimeStamp timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @Schema(description = "")
  public TimeStamp getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(TimeStamp timeStamp) {
    this.timeStamp = timeStamp;
  }

  public CellChangeNotification trgEcgi(List<Ecgi> trgEcgi) {
    this.trgEcgi = trgEcgi;
    return this;
  }

  public CellChangeNotification addTrgEcgiItem(Ecgi trgEcgiItem) {
    this.trgEcgi.add(trgEcgiItem);
    return this;
  }

   /**
   * E-UTRAN Cell Global Identifier of the target cell. NOTE: Cardinality N is valid only in case of statuses IN_PREPARATION, REJECTED and CANCELLED.
   * @return trgEcgi
  **/
  @Schema(required = true, description = "E-UTRAN Cell Global Identifier of the target cell. NOTE: Cardinality N is valid only in case of statuses IN_PREPARATION, REJECTED and CANCELLED.")
  public List<Ecgi> getTrgEcgi() {
    return trgEcgi;
  }

  public void setTrgEcgi(List<Ecgi> trgEcgi) {
    this.trgEcgi = trgEcgi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellChangeNotification cellChangeNotification = (CellChangeNotification) o;
    return Objects.equals(this.associateId, cellChangeNotification.associateId) &&
        Objects.equals(this.hoStatus, cellChangeNotification.hoStatus) &&
        Objects.equals(this.notificationType, cellChangeNotification.notificationType) &&
        Objects.equals(this.srcEcgi, cellChangeNotification.srcEcgi) &&
        Objects.equals(this.tempUeId, cellChangeNotification.tempUeId) &&
        Objects.equals(this.timeStamp, cellChangeNotification.timeStamp) &&
        Objects.equals(this.trgEcgi, cellChangeNotification.trgEcgi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateId, hoStatus, notificationType, srcEcgi, tempUeId, timeStamp, trgEcgi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellChangeNotification {\n");
    
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    hoStatus: ").append(toIndentedString(hoStatus)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    srcEcgi: ").append(toIndentedString(srcEcgi)).append("\n");
    sb.append("    tempUeId: ").append(toIndentedString(tempUeId)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    trgEcgi: ").append(toIndentedString(trgEcgi)).append("\n");
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
