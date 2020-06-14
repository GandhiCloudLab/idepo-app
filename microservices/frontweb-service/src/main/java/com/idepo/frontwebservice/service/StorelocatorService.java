package com.idepo.frontwebservice.service;

import com.idepo.frontwebservice.util.HttpClientUtil;
import com.idepo.frontwebservice.util.LogUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class StorelocatorService {

    @Value("${service.url.storelocator}")
    private String url_service;

    public Object storelocator() {
        LogUtil.log("StorelocatorService  storelocator Started ");

        String url = url_service + "/api/storelocator";
        LogUtil.log("StorelocatorService  storelocator  : url " + url);

        Object result = null;
        try {
            result = HttpClientUtil.doGet(url);
            LogUtil.log("StorelocatorService : storelocator result  : " + result);
        } catch (Exception e) {
            LogUtil.log("StorelocatorService : storelocator error ");
            e.printStackTrace();
        }
        LogUtil.log("StorelocatorService  storelocator Completed");
        return result;
    }
}
