package com.idepo.catalogservice.service;

import com.idepo.catalogservice.data.CatalogData;
import com.idepo.catalogservice.data.StockData;
import com.idepo.catalogservice.entity.Catalog;
import com.idepo.catalogservice.jpa.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogService {

    @Autowired
    CatalogRepository repository;
    @Autowired
    StockService stockService;

    public List<CatalogData> getAll() {
        List<Catalog> list = new ArrayList();
        repository.findAll().forEach(item -> list.add(item));
        return populateStock(list);
    }

    public List<CatalogData> getAllByShortid(String shortid) {
        List<Catalog> list = new ArrayList();
        repository.findByShortid(shortid).forEach(item -> list.add(item));
        return populateStock(list);
    }

    public CatalogData getById(int id) {
        return createStock(repository.findById(id).get());
    }

    private List<CatalogData> populateStock(List<Catalog> listIn) {
        List<CatalogData> list = new ArrayList<CatalogData>();
        CatalogData catalogData;
        for (Catalog catalog : listIn) {
            //Catalog
            catalogData = createStock(catalog);
            list.add(catalogData);
        }
        return list;
    }

    private CatalogData createStock(Catalog catalog) {
        CatalogData catalogData = new CatalogData();
        catalogData.setId(catalog.getId());
        catalogData.setShortid(catalog.getShortid());
        catalogData.setCategory(catalog.getCategory());
        catalogData.setDescription(catalog.getDescription());
        catalogData.setPrice(catalog.getPrice());

        //Stock Qty
        StockData stockData = stockService.getStockByCatalogshortid(catalog.getShortid());
        if (stockData != null) {
            catalogData.setStockQty(stockData.getQty());
        }

        return catalogData;
    }
}
