package com.metoo.nspm.core.api.service.impl;

import com.metoo.nspm.core.api.service.IZabbixService;
import com.metoo.nspm.core.config.http.RestTemplateUtil;
import com.metoo.nspm.core.config.socket.NoticeWebsocketResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZabbixServiceImpl implements IZabbixService {

    @Autowired
    private RestTemplateUtil restTemplateUtil;

    @Override
    public NoticeWebsocketResp getItemLastValue(String params) {
        String url = "/websocket/api/zabbix/lastvalue";
        NoticeWebsocketResp result = restTemplateUtil.getObjByStr(url, params);
        return result;
    }
}
