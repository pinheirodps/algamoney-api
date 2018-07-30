package com.algaworks.alagamoney.api.repository;

import com.algaworks.alagamoney.api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
