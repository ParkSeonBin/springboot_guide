package com.springboot.valid_exception.data.repository;

import com.springboot.valid_exception.data.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
}
