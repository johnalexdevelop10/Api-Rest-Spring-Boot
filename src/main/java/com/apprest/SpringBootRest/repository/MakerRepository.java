package com.apprest.SpringBootRest.repository;

import com.apprest.SpringBootRest.entities.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MakerRepository extends CrudRepository<Maker,Long> {


}
