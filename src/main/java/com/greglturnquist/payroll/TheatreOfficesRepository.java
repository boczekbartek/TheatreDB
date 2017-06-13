package com.greglturnquist.payroll;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TheatreOfficesRepository extends CrudRepository<TheatreOffice, Long>{
    List<TheatreOffice> findAllByCity(String city);

}
