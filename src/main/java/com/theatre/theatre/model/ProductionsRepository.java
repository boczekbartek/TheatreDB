package com.theatre.theatre.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ProductionsRepository extends CrudRepository<Production, Long>{
    List<Production> findByName(String name);
}
