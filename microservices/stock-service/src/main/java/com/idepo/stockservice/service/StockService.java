package com.idepo.stockservice.service;

import com.idepo.stockservice.entity.Stock;
import com.idepo.stockservice.jpa.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    @Autowired
    StockRepository repository;

    public List<Stock> getAll() {
        List<Stock> list = new ArrayList();
        repository.findAll().forEach(interestRate -> list.add(interestRate));
        return list;
    }

    public Stock getByCatalogshortid(String catalogshortid) {
        return repository.findByCatalogshortid(catalogshortid);
    }

    public Stock getById(int id) {
        return repository.findById(id).get();
    }

}
