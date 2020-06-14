package com.idepo.stockservice.controller;

import com.idepo.stockservice.entity.Stock;
import com.idepo.stockservice.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api")
public class StockController {

    @Autowired
    StockService service;

    @GetMapping("/stock")
    private List<Stock> getAll() {
        return service.getAll();
    }

    @GetMapping("/stockByCatalogshortid")
    private Stock getByCatalogshortid(@RequestParam("catalogshortid") String catalogshortid) {
        return service.getByCatalogshortid(catalogshortid);
    }

    @GetMapping("/stock/{id}")
    private Stock getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

}
