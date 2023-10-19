package com.springboot.valid_exception.data.repository;

import com.springboot.valid_exception.data.entity.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducerRepository extends JpaRepository<Producer, Long> {
}
