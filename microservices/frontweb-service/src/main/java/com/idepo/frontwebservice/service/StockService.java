package com.idepo.frontwebservice.service;

import com.idepo.frontwebservice.util.HttpClientUtil;
import com.idepo.frontwebservice.util.LogUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class StockService {

    @Value("${service.url.stock}")
    private String url_service;

    public Object stock() {
        LogUtil.log("StockService stock Started ");

        String url = url_service + "/api/stock";
        LogUtil.log("StockService stock  : url " + url);

        Object result = null;
        try {
            result = HttpClientUtil.doGet(url);
            LogUtil.log("StockService : stock result  : " + result);
        } catch (Exception e) {
            LogUtil.log("StockService : stock error ");
            e.printStackTrace();
        }
        LogUtil.log("StockService stock Completed");
        return result;
    }
}
