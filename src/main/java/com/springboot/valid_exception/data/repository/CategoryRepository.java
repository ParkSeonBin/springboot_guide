package com.springboot.valid_exception.data.repository;

import com.springboot.valid_exception.data.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
