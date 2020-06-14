package com.idepo.catalogservice.controller;

import com.idepo.catalogservice.data.CatalogData;
import com.idepo.catalogservice.entity.Catalog;
import com.idepo.catalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api")
public class CatalogController {

    @Autowired
    CatalogService service;

    @GetMapping("/catalog")
    private List<CatalogData> getAll() {
        return service.getAll();
    }

    @GetMapping("catalogByShortid")
    private List<CatalogData> getAllByCatalogshortid(@RequestParam("shortid") String shortid) {
        return service.getAllByShortid(shortid);
    }

    @GetMapping("/stock/{id}")
    private CatalogData getById(@PathVariable("id") int id) {
        return service.getById(id);
    }
}
