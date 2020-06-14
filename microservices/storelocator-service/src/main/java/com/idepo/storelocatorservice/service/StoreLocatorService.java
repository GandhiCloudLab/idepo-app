package com.idepo.storelocatorservice.service;

import com.idepo.storelocatorservice.entity.StoreLocator;
import com.idepo.storelocatorservice.jpa.StoreLocatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreLocatorService {

    @Autowired
    StoreLocatorRepository repository;

    public List<StoreLocator> getAll() {
        List<StoreLocator> list = new ArrayList();
        repository.findAll().forEach(interestRate -> list.add(interestRate));
        return list;
    }

    public StoreLocator getById(int id) {
        return repository.findById(id).get();
    }


}
