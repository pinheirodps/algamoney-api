package com.algaworks.alagamoney.api.resource;

import com.algaworks.alagamoney.api.model.Category;
import com.algaworks.alagamoney.api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoryResource {

    @Autowired
    private CategoryRepository repository;

    @GetMapping
    public List<Category> findAll(){
        return repository.findAll();
    }
}
