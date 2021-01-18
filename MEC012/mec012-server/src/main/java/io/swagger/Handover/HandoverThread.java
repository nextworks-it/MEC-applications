package io.swagger.Handover;

import io.swagger.model.CellChangeNotification;
import io.swagger.model.CellChangeSubscription;
import io.swagger.model.TimeStamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Callable;

public class HandoverThread implements Callable<Boolean> {

    private final double successfulHandoverProbability;
    private static final Logger LOG = LoggerFactory.getLogger(HandoverThread.class);
    private String handoverRequestId;
    private CellChangeSubscription cellChangeSubscription;
    public HandoverThread(CellChangeSubscription cellChangeSubscription, String handoverRequestId, double successfulHandoverProbability){
        this.successfulHandoverProbability = successfulHandoverProbability;
        this.handoverRequestId = handoverRequestId;
        this.cellChangeSubscription = cellChangeSubscription;
    }

    private int getUniformRandom(int maxNumber){
        return (int)(Math.random() * maxNumber)+ 1;

    }
    private void sleepAWhile(long milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private boolean sendNotification(CellChangeNotification cellChangeNotification, String callback){
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json");
        HttpEntity<?> httpEntity = new HttpEntity<>(cellChangeNotification, header);

        try {
            LOG.info("URL performing the request to: " + callback);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<?> httpResponse =
                    restTemplate.exchange(callback, HttpMethod.POST, httpEntity, Object.class);
            HttpStatus code = httpResponse.getStatusCode();
            LOG.info("Response code: " + code.toString());
            if(httpResponse.getBody()!=null)
                LOG.info("Body response: " + httpResponse.getBody().toString());
            return true;
        } catch (RestClientException e) {
            LOG.info(e.getMessage());
            return false;
        }
    }

    private boolean randomHandover(String callbackConference){
        CellChangeNotification cellChangeNotification = new CellChangeNotification();
        TimeStamp timeStamp = new TimeStamp();
        Long time = System.currentTimeMillis()/1000;
        timeStamp.setSeconds(time.intValue());
        cellChangeNotification.setTimeStamp(timeStamp);
        if(getUniformRandom(100)>=successfulHandoverProbability){
            LOG.info("Sending notification for request "+handoverRequestId+": unfortunately, handover request has been REJECTED! ");
            cellChangeNotification.setHoStatus(CellChangeNotification.HoStatusEnum.NUMBER_4);

        }
        else {
            LOG.info("Sending notification for request "+ handoverRequestId + " : successfully, handover request has been COMPLETED! ");
            cellChangeNotification.setHoStatus(CellChangeNotification.HoStatusEnum.NUMBER_3);
        }
        return sendNotification(cellChangeNotification, callbackConference);

    }
    @Override
    public Boolean call() {

        String callbackReference = cellChangeSubscription.getCallbackReference();

        final int NOTIFICATION_COUNT = getUniformRandom(10)+5;

        for(int i=0; i<NOTIFICATION_COUNT; i++) {
            int sleepTime = getUniformRandom(10);
            sleepAWhile(sleepTime * 1000);
            boolean result = randomHandover(callbackReference);
            if(!result)
                return false;
        }
        return true;
    }
}
