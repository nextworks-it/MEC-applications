package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The enumeration Trigger represents specified triggers for a 5G UE Measurement Report. Full details can be found in ETSI TS 138 331 [i.13]). <p>0 = NOT_AVAILABLE <p>1 = NR_PERIODICAL <p>2 = NR_CGI <p>10 = EVENT_A1 <p>11 = EVENT_A2 <p>12 = EVENT_A3 <p>13 = EVENT_A4 <p>14 = EVENT_A5 <p>15 = EVENT_A6 <p>20 = INTER_RAT_PERIODICAL <p>21 = INTER_RAT_CGI <p>30 = EVENT_B1 <p>31 = EVENT_B2
 */
public enum TriggerNr {
  NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_10(10),
    NUMBER_11(11),
    NUMBER_12(12),
    NUMBER_13(13),
    NUMBER_14(14),
    NUMBER_15(15),
    NUMBER_20(20),
    NUMBER_21(21),
    NUMBER_30(30),
    NUMBER_31(31);

  private Integer value;

  TriggerNr(Integer value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TriggerNr fromValue(String text) {
    for (TriggerNr b : TriggerNr.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
