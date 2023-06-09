package com.metoo.nspm.core.api.service.impl;

import com.metoo.nspm.core.api.service.INetworkElementService;
import com.metoo.nspm.core.config.http.RestTemplateUtil;
import com.metoo.nspm.core.config.socket.NoticeWebsocketResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetworkElementServiceImpl implements INetworkElementService {

    @Autowired
    private RestTemplateUtil restTemplateUtil;

    @Override
    public NoticeWebsocketResp getNeAvailable(String params) {
        String url = "/websocket/api/network/list";
        NoticeWebsocketResp result = restTemplateUtil.getObjByStr(url, params);
        return result;
    }

//    @Override
//    public NoticeWebsocketResp getSnmpSatus(String params) {
//        String url = "/websocket/api/network/snmp/status";
//        StringBuffer sb = new StringBuffer(url);
//        sb.append("?ips=" + params);
//        NoticeWebsocketResp result = restTemplateUtil.get(sb.toString());
//        return result;
//    }

    @Override
    public NoticeWebsocketResp getSnmpSatus(String params) {
        String url = "/websocket/api/network/snmp/status";
        NoticeWebsocketResp result = restTemplateUtil.getObjByStr(url, params);
//        StringBuffer sb = new StringBuffer(url);
//        sb.append("?ips=" + params);
//        NoticeWebsocketResp result = restTemplateUtil.get(sb.toString());
        return result;
    }


    @Override
    public NoticeWebsocketResp interfaceEvent(String params) {
        String url = "/websocket/api/network/interface/event";
        NoticeWebsocketResp result = restTemplateUtil.getObjByStr(url, params);
        return result;
    }

    @Override
    public NoticeWebsocketResp getNeInterfaceDT(String params) {
        String url = "/websocket/api/network/ne/interface/all";
        NoticeWebsocketResp result = restTemplateUtil.getObjByStr(url, params);
        return result;
    }

    @Override
    public NoticeWebsocketResp getTerminalOnline(String params) {
        String url = "/websocket/api/network/ne/partition/terminal";
        NoticeWebsocketResp result = restTemplateUtil.getObjByStr(url, params);
        return result;
    }
}
