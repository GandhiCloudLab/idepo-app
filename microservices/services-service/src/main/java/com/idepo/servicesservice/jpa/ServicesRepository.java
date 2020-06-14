package com.idepo.servicesservice.jpa;

import com.idepo.servicesservice.entity.Services;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ServicesRepository extends CrudRepository<Services, Integer> {

}

