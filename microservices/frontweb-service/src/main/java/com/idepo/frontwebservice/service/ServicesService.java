package com.idepo.frontwebservice.service;

import com.idepo.frontwebservice.util.HttpClientUtil;
import com.idepo.frontwebservice.util.LogUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class ServicesService {

    @Value("${service.url.services}")
    private String url_service;

    public Object services() {
        LogUtil.log("ServicesService  services Started ");

        String url = url_service + "/api/services";
        LogUtil.log("ServicesService  services  : url " + url);

        Object result = null;
        try {
            result = HttpClientUtil.doGet(url);
            LogUtil.log("ServicesService : services result  : " + result);
        } catch (Exception e) {
            LogUtil.log("ServicesService : services error ");
            e.printStackTrace();
        }
        LogUtil.log("ServicesService  services Completed");
        return result;
    }
}
