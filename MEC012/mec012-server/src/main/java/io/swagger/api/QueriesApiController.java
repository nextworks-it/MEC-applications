package io.swagger.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import io.swagger.Handover.RabInfoFactory;
import io.swagger.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")
@Controller
public class QueriesApiController implements QueriesApi {

    private static final Logger log = LoggerFactory.getLogger(QueriesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private RabInfoFactory rabInfoFactory;

    @org.springframework.beans.factory.annotation.Autowired
    public QueriesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        rabInfoFactory = new RabInfoFactory();
    }

    public ResponseEntity<L2Meas> layer2MeasInfoGET(@ApiParam(value = "Application instance identifier") @Valid @RequestParam(value = "app_ins_id", required = false) String appInsId
,@ApiParam(value = "Comma separated list of E-UTRAN Cell Identities") @Valid @RequestParam(value = "cell_id", required = false) List<String> cellId
,@ApiParam(value = "Comma separated list of IE IPv4 addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "ue_ipv4_address", required = false) List<String> ueIpv4Address
,@ApiParam(value = "Comma separated list of IE IPv6 addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "ue_ipv6_address", required = false) List<String> ueIpv6Address
,@ApiParam(value = "Comma separated list of IE NATed IP addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "nated_ip_address", required = false) List<String> natedIpAddress
,@ApiParam(value = "Comma separated list of GTP TEID addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "gtp_teid", required = false) List<String> gtpTeid
,@ApiParam(value = "PRB usage for downlink GBR traffic in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_gbr_prb_usage_cell", required = false) Integer dlGbrPrbUsageCell
,@ApiParam(value = "PRB usage for uplink GBR traffic in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_gbr_prb_usage_cell", required = false) Integer ulGbrPrbUsageCell
,@ApiParam(value = "PRB usage for downlink non-GBR traffic in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_nongbr_prb_usage_cell", required = false) Integer dlNongbrPrbUsageCell
,@ApiParam(value = "PRB usage for uplink non-GBR traffic in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_nongbr_prb_usage_cell", required = false) Integer ulNongbrPrbUsageCell
,@ApiParam(value = "PRB usage for total downlink traffic in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_total_prb_usage_cell", required = false) Integer dlTotalPrbUsageCell
,@ApiParam(value = "PRB usage for total uplink traffic in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_total_prb_usage_cell", required = false) Integer ulTotalPrbUsageCell
,@ApiParam(value = "Received dedicated preambles in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "received_dedicated_preambles_cell", required = false) Integer receivedDedicatedPreamblesCell
,@ApiParam(value = "Received randomly selected preambles in the low range in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "received_randomly_selected_preambles_low_range_cell", required = false) Integer receivedRandomlySelectedPreamblesLowRangeCell
,@ApiParam(value = "Received rendomly selected preambles in the high range in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "received_randomly_selected_preambles_high_range_cell", required = false) Integer receivedRandomlySelectedPreamblesHighRangeCell
,@ApiParam(value = "Number of active UEs with downlink GBR traffic as defined in ETSI TS 136 314") @Valid @RequestParam(value = "number_of_active_ue_dl_gbr_cell", required = false) Integer numberOfActiveUeDlGbrCell
,@ApiParam(value = "Number of active UEs with uplink GBR traffic as defined in ETSI TS 136 314") @Valid @RequestParam(value = "number_of_active_ue_ul_gbr_cell", required = false) Integer numberOfActiveUeUlGbrCell
,@ApiParam(value = "Number of active UEs with downlink non-GBR traffic as defined in ETSI TS 136 314") @Valid @RequestParam(value = "number_of_active_ue_dl_nongbr_cell", required = false) Integer numberOfActiveUeDlNongbrCell
,@ApiParam(value = "Number of active UEs with uplink non-GBR traffic as defined in ETSI TS 136 314") @Valid @RequestParam(value = "number_of_active_ue_ul_nongbr_cell", required = false) Integer numberOfActiveUeUlNongbrCell
,@ApiParam(value = "Packet discard rate for downlink GBR traffic in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_gbr_pdr_cell", required = false) Integer dlGbrPdrCell
,@ApiParam(value = "Packet discard rate for uplink GBR traffic in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_gbr_pdr_cell", required = false) Integer ulGbrPdrCell
,@ApiParam(value = "Packet discard rate for downlink non-GBR traffic in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_nongbr_pdr_cell", required = false) Integer dlNongbrPdrCell
,@ApiParam(value = "Packet discard rate for uplink non-GBR traffic in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_nongbr_pdr_cell", required = false) Integer ulNongbrPdrCell
,@ApiParam(value = "Packet delay of downlink GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_gbr_delay_ue", required = false) Integer dlGbrDelayUe
,@ApiParam(value = "Packet delay of uplink GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_gbr_delay_ue", required = false) Integer ulGbrDelayUe
,@ApiParam(value = "Packet delay of downlink non-GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_nongbr_delay_ue", required = false) Integer dlNongbrDelayUe
,@ApiParam(value = "Packet delay of uplink non-GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_nongbr_delay_ue", required = false) Integer ulNongbrDelayUe
,@ApiParam(value = "Packet discard rate of downlink GBR traffic of a UE in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_gbr_pdr_ue", required = false) Integer dlGbrPdrUe
,@ApiParam(value = "Packet discard rate of uplink GBR traffic of a UE in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_gbr_pdr_ue", required = false) Integer ulGbrPdrUe
,@ApiParam(value = "Packet discard rate of downlink non-GBR traffic of a UE in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_nongbr_pdr_ue", required = false) Integer dlNongbrPdrUe
,@ApiParam(value = "Packet discard rate of uplink non-GBR traffic of a UE in percentage as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_nongbr_pdr_ue", required = false) Integer ulNongbrPdrUe
,@ApiParam(value = "Scheduled throughput of downlink GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_gbr_throughput_ue", required = false) Integer dlGbrThroughputUe
,@ApiParam(value = "Scheduled throughput of uplink GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_gbr_throughput_ue", required = false) Integer ulGbrThroughputUe
,@ApiParam(value = "Scheduled throughput of downlink non-GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_nongbr_throughput_ue", required = false) Integer dlNongbrThroughputUe
,@ApiParam(value = "Scheduled throughput of uplink non-GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_nongbr_throughput_ue", required = false) Integer ulNongbrThroughputUe
,@ApiParam(value = "Data volume of downlink GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_gbr_data_volume_ue", required = false) Integer dlGbrDataVolumeUe
,@ApiParam(value = "Data volume of uplink GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_gbr_data_volume_ue", required = false) Integer ulGbrDataVolumeUe
,@ApiParam(value = "Data volume of downlink non-GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "dl_nongbr_data_volume_ue", required = false) Integer dlNongbrDataVolumeUe
,@ApiParam(value = "Data volume of uplink non-GBR traffic of a UE as defined in ETSI TS 136 314") @Valid @RequestParam(value = "ul_nongbr_data_volume_ue", required = false) Integer ulNongbrDataVolumeUe
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<L2Meas>(objectMapper.readValue("{\n  \"timeStamp\" : {\n    \"seconds\" : 3,\n    \"nanoSeconds\" : 9\n  },\n  \"cellUEInfo\" : [ {\n    \"dl_gbr_delay_ue\" : 4,\n    \"ul_nongbr_data_volume_ue\" : 2,\n    \"dl_nongbr_delay_ue\" : 6,\n    \"ul_gbr_delay_ue\" : 3,\n    \"ul_gbr_throughput_ue\" : 1,\n    \"ul_nongbr_delay_ue\" : 6,\n    \"dl_nongbr_throughput_ue\" : 9,\n    \"ul_gbr_data_volume_ue\" : 6,\n    \"dl_nongbr_data_volume_ue\" : 9,\n    \"dl_gbr_data_volume_ue\" : 1,\n    \"associateId\" : {\n      \"type\" : 0,\n      \"value\" : \"value\"\n    },\n    \"dl_gbr_throughput_ue\" : 9,\n    \"dl_nongbr_pdr_ue\" : 8,\n    \"ul_nongbr_throughput_ue\" : 5,\n    \"ul_nongbr_pdr_ue\" : 6,\n    \"dl_gbr_pdr_ue\" : 5,\n    \"ul_gbr_pdr_ue\" : 6\n  }, {\n    \"dl_gbr_delay_ue\" : 4,\n    \"ul_nongbr_data_volume_ue\" : 2,\n    \"dl_nongbr_delay_ue\" : 6,\n    \"ul_gbr_delay_ue\" : 3,\n    \"ul_gbr_throughput_ue\" : 1,\n    \"ul_nongbr_delay_ue\" : 6,\n    \"dl_nongbr_throughput_ue\" : 9,\n    \"ul_gbr_data_volume_ue\" : 6,\n    \"dl_nongbr_data_volume_ue\" : 9,\n    \"dl_gbr_data_volume_ue\" : 1,\n    \"associateId\" : {\n      \"type\" : 0,\n      \"value\" : \"value\"\n    },\n    \"dl_gbr_throughput_ue\" : 9,\n    \"dl_nongbr_pdr_ue\" : 8,\n    \"ul_nongbr_throughput_ue\" : 5,\n    \"ul_nongbr_pdr_ue\" : 6,\n    \"dl_gbr_pdr_ue\" : 5,\n    \"ul_gbr_pdr_ue\" : 6\n  } ],\n  \"cellInfo\" : [ {\n    \"number_of_active_ue_dl_nongbr_cell\" : 7,\n    \"ul_total_prb_usage_cell\" : 7,\n    \"received_dedicated_preambles_cell\" : 2,\n    \"dl_total_prb_usage_cell\" : 5,\n    \"ul_gbr_prb_usage_cell\" : 1,\n    \"dl_gbr_pdr_cell\" : 0,\n    \"number_of_active_ue_ul_gbr_cell\" : 9,\n    \"ul_nongbr_pdr_cell\" : 1,\n    \"dl_nongbr_pdr_cell\" : 1,\n    \"number_of_active_ue_dl_gbr_cell\" : 2,\n    \"ecgi\" : {\n      \"plmn\" : {\n        \"mnc\" : \"mnc\",\n        \"mcc\" : \"mcc\"\n      },\n      \"cellId\" : \"cellId\"\n    },\n    \"ul_gbr_pdr_cell\" : 1,\n    \"ul_nongbr_prb_usage_cell\" : 6,\n    \"received_randomly_selected_preambles_low_range_cell\" : 7,\n    \"number_of_active_ue_ul_nongbr_cell\" : 3,\n    \"received_randomly_selected_preambles_high_range_cell\" : 4,\n    \"dl_nongbr_prb_usage_cell\" : 5,\n    \"dl_gbr_prb_usage_cell\" : 6\n  }, {\n    \"number_of_active_ue_dl_nongbr_cell\" : 7,\n    \"ul_total_prb_usage_cell\" : 7,\n    \"received_dedicated_preambles_cell\" : 2,\n    \"dl_total_prb_usage_cell\" : 5,\n    \"ul_gbr_prb_usage_cell\" : 1,\n    \"dl_gbr_pdr_cell\" : 0,\n    \"number_of_active_ue_ul_gbr_cell\" : 9,\n    \"ul_nongbr_pdr_cell\" : 1,\n    \"dl_nongbr_pdr_cell\" : 1,\n    \"number_of_active_ue_dl_gbr_cell\" : 2,\n    \"ecgi\" : {\n      \"plmn\" : {\n        \"mnc\" : \"mnc\",\n        \"mcc\" : \"mcc\"\n      },\n      \"cellId\" : \"cellId\"\n    },\n    \"ul_gbr_pdr_cell\" : 1,\n    \"ul_nongbr_prb_usage_cell\" : 6,\n    \"received_randomly_selected_preambles_low_range_cell\" : 7,\n    \"number_of_active_ue_ul_nongbr_cell\" : 3,\n    \"received_randomly_selected_preambles_high_range_cell\" : 4,\n    \"dl_nongbr_prb_usage_cell\" : 5,\n    \"dl_gbr_prb_usage_cell\" : 6\n  } ]\n}", L2Meas.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<L2Meas>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<L2Meas>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<PlmnInfo>> plmnInfoGET(@NotNull @ApiParam(value = "Comma separated list of Application instance identifiers", required = true) @Valid @RequestParam(value = "app_ins_id", required = true) List<String> appInsId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<PlmnInfo>>(objectMapper.readValue("[ {\n  \"appInstanceId\" : \"appInstanceId\",\n  \"timeStamp\" : {\n    \"seconds\" : 3,\n    \"nanoSeconds\" : 9\n  },\n  \"plmn\" : [ {\n    \"mnc\" : \"mnc\",\n    \"mcc\" : \"mcc\"\n  }, {\n    \"mnc\" : \"mnc\",\n    \"mcc\" : \"mcc\"\n  } ]\n}, {\n  \"appInstanceId\" : \"appInstanceId\",\n  \"timeStamp\" : {\n    \"seconds\" : 3,\n    \"nanoSeconds\" : 9\n  },\n  \"plmn\" : [ {\n    \"mnc\" : \"mnc\",\n    \"mcc\" : \"mcc\"\n  }, {\n    \"mnc\" : \"mnc\",\n    \"mcc\" : \"mcc\"\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PlmnInfo>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PlmnInfo>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RabInfo> rabInfoGET(@ApiParam(value = "Application instance identifier") @Valid @RequestParam(value = "app_ins_id", required = false) String appInsId
,@ApiParam(value = "Comma separated list of E-UTRAN Cell Identities") @Valid @RequestParam(value = "cell_id", required = false) List<String> cellId
,@ApiParam(value = "Comma separated list of IE IPv4 addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "ue_ipv4_address", required = false) List<String> ueIpv4Address
,@ApiParam(value = "Comma separated list of IE IPv6 addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "ue_ipv6_address", required = false) List<String> ueIpv6Address
,@ApiParam(value = "Comma separated list of IE NATed IP addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "nated_ip_address", required = false) List<String> natedIpAddress
,@ApiParam(value = "Comma separated list of GTP TEID addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "gtp_teid", required = false) List<String> gtpTeid
,@ApiParam(value = "E-RAB identifier") @Valid @RequestParam(value = "erab_id", required = false) Integer erabId
,@ApiParam(value = "QoS Class Identifier as defined in ETSI TS 123 401") @Valid @RequestParam(value = "qci", required = false) Integer qci
,@ApiParam(value = "Maximum downlink E-RAB Bit Rate as defined in ETSI TS 123 401") @Valid @RequestParam(value = "erab_mbr_dl", required = false) Integer erabMbrDl
,@ApiParam(value = "Maximum uplink E-RAB Bit Rate as defined in ETSI TS 123 401") @Valid @RequestParam(value = "erab_mbr_ul", required = false) Integer erabMbrUl
,@ApiParam(value = "Guaranteed downlink E-RAB Bit Rate as defined in ETSI TS 123 401") @Valid @RequestParam(value = "erab_gbr_dl", required = false) Integer erabGbrDl
,@ApiParam(value = "Guaranteed uplink E-RAB Bit Rate as defined in ETSI TS 123 401") @Valid @RequestParam(value = "erab_gbr_ul", required = false) Integer erabGbrUl
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            RabInfo rabInfo = new RabInfo();
            if (ueIpv4Address != null && ueIpv4Address.size() > 0) {
                rabInfo = rabInfoFactory.getRabInfoSample(ueIpv4Address.get(0));
            }
            else{
                rabInfo = rabInfoFactory.getRabInfoSample(null);
            }
                try {
                    String rabInfoStringFormat = objectMapper.writeValueAsString(rabInfo);
                    return new ResponseEntity<RabInfo>(objectMapper.readValue(rabInfoStringFormat, RabInfo.class), HttpStatus.OK);
                } catch (IOException e) {
                    log.error(e.getMessage());
                    return new ResponseEntity<RabInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
        }
            try {

                return new ResponseEntity<RabInfo>(objectMapper.readValue("{\n  \"appInstanceId\" : \"appInstanceId\",\n  \"cellUserInfo\" : [ {\n    \"ueInfo\" : [ {\n      \"associateId\" : [ {\n        \"type\" : 0,\n        \"value\" : \"value\"\n      }, {\n        \"type\" : 0,\n        \"value\" : \"value\"\n      } ],\n      \"erabInfo\" : [ {\n        \"erabId\" : 6,\n        \"erabQosParameters\" : {\n          \"qosInformation\" : {\n            \"erabGbrDl\" : 5,\n            \"erabGbrUl\" : 5,\n            \"erabMbrUl\" : 7,\n            \"erabMbrDl\" : 2\n          },\n          \"qci\" : 1\n        }\n      }, {\n        \"erabId\" : 6,\n        \"erabQosParameters\" : {\n          \"qosInformation\" : {\n            \"erabGbrDl\" : 5,\n            \"erabGbrUl\" : 5,\n            \"erabMbrUl\" : 7,\n            \"erabMbrDl\" : 2\n          },\n          \"qci\" : 1\n        }\n      } ]\n    }, {\n      \"associateId\" : [ {\n        \"type\" : 0,\n        \"value\" : \"value\"\n      }, {\n        \"type\" : 0,\n        \"value\" : \"value\"\n      } ],\n      \"erabInfo\" : [ {\n        \"erabId\" : 6,\n        \"erabQosParameters\" : {\n          \"qosInformation\" : {\n            \"erabGbrDl\" : 5,\n            \"erabGbrUl\" : 5,\n            \"erabMbrUl\" : 7,\n            \"erabMbrDl\" : 2\n          },\n          \"qci\" : 1\n        }\n      }, {\n        \"erabId\" : 6,\n        \"erabQosParameters\" : {\n          \"qosInformation\" : {\n            \"erabGbrDl\" : 5,\n            \"erabGbrUl\" : 5,\n            \"erabMbrUl\" : 7,\n            \"erabMbrDl\" : 2\n          },\n          \"qci\" : 1\n        }\n      } ]\n    } ],\n    \"ecgi\" : {\n      \"plmn\" : {\n        \"mnc\" : \"mnc\",\n        \"mcc\" : \"mcc\"\n      },\n      \"cellId\" : \"cellId\"\n    }\n  }, {\n    \"ueInfo\" : [ {\n      \"associateId\" : [ {\n        \"type\" : 0,\n        \"value\" : \"value\"\n      }, {\n        \"type\" : 0,\n        \"value\" : \"value\"\n      } ],\n      \"erabInfo\" : [ {\n        \"erabId\" : 6,\n        \"erabQosParameters\" : {\n          \"qosInformation\" : {\n            \"erabGbrDl\" : 5,\n            \"erabGbrUl\" : 5,\n            \"erabMbrUl\" : 7,\n            \"erabMbrDl\" : 2\n          },\n          \"qci\" : 1\n        }\n      }, {\n        \"erabId\" : 6,\n        \"erabQosParameters\" : {\n          \"qosInformation\" : {\n            \"erabGbrDl\" : 5,\n            \"erabGbrUl\" : 5,\n            \"erabMbrUl\" : 7,\n            \"erabMbrDl\" : 2\n          },\n          \"qci\" : 1\n        }\n      } ]\n    }, {\n      \"associateId\" : [ {\n        \"type\" : 0,\n        \"value\" : \"value\"\n      }, {\n        \"type\" : 0,\n        \"value\" : \"value\"\n      } ],\n      \"erabInfo\" : [ {\n        \"erabId\" : 6,\n        \"erabQosParameters\" : {\n          \"qosInformation\" : {\n            \"erabGbrDl\" : 5,\n            \"erabGbrUl\" : 5,\n            \"erabMbrUl\" : 7,\n            \"erabMbrDl\" : 2\n          },\n          \"qci\" : 1\n        }\n      }, {\n        \"erabId\" : 6,\n        \"erabQosParameters\" : {\n          \"qosInformation\" : {\n            \"erabGbrDl\" : 5,\n            \"erabGbrUl\" : 5,\n            \"erabMbrUl\" : 7,\n            \"erabMbrDl\" : 2\n          },\n          \"qci\" : 1\n        }\n      } ]\n    } ],\n    \"ecgi\" : {\n      \"plmn\" : {\n        \"mnc\" : \"mnc\",\n        \"mcc\" : \"mcc\"\n      },\n      \"cellId\" : \"cellId\"\n    }\n  } ],\n  \"timeStamp\" : {\n    \"seconds\" : 3,\n    \"nanoSeconds\" : 9\n  },\n  \"requestId\" : \"requestId\"\n}", RabInfo.class), HttpStatus.INTERNAL_SERVER_ERROR);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RabInfo>(HttpStatus.BAD_REQUEST);
            }

    }

    public ResponseEntity<S1BearerInfo> s1BearerInfoGET(@ApiParam(value = "Comma separated list of temporary identifiers allocated for the specific UE as defined in   ETSI TS 136 413") @Valid @RequestParam(value = "temp_ue_id", required = false) List<String> tempUeId
,@ApiParam(value = "Comma separated list of IE IPv4 addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "ue_ipv4_address", required = false) List<String> ueIpv4Address
,@ApiParam(value = "Comma separated list of IE IPv6 addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "ue_ipv6_address", required = false) List<String> ueIpv6Address
,@ApiParam(value = "Comma separated list of IE NATed IP addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "nated_ip_address", required = false) List<String> natedIpAddress
,@ApiParam(value = "Comma separated list of GTP TEID addresses as defined for the type for AssociateId") @Valid @RequestParam(value = "gtp_teid", required = false) List<String> gtpTeid
,@ApiParam(value = "Comma separated list of E-UTRAN Cell Identities") @Valid @RequestParam(value = "cell_id", required = false) List<String> cellId
,@ApiParam(value = "Comma separated list of E-RAB identifiers") @Valid @RequestParam(value = "erab_id", required = false) List<Integer> erabId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<S1BearerInfo>(objectMapper.readValue("{\n  \"timeStamp\" : {\n    \"seconds\" : 3,\n    \"nanoSeconds\" : 9\n  },\n  \"s1UeInfo\" : [ {\n    \"associateId\" : [ {\n      \"type\" : 0,\n      \"value\" : \"value\"\n    }, {\n      \"type\" : 0,\n      \"value\" : \"value\"\n    } ],\n    \"s1BearerInfoDetailed\" : [ {\n      \"erabId\" : 0,\n      \"enbInfo\" : {\n        \"tunnelId\" : \"tunnelId\",\n        \"ipAddress\" : \"ipAddress\"\n      },\n      \"sGwInfo\" : {\n        \"tunnelId\" : \"tunnelId\",\n        \"ipAddress\" : \"ipAddress\"\n      }\n    }, {\n      \"erabId\" : 0,\n      \"enbInfo\" : {\n        \"tunnelId\" : \"tunnelId\",\n        \"ipAddress\" : \"ipAddress\"\n      },\n      \"sGwInfo\" : {\n        \"tunnelId\" : \"tunnelId\",\n        \"ipAddress\" : \"ipAddress\"\n      }\n    } ],\n    \"ecgi\" : [ {\n      \"plmn\" : {\n        \"mnc\" : \"mnc\",\n        \"mcc\" : \"mcc\"\n      },\n      \"cellId\" : \"cellId\"\n    }, {\n      \"plmn\" : {\n        \"mnc\" : \"mnc\",\n        \"mcc\" : \"mcc\"\n      },\n      \"cellId\" : \"cellId\"\n    } ],\n    \"tempUeId\" : {\n      \"mtmsi\" : \"mtmsi\",\n      \"mmec\" : \"mmec\"\n    }\n  }, {\n    \"associateId\" : [ {\n      \"type\" : 0,\n      \"value\" : \"value\"\n    }, {\n      \"type\" : 0,\n      \"value\" : \"value\"\n    } ],\n    \"s1BearerInfoDetailed\" : [ {\n      \"erabId\" : 0,\n      \"enbInfo\" : {\n        \"tunnelId\" : \"tunnelId\",\n        \"ipAddress\" : \"ipAddress\"\n      },\n      \"sGwInfo\" : {\n        \"tunnelId\" : \"tunnelId\",\n        \"ipAddress\" : \"ipAddress\"\n      }\n    }, {\n      \"erabId\" : 0,\n      \"enbInfo\" : {\n        \"tunnelId\" : \"tunnelId\",\n        \"ipAddress\" : \"ipAddress\"\n      },\n      \"sGwInfo\" : {\n        \"tunnelId\" : \"tunnelId\",\n        \"ipAddress\" : \"ipAddress\"\n      }\n    } ],\n    \"ecgi\" : [ {\n      \"plmn\" : {\n        \"mnc\" : \"mnc\",\n        \"mcc\" : \"mcc\"\n      },\n      \"cellId\" : \"cellId\"\n    }, {\n      \"plmn\" : {\n        \"mnc\" : \"mnc\",\n        \"mcc\" : \"mcc\"\n      },\n      \"cellId\" : \"cellId\"\n    } ],\n    \"tempUeId\" : {\n      \"mtmsi\" : \"mtmsi\",\n      \"mmec\" : \"mmec\"\n    }\n  } ]\n}", S1BearerInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<S1BearerInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<S1BearerInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

}
