package com.apprest.SpringBootRest.service.impl;

import com.apprest.SpringBootRest.entities.Product;
import com.apprest.SpringBootRest.persistence.IProductDAO;
import com.apprest.SpringBootRest.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDAO productDAO;

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productDAO.findById(id);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productDAO.findByPriceInRange(minPrice,maxPrice);
    }

    @Override
    public void save(Product product) {
     productDAO.save(product);
    }

    @Override
    public void deleteById(Long id) {
     productDAO.deleteById(id);
    }
}
