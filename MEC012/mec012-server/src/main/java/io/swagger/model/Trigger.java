package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * As defined in Ref ETSI TS 136 331 [i.7] <p>0 = NOT_AVAILABLE <p>1 = PERIODICAL_REPORT_STRONGEST_CELLS <p>2 = PERIODICAL_REPORT_STRONGEST_CELLS_FOR_SON <p>3 = PERIODICAL_REPORT_CGI <p>4 = INTRA_PERIODICAL_REPORT_STRONGEST_CELLS <p>5 = INTRA_PERIODICAL_REPORT_CGI <p>10 = EVENT_A1 <p>11 = EVENT_A2 <p>12 = EVENT_A3 <p>13 = EVENT_A4 <p>14 = EVENT_A5 <p>15 = EVENT_A6 <p>20 = EVENT_B1 <p>21 = EVENT_B2 <p>20 = EVENT_B1-NR <p>21 = EVENT_B2-NR <p>30 = EVENT_C1 <p>31 = EVENT_C2 <p>40 = EVENT_W1 <p>41 = EVENT_W2 <p>42 = EVENT_W3 <p>50 = EVENT_V1 <p>51 = EVENT_V2 <p>60 = EVENT_H1 <p>61 = EVENT_H2
 */
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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Trigger fromValue(String text) {
    for (Trigger b : Trigger.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
