package com.idepo.frontwebservice.service;

import com.idepo.frontwebservice.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class FrontwebService {

    @Autowired
    CatalogService catalogService;

    @Autowired
    ServicesService servicesService;

    @Autowired
    StockService stockService;

    @Autowired
    StorelocatorService storelocatorService;

    public Object catalog () {
        LogUtil.log(("FrontwebService  catalog ... "));
        return catalogService.catalog();
    }

    public Object services () {
        LogUtil.log(("FrontwebService  services ... "));
        return servicesService.services();
    }

    public Object stock () {
        LogUtil.log(("FrontwebService  stock ... "));
        return stockService.stock();
    }

    public Object storelocator () {
        LogUtil.log(("FrontwebService  storelocator ... "));
        return storelocatorService.storelocator();
    }
}
