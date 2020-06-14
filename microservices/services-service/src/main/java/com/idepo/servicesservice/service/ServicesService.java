package com.idepo.servicesservice.service;

import com.idepo.servicesservice.entity.Services;
import com.idepo.servicesservice.jpa.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesService {

    @Autowired
    ServicesRepository repository;

    public List<Services> getAll() {
        List<Services> list = new ArrayList();
        repository.findAll().forEach(services -> list.add(services));
        return list;
    }

    public Services getById(int id) {
        return repository.findById(id).get();
    }

}
