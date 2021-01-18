package io.swagger.Handover;

import io.swagger.model.CaReconfSubscriptionLinks;
import io.swagger.model.CellChangeSubscription;
import io.swagger.model.LinkType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubscriptionManager {
    private ExecutorService service = Executors.newFixedThreadPool(100);
    private int successfulHandoverProb = 80;
    private final String SERVER_IP;
    private final int SERVER_PORT;
    private HashMap<String, Future<Boolean>> handoverMap; //map to store the HO callable results
    private HashMap<String,CellChangeSubscription> subscriptionMap;  //map to store subscriptions
    private static final Logger LOG = LoggerFactory.getLogger(SubscriptionManager.class);

    public SubscriptionManager(String serverIp, int serverPort){
        handoverMap = new HashMap<>();
        subscriptionMap = new HashMap<>();
        this.SERVER_IP = serverIp;
        this.SERVER_PORT = serverPort;
    }

    public CellChangeSubscription addSubscription(CellChangeSubscription body){
        String subscriptionId = UUID.randomUUID().toString();
        HandoverThread handoverThread = new HandoverThread(body, subscriptionId,successfulHandoverProb);
        Future<Boolean> handoverCompleted =  service.submit(handoverThread);


        LinkType linkType = new LinkType();
        linkType.setHref("http://"+SERVER_IP+":"+SERVER_PORT+"/rni/v2/subscriptions/"+subscriptionId);

        CaReconfSubscriptionLinks caReconfSubscriptionLinks = new CaReconfSubscriptionLinks();
        caReconfSubscriptionLinks.setSelf(linkType);

        body.setLinks(caReconfSubscriptionLinks);

        handoverMap.put(subscriptionId, handoverCompleted);
        subscriptionMap.put(subscriptionId, body);
        return body;
    }


    public void removeSubscription(String subscriptionId){//The subscription is stopped and then removed
        if(handoverMap.get(subscriptionId)==null){
            LOG.error("Unable to find subscription with ID "+subscriptionId);
            return;
        }

        handoverMap.get(subscriptionId).cancel(true);
        handoverMap.remove(subscriptionId);
        subscriptionMap.remove(subscriptionId);
        LOG.info("Subscription correctly removed.");
    }

}
