package io.swagger.client.mp1;

import io.swagger.annotations.ApiParam;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.RniApi;
import io.swagger.client.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
class NotificationController implements NotificationsApi{

    private int failedHandover = 0;
    private int completedHandOver = 0;

    @Value("${server.ip}")
    private String callbackIp;

    @Value("${server.port}")
    private int callBackPort;

    @Value("${mec-server.ip}")
    private String mecServerIp;

    @Value("${mec-server.port}")
    private int mecServerPort;

    private String basePath;
    private String ueIpv4Address = "10.10.1.201";



    @Override
    public ResponseEntity<?> startCollectionPost() {
        basePath = "http://"+mecServerIp+":"+mecServerPort+"/rni/v2";
        System.out.println(basePath);
            failedHandover = 0;
            completedHandOver = 0;
            System.out.println("Starting new tracking");
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(basePath);
        RniApi rniApi = new RniApi(apiClient);
        /* Step 1: Get the RAB information related to the UE that will
         * be tracked, filtering the information by ueIpv4Address
         */
        List<String> ipV4Addresses = new ArrayList<>();
        ipV4Addresses.add(ueIpv4Address);
        RabInfo rabInfo = new RabInfo();
        try{
            rabInfo = rniApi.rabInfoGET(
                    null,
                    null,
                    ipV4Addresses,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null
            );
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        /* If the information provided is not empty, means that our UE is connected and its hand-overs can be tracked  */
        if (rabInfo != null){
            /* Let' subscribe to receive hand-over notification */
            CellChangeSubscription subscription = new CellChangeSubscription();
            CellChangeSubscriptionFilterCriteriaAssocHo filter = new CellChangeSubscriptionFilterCriteriaAssocHo();
            List<Integer> hoStatus = new ArrayList<Integer>();
            hoStatus.add(3);
            hoStatus.add(4);
            hoStatus.add(5);
            AssociateId ueId = new AssociateId();
            ueId.setType(AssociateId.TypeEnum.NUMBER_1);
            ueId.setValue(ueIpv4Address);
            filter.addAssociateIdItem(ueId);
            subscription.setFilterCriteriaAssocHo(filter);
            subscription.setSubscriptionType("CellChangeSubscription");
            subscription.setCallbackReference("http://"+callbackIp+":"+callBackPort+"/subscription/hoStatusChange");
            try {
                rniApi.subscriptionsPOST(subscription);
            } catch (ApiException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("RAB information missing for UE with IP " + ueIpv4Address);
        }
        return null;
    }

    @Override
    public ResponseEntity<?> postNotification(@ApiParam(value = "" ,required=true )  @RequestBody CellChangeNotification body) {
        System.out.println("HoStatus :" + body.toString());
        if (body.getHoStatus() == CellChangeNotification.HoStatusEnum.NUMBER_3) {
            completedHandOver++;
            System.out.println("New HandOver completed successfully");
        } else {
            failedHandover++;
            System.out.println("HandOver failed to complete with status " + body.getHoStatus());
        }
        System.out.println("Total handovers: " + (failedHandover + completedHandOver));
        System.out.println("Completed handovers: " + completedHandOver);
        System.out.println("Failed handovers: " + failedHandover);
        System.out.println("Percentage of failed handovers: " + (failedHandover * 100.0) / (failedHandover + completedHandOver) + "%");
        return null;
    }

    @Override
    public ResponseEntity<?> getNotification() {
        System.out.println("Request to check endpoint was performed");
        return null;
    }
}
