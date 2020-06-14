package com.idepo.servicesservice.controller;

import com.idepo.servicesservice.entity.Services;
import com.idepo.servicesservice.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api")
public class ServicesController {

    @Autowired
    ServicesService service;

    @GetMapping("/services")
    private List<Services> getAll() {
        return service.getAll();
    }

    @GetMapping("/services/{id}")
    private Services getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

}
