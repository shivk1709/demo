package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllerExmple {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private CategoriesService categoriesService;
    @Autowired
    private CategoriesDao categoriesDao;

    @GetMapping("/shutdown")
    public void shutdown() {
        ((ConfigurableApplicationContext) context).close();
    }

    @GetMapping
    public String helloMessage() {
        return "hello";
    }

    @GetMapping("/changed")
    public String ApiChanged() {
        return "Succeesfully Changed";
    }

    @GetMapping("/new-change")
    public String newChange() {
        return "New Change";
    }

    @PostMapping("/add")
    private List<Categories> add(@RequestBody Categories categories) {
        return categoriesService.add(categories);
    }

    @GetMapping("/get")
    private List<Categories> findAll() {
        return categoriesDao.findAll();
    }

    @GetMapping("/grid")
    public int getGridCount() {
        Test test = Integer::sum;
        return test.operation(10, 20) < 20 ? test.getGridSize() : test.operation(10, 20);
    }

}
