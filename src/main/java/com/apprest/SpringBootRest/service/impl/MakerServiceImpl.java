package com.apprest.SpringBootRest.service.impl;


import com.apprest.SpringBootRest.entities.Maker;
import com.apprest.SpringBootRest.persistence.IMakerDao;
import com.apprest.SpringBootRest.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MakerServiceImpl implements IMakerService {

    @Autowired
    private IMakerDao makerDao;

    @Override
    public List<Maker> findAll() {
        return makerDao.findAll();
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return makerDao.findById(id);
    }

    @Override
    public void save(Maker maker) {
      makerDao.save(maker);
    }

    @Override
    public void deleteById(Long id) {
     makerDao.deleteById(id);
    }
}
