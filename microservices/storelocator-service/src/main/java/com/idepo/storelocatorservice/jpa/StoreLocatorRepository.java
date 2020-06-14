package com.idepo.storelocatorservice.jpa;

import com.idepo.storelocatorservice.entity.StoreLocator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StoreLocatorRepository extends CrudRepository<StoreLocator, Integer> {

}

