package com.idepo.storelocatorservice.controller;

import com.idepo.storelocatorservice.entity.StoreLocator;
import com.idepo.storelocatorservice.service.StoreLocatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api")
public class StoreLocatorController {

    @Autowired
    StoreLocatorService service;

    @GetMapping("/storelocator")
    private List<StoreLocator> getAll() {
        return service.getAll();
    }

    @GetMapping("/storelocator/{id}")
    private StoreLocator getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

}
