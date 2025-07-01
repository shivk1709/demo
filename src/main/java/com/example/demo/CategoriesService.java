package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesDao categoriesDao;

    public List<Categories> add(Categories categories) {
        categoriesDao.save(categories);
        return categoriesDao.findAll();
    }

}
