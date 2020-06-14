package com.idepo.stockservice.jpa;

import com.idepo.stockservice.entity.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {

    Stock findByCatalogshortid(String catalogshortid);
}
