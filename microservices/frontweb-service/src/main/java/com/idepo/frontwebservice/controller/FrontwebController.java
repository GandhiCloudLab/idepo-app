package com.idepo.frontwebservice.controller;

import com.idepo.frontwebservice.service.FrontwebService;
import com.idepo.frontwebservice.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FrontwebController {

    @Autowired
    FrontwebService service;

    @CrossOrigin
    @GetMapping("frontweb/catalog")
    @ResponseBody
    private Object catalog () {
        LogUtil.log(("FrontwebController catalog"));
        return service.catalog();
    }

    @CrossOrigin
    @GetMapping("frontweb/services")
    @ResponseBody
    private Object services () {
        LogUtil.log(("FrontwebController services"));
        return service.services();
    }

    @CrossOrigin
    @GetMapping("frontweb/stock")
    @ResponseBody
    private Object stock () {
        LogUtil.log(("FrontwebController stock"));
        return service.stock();
    }


    @CrossOrigin
    @GetMapping("frontweb/storelocator")
    @ResponseBody
    private Object storelocator () {
        LogUtil.log(("FrontwebController storelocator"));
        return service.storelocator();
    }

}
