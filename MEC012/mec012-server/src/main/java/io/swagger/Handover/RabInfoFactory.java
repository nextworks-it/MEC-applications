package io.swagger.Handover;

import io.swagger.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RabInfoFactory {

    public RabInfoFactory(){

    }

    private AssociateId getIpV4AddressSample(String ipAddress){
        AssociateId associateId = new AssociateId();
        associateId.setType(AssociateId.TypeEnum.NUMBER_1);
        associateId.setValue(ipAddress);
        return associateId;
    }

    public RabInfo getRabInfoSample(String ipAddress){

        RabInfo rabInfo = new RabInfo();
        rabInfo.setAppInstanceId("app-123");
        rabInfo.setRequestId(UUID.randomUUID().toString());

        //Elements for RabInfoCellUserInfo
        Ecgi ecgi = new Ecgi();
        ecgi.setCellId("cell-abc");
        Plmn plmn=new Plmn();
        plmn.setMcc("001");
        plmn.setMnc("01");
        ecgi.setPlmn(plmn);
        RabInfoCellUserInfo rabInfoCellUserInfo = new RabInfoCellUserInfo();
        rabInfoCellUserInfo.setEcgi(ecgi);

        //Elements for ueInfo
        List<AssociateId> associateIdList = new ArrayList<>();
        associateIdList.add(getIpV4AddressSample("93.94.95.96"));

        if(ipAddress!=null)
            associateIdList.add(getIpV4AddressSample(ipAddress));
        else
            associateIdList.add(getIpV4AddressSample("93.94.95.97"));

        associateIdList.add(getIpV4AddressSample("93.94.95.98"));
        RabInfoUeInfo rabInfoUeInfo= new RabInfoUeInfo();
        rabInfoUeInfo.setAssociateId(associateIdList);
        List<RabInfoUeInfo> ueInfoList = new ArrayList<>();
        ueInfoList.add(rabInfoUeInfo);
        rabInfoCellUserInfo.setUeInfo(ueInfoList);

        List<RabInfoCellUserInfo> rabInfoCellUserInfoList =  new ArrayList<>();
        rabInfoCellUserInfoList.add(rabInfoCellUserInfo);
        rabInfo.setCellUserInfo(rabInfoCellUserInfoList);
        return rabInfo;
    }
}
