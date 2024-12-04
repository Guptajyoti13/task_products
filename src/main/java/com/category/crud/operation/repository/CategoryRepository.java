package com.category.crud.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.category.crud.operation.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
