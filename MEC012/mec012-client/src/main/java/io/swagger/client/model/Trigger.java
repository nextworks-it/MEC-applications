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
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * As defined in Ref ETSI TS 136 331 [i.7] &lt;p&gt;0 &#x3D; NOT_AVAILABLE &lt;p&gt;1 &#x3D; PERIODICAL_REPORT_STRONGEST_CELLS &lt;p&gt;2 &#x3D; PERIODICAL_REPORT_STRONGEST_CELLS_FOR_SON &lt;p&gt;3 &#x3D; PERIODICAL_REPORT_CGI &lt;p&gt;4 &#x3D; INTRA_PERIODICAL_REPORT_STRONGEST_CELLS &lt;p&gt;5 &#x3D; INTRA_PERIODICAL_REPORT_CGI &lt;p&gt;10 &#x3D; EVENT_A1 &lt;p&gt;11 &#x3D; EVENT_A2 &lt;p&gt;12 &#x3D; EVENT_A3 &lt;p&gt;13 &#x3D; EVENT_A4 &lt;p&gt;14 &#x3D; EVENT_A5 &lt;p&gt;15 &#x3D; EVENT_A6 &lt;p&gt;20 &#x3D; EVENT_B1 &lt;p&gt;21 &#x3D; EVENT_B2 &lt;p&gt;20 &#x3D; EVENT_B1-NR &lt;p&gt;21 &#x3D; EVENT_B2-NR &lt;p&gt;30 &#x3D; EVENT_C1 &lt;p&gt;31 &#x3D; EVENT_C2 &lt;p&gt;40 &#x3D; EVENT_W1 &lt;p&gt;41 &#x3D; EVENT_W2 &lt;p&gt;42 &#x3D; EVENT_W3 &lt;p&gt;50 &#x3D; EVENT_V1 &lt;p&gt;51 &#x3D; EVENT_V2 &lt;p&gt;60 &#x3D; EVENT_H1 &lt;p&gt;61 &#x3D; EVENT_H2
 */
@JsonAdapter(Trigger.Adapter.class)
public enum Trigger {
  NUMBER_0(0),
  NUMBER_1(1),
  NUMBER_2(2),
  NUMBER_3(3),
  NUMBER_4(4),
  NUMBER_5(5),
  NUMBER_10(10),
  NUMBER_11(11),
  NUMBER_12(12),
  NUMBER_13(13),
  NUMBER_14(14),
  NUMBER_15(15),
  NUMBER_20(20),
  NUMBER_21(21),
  NUMBER_30(30),
  NUMBER_31(31),
  NUMBER_40(40),
  NUMBER_41(41),
  NUMBER_42(42),
  NUMBER_50(50),
  NUMBER_51(51),
  NUMBER_60(60),
  NUMBER_61(61);

  private Integer value;

  Trigger(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Trigger fromValue(String text) {
    for (Trigger b : Trigger.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Trigger> {
    @Override
    public void write(final JsonWriter jsonWriter, final Trigger enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Trigger read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return Trigger.fromValue(String.valueOf(value));
    }
  }
}
