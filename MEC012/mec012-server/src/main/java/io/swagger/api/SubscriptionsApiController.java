package io.swagger.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.Handover.SubscriptionManager;
import io.swagger.annotations.ApiParam;
import io.swagger.model.CellChangeSubscription;
import io.swagger.model.InlineSubscription;
import io.swagger.model.RabInfo;
import io.swagger.model.SubscriptionLinkList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-17T10:14:37.794Z[Etc/UTC]")
@Controller
public class SubscriptionsApiController implements SubscriptionsApi {

    private static final Logger log = LoggerFactory.getLogger(SubscriptionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private SubscriptionManager subscriptionManager;

    @Value("${server.ip}")
    private String mecServerIp;

    @Value("${server.port}")
    private int mecServerPort;

    @org.springframework.beans.factory.annotation.Autowired
    public SubscriptionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        subscriptionManager = new SubscriptionManager(mecServerIp, mecServerPort);
    }

    public ResponseEntity<SubscriptionLinkList> subscriptionLinkListSubscriptionsGET(@ApiParam(value = "Filter on a specific subscription type. Permitted values: cell_change, rab_est, rab_mod, rab_rel, meas_rep_ue, nr_meas_rep_ue, timing_advance_ue, ca_reconf, s1_bearer.") @Valid @RequestParam(value = "subscription_type", required = false) String subscriptionType
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SubscriptionLinkList>(objectMapper.readValue("{\n  \"_links\" : {\n    \"self\" : {\n      \"href\" : \"http://example.com/aeiou\"\n    },\n    \"subscription\" : [ {\n      \"subscriptionType\" : \"subscriptionType\",\n      \"href\" : \"http://example.com/aeiou\"\n    }, {\n      \"subscriptionType\" : \"subscriptionType\",\n      \"href\" : \"http://example.com/aeiou\"\n    } ]\n  }\n}", SubscriptionLinkList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SubscriptionLinkList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SubscriptionLinkList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> subscriptionsDELETE(@ApiParam(value = "Subscription Id, specifically the \"Self-referring URI\" returned in the subscription request",required=true) @PathVariable("subscriptionId") String subscriptionId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineSubscription> subscriptionsGET(@ApiParam(value = "Subscription Id, specifically the \"Self-referring URI\" returned in the subscription request",required=true) @PathVariable("subscriptionId") String subscriptionId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineSubscription>(objectMapper.readValue("\"\"", InlineSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CellChangeSubscription> subscriptionsPOST(@ApiParam(value = "Subscription to be created" ,required=true )  @Valid @RequestBody CellChangeSubscription body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

            CellChangeSubscription cellChangeSubscription = subscriptionManager.addSubscription(body);
            String cellChangeSubscriptionStrFormat = null;
            try {
                cellChangeSubscriptionStrFormat = objectMapper.writeValueAsString(cellChangeSubscription);
                //log.info("OBJECT");
                //log.info(cellChangeSubscriptionStrFormat);
                //log.info(cellChangeSubscription.getLinks().getSelf().getHref());
                return new ResponseEntity<CellChangeSubscription>(objectMapper.readValue(cellChangeSubscriptionStrFormat, CellChangeSubscription.class), HttpStatus.CREATED);
            } catch (IOException e) {
                log.error(e.getMessage());
            }

        }
        return new ResponseEntity<CellChangeSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineSubscription> subscriptionsPUT(@ApiParam(value = "Subscription Id, specifically the \"Self-referring URI\" returned in the subscription request",required=true) @PathVariable("subscriptionId") String subscriptionId
,@ApiParam(value = "Subscription to be modified" ,required=true )  @Valid @RequestBody InlineSubscription body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineSubscription>(objectMapper.readValue("\"\"", InlineSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

}
